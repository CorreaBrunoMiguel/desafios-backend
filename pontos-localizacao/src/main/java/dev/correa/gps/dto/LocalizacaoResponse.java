package dev.correa.gps.dto;

import dev.correa.gps.model.Localizacao;
import org.springframework.http.HttpStatus;

/**
 * Author: Bruno Miguel Correa
 * Email: devsistemascorrea@gmail.com
 * Data: 20/01/2025
 **/

public class LocalizacaoResponse {
	HttpStatus status;
	String mensagem;
	Localizacao localizacao;
}
