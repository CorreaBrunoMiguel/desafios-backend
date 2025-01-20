package dev.correa.gps.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

import static jakarta.persistence.GenerationType.IDENTITY;

/**
 * Author: Bruno Miguel Correa
 * Email: devsistemascorrea@gmail.com
 * Data: 20/01/2025
 **/

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "localizacoes")
public class Localizacao {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Long id;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "ponto_x", nullable = false, updatable = false)
	private Integer localizacaoX;
	
	@Column(name = "ponto_y", nullable = false, updatable = false)
	private Integer localizacaoY;
	
	@Column(name = "data_criacao", updatable = false)
	private LocalDate dataCriacao;
	
	@Column(name = "data_atualizacao", updatable = false)
	private LocalDate dataAtualizacao;
}
