package dev.correa.gps.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Author: Bruno Miguel Correa
 * Email: devsistemascorrea@gmail.com
 * Data: 20/01/2025
 **/

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public record LocalizacaoRequest(
		String nome,
		Integer pontoX,
		Integer pontoY
) {
}
