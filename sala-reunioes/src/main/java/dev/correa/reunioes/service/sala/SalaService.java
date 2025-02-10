package dev.correa.reunioes.service.sala;

import dev.correa.reunioes.dto.APIResponse;
import dev.correa.reunioes.dto.SalaRequest;

/**
 * Author: Bruno Miguel Correa
 * Email: devsistemascorrea@gmail.com
 * Data: 27/01/2025
 **/

public interface SalaService {
	
	APIResponse criarSala (SalaRequest request);
	APIResponse listarSalas();
	APIResponse deletarSala (Long id);
	APIResponse atualizarSala (SalaRequest request, Long id);
}
