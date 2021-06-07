package com.dwa.hotel.servicios;



import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.dwa.hotel.models.Reservacion;

public interface RepoReservacion extends CrudRepository<Reservacion, Integer> {
	@Query(value="SELECT * FROM Reservacion" , nativeQuery = true)
	ArrayList<Reservacion> todos();
}
