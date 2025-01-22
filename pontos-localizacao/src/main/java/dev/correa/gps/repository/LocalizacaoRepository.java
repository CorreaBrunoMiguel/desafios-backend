package dev.correa.gps.repository;

import dev.correa.gps.model.Localizacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Author: Bruno Miguel Correa
 * Email: devsistemascorrea@gmail.com
 * Data: 20/01/2025
 **/


public interface LocalizacaoRepository extends JpaRepository<Localizacao, Long> {
	
	boolean existsByNomeIgnoreCase (String nome);
	
	boolean existsByPontoXAndPontoY (Integer pontoX, Integer pontoY);
	
}
