package dev.correa.reunioes.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

import static jakarta.persistence.CascadeType.ALL;
import static jakarta.persistence.GenerationType.IDENTITY;

/**
 * Author: Bruno Miguel Correa
 * Email: devsistemascorrea@gmail.com
 * Data: 27/01/2025
 **/

@Entity
@Table(name = "salas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Sala {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Long id;
	
	@Column(name = "nome", nullable = false, unique = true)
	private String nome;
	
	@Column(name = "capacidade", nullable = false)
	private int capacidade;
	
	@Column(name = "localizacao", nullable = false)
	private String localizacao;
	
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	
	@Column(name = "updated_at")
	private LocalDateTime updatedAt;
	
	@OneToMany(mappedBy = "sala", cascade = ALL, orphanRemoval = true)
	private List<Reserva> reservas;
}
