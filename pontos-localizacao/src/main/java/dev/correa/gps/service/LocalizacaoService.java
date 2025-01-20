package dev.correa.gps.service;

import dev.correa.gps.dto.LocalizacaoRequest;
import dev.correa.gps.dto.LocalizacaoResponse;

/**
 * Author: Bruno Miguel Correa
 * Email: devsistemascorrea@gmail.com
 * Data: 20/01/2025
 **/

public interface LocalizacaoService {
	
	LocalizacaoResponse salvar(LocalizacaoRequest request);
	
	LocalizacaoResponse buscarTodos();
	LocalizacaoResponse buscarPorId(Long id);
	LocalizacaoResponse buscarPorNome(String nome);
	
	LocalizacaoResponse atualizarNome(String nome, Long id);
	
	void remover(Long id);
	
}
