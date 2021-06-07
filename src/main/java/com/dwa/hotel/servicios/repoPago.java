package com.dwa.hotel.servicios;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.dwa.hotel.models.Pagos;


public interface repoPago extends CrudRepository<Pagos, Integer> {
	@Query(value="SELECT * FROM Pagos" , nativeQuery = true)
	ArrayList<Pagos> todos();
	

}
