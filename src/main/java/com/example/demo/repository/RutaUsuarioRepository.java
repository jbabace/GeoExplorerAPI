package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.RutaUsuario;

public interface RutaUsuarioRepository  extends MongoRepository<RutaUsuario, String>{

	void deleteByUsuario_id(String id);

	void deleteByRuta_id(String id);

	List<RutaUsuario> findRutaUsuarioById(String id);

	List<RutaUsuario> findRutaUsuarioByRuta_idAndOrderByPuntuacion(String id);

}
