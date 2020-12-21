package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.RutaUsuario;

public interface RutaUsuarioRepository  extends MongoRepository<RutaUsuario, String>{

}
