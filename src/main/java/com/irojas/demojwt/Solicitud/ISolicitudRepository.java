package com.irojas.demojwt.Solicitud;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface ISolicitudRepository  extends JpaRepository<Solicitud, Integer>{
	/*
	 * @Query(value =
	 * "SELECT a FROM Atencion a WHERE FUNCTION('DATE', a.fechaAtencion) = :date")
	 * public List<Solicitud> findByDate(@Param("date") Date date);
	 */
	
	

}
