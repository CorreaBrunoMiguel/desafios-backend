package dev.correa.gps.service;

import dev.correa.gps.dto.LocalizacaoRequest;
import dev.correa.gps.dto.LocalizacaoResponse;
import dev.correa.gps.model.Localizacao;
import dev.correa.gps.repository.LocalizacaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

/**
 * Author: Bruno Miguel Correa
 * Email: devsistemascorrea@gmail.com
 * Data: 20/01/2025
 **/
@Service
@RequiredArgsConstructor
public class ILocalizacaoService implements LocalizacaoService {
	
	private final LocalizacaoRepository repository;
	
	@Override
	public LocalizacaoResponse salvar (LocalizacaoRequest request) {
		if (!validarNome(request.nome())){
			if (!validarLocalizacao(request.pontoX(), request.pontoY())){
				var novaLocalizacao = Localizacao
						.builder()
						.nome(request.nome().toUpperCase())
						.pontoX(request.pontoX())
						.pontoY(request.pontoY())
						.dataCriacao(LocalDate.now())
						.build();
				repository.save(novaLocalizacao);
				return LocalizacaoResponse.builder()
						.status(HttpStatus.CREATED)
						.mensagem("Salvo com sucesso")
						.localizacao(novaLocalizacao)
						.build();
			} else {
				return LocalizacaoResponse.builder()
						.status(HttpStatus.CONFLICT)
						.mensagem("Localizaçao existente!")
						.build();
			}
		} else {
			return LocalizacaoResponse.builder()
					.status(HttpStatus.BAD_REQUEST)
					.mensagem("Nome existente!")
					.build();
		}
	}
	
	private boolean validarLocalizacao (Integer pontoX, Integer pontoY) {
		return repository.existsByPontoXAndPontoY(pontoX, pontoY);
	}
	
	private boolean validarNome (String nome) {
		return repository.existsByNomeIgnoreCase(nome);
	}
	
	@Override
	public LocalizacaoResponse buscarTodos () {
		List<Localizacao> resultado = repository.findAll();
		return LocalizacaoResponse.builder()
				.status(HttpStatus.OK)
				.localizacaoList(resultado)
				.build();
	}
	
	@Override
	public LocalizacaoResponse buscarPorId (Long id) {
		return null;
	}
	
	@Override
	public LocalizacaoResponse buscarPorNome (String nome) {
		return null;
	}
	
	@Override
	public LocalizacaoResponse atualizarNome (String nome, Long id) {
		return null;
	}
	
	@Override
	public void remover (Long id) {
	
	}
	
	@Override
	public LocalizacaoResponse listarPorProximidade (Integer pontoX, Integer pontoY, Integer distancia) {
		int xFinal = pontoX;
		int yFinal = pontoY;
		List<Localizacao> listaLocais = repository.findAll();
		
		if(!listaLocais.isEmpty()){
			List<String> resultado = listaLocais.stream()
					.filter(local -> calcularDistancia(pontoX, pontoY, local.getPontoX(), local.getPontoY()) <= distancia)
					.map(Localizacao::getNome)
					.toList();
			if (!resultado.isEmpty()) {
				return LocalizacaoResponse.builder()
						.status(HttpStatus.OK)
						.locais(resultado)
						.build();
			} else {
				return LocalizacaoResponse.builder()
						.status(HttpStatus.NOT_FOUND)
						.mensagem("Nenhum local localizado distante " + distancia + " unidades.")
						.build();
			}
		}
		return null;
	}
	
	private double calcularDistancia (Integer pontoX, Integer pontoY, Integer pontoX1, Integer pontoY1) {
		return Math.sqrt(Math.pow(pontoX - pontoX1, 2) + Math.pow(pontoY - pontoY1, 2));
	}
}
