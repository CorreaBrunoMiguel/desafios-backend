package dev.correa.gps.controller;

import dev.correa.gps.dto.LocalizacaoRequest;
import dev.correa.gps.dto.LocalizacaoResponse;
import dev.correa.gps.service.ILocalizacaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

/**
 * Author: Bruno Miguel Correa
 * Email: devsistemascorrea@gmail.com
 * Data: 20/01/2025
 **/

@RestController
@RequestMapping("api/localizacoes")
@RequiredArgsConstructor
public class LocalizacaoController {
	
	private final ILocalizacaoService service;
	
	@PostMapping
	public ResponseEntity<LocalizacaoResponse> post (@RequestBody LocalizacaoRequest request) {
		LocalizacaoResponse response = service.salvar(request);
		return ResponseEntity.ok(response);
	}
	
	@GetMapping
	public ResponseEntity<LocalizacaoResponse> list () {
		LocalizacaoResponse response = service.buscarTodos();
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/proximos/{distancia}")
	public ResponseEntity<LocalizacaoResponse> proximo (@PathVariable Integer distancia,
	                                                    @RequestParam Integer pontoX, @RequestParam Integer pontoY) {
		LocalizacaoResponse response = service.listarPorProximidade(pontoX, pontoY, distancia);
		return ResponseEntity.ok(response);
	}
}
