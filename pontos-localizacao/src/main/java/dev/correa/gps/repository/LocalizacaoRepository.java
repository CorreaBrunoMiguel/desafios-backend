package dev.correa.gps.repository;

import dev.correa.gps.model.Localizacao;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Author: Bruno Miguel Correa
 * Email: devsistemascorrea@gmail.com
 * Data: 20/01/2025
 **/


public interface LocalizacaoRepository extends JpaRepository<Localizacao, Long> {
	
	boolean existsByNomeIgnoreCase (String nome);
	
	boolean existsByPontoXAndPontoY (Integer pontoX, Integer pontoY);
}
