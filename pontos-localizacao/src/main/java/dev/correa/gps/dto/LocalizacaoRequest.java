package dev.correa.gps.dto;

/**
 * Author: Bruno Miguel Correa
 * Email: devsistemascorrea@gmail.com
 * Data: 20/01/2025
 **/

public record LocalizacaoRequest(
		String nome,
		Integer pontoX,
		Integer pontoY
) {
}
