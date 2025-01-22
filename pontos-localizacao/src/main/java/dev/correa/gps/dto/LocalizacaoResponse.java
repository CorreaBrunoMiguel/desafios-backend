package dev.correa.gps.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import dev.correa.gps.model.Localizacao;
import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.util.List;

/**
 * Author: Bruno Miguel Correa
 * Email: devsistemascorrea@gmail.com
 * Data: 20/01/2025
 **/

@Getter
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocalizacaoResponse {
	HttpStatus status;
	String mensagem;
	Localizacao localizacao;
	List<Localizacao> localizacaoList;
	List<String> locais;
}
