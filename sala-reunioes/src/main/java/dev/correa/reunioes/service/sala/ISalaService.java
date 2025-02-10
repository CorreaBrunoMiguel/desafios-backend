package dev.correa.reunioes.service.sala;

import dev.correa.reunioes.dto.APIResponse;
import dev.correa.reunioes.dto.SalaRequest;
import dev.correa.reunioes.model.Sala;
import dev.correa.reunioes.repository.SalaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * Author: Bruno Miguel Correa
 * Email: devsistemascorrea@gmail.com
 * Data: 27/01/2025
 **/

@Service
@RequiredArgsConstructor
public class ISalaService implements SalaService {
	
	private final SalaRepository salaRepository;
	
	@Override
	public APIResponse criarSala (SalaRequest request) {
		if (request.validarRequest(request)){
			var sala = Sala.builder()
					.nome(request.nome())
					.localizacao(request.localizacao())
					.capacidade(request.capacidade())
					.createdAt(LocalDateTime.now())
					.build();
			salaRepository.save(sala);
			return APIResponse.builder()
					.status(HttpStatus.CREATED)
					.message("Sala criada com sucesso")
					.build();
		} else {
			return APIResponse.builder()
					.status(HttpStatus.BAD_REQUEST)
					.message("Nome/capaciade/localizaçao sao obrigatorios.")
					.build();
		}
		
	}
	
	@Override
	public APIResponse listarSalas () {
		return null;
	}
	
	@Override
	public APIResponse deletarSala (Long id) {
		return null;
	}
	
	@Override
	public APIResponse atualizarSala (SalaRequest request, Long id) {
		return null;
	}
}
