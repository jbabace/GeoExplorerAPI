package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.RutaUsuario;

public interface RutaUsuarioRepository extends MongoRepository<RutaUsuario, String>{

	void deleteByRutaId(String id);

	void deleteByUsuarioId(String id);

	List<RutaUsuario> findRutaUsuarioById(String id);

	//List<RutaUsuario> findRutaUsuarioByRutaIdAndOrderByPuntuacion(String id);

}
