package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Usuarios;

public interface UsuarioRepository  extends MongoRepository<Usuarios, String>{


	List<Usuarios> findByUsuario(String usuario);

	void deleteByUsuario(String usuario);

	List<Usuarios> findUsuarioById(String id);

}
