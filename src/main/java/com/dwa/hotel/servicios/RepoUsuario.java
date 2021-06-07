package com.dwa.hotel.servicios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.dwa.hotel.models.Usuarios;

public interface RepoUsuario extends CrudRepository <Usuarios, Integer> {
	@Query(value = "SELECT * FROM Usuarios WHERE CorreoE = ?1 AND ClaveAcceso = ?2 ", nativeQuery = true)
	Usuarios validar(String CorreoE, byte[] ClaveAcceso);  
}
