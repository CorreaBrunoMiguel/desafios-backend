package dev.correa.reunioes.controller;

import dev.correa.reunioes.dto.APIResponse;
import dev.correa.reunioes.dto.SalaRequest;
import dev.correa.reunioes.model.Sala;
import dev.correa.reunioes.service.sala.ISalaService;
import dev.correa.reunioes.service.sala.SalaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Bruno Miguel Correa
 * Email: devsistemascorrea@gmail.com
 * Data: 31/01/2025
 **/

@RestController
@RequestMapping("/api/salas")
@RequiredArgsConstructor
public class SalaController {
	
	private final ISalaService salaService;
	
	@PostMapping
	public ResponseEntity<APIResponse> sala (@RequestBody SalaRequest request) {
		var response = salaService.criarSala(request);
		return ResponseEntity.ok(response);
	}
}
