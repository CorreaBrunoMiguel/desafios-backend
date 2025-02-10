package dev.correa.reunioes.dto;

/**
 * Author: Bruno Miguel Correa
 * Email: devsistemascorrea@gmail.com
 * Data: 27/01/2025
 **/

public record SalaRequest(
		
		String nome,
		Integer capacidade,
		String localizacao
) {
	
	public boolean validarRequest(SalaRequest salaRequest) {
		return salaRequest.nome == null || salaRequest.capacidade == null || salaRequest.localizacao == null;
	}
}
