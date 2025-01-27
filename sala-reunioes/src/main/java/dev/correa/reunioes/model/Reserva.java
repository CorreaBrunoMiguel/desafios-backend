package dev.correa.reunioes.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.IDENTITY;

/**
 * Author: Bruno Miguel Correa
 * Email: devsistemascorrea@gmail.com
 * Data: 27/01/2025
 **/

@Entity
@Table(name = "reservas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Reserva {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Long id;
	
	@Column(name = "data", nullable = false)
	private LocalDate data;
	
	@Column(name = "hora_inicio", nullable = false)
	private LocalTime horaInicio;
	
	@Column(name = "hora_termino", nullable = false)
	private LocalTime horaTermino;
	
	@Column(name = "organizador", nullable = false)
	private String organizador;
	
	@ManyToOne(fetch = LAZY)
	@JoinColumn(name = "sala_id",referencedColumnName = "id")
	private Sala sala;
	
}
