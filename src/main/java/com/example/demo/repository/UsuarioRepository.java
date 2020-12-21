package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Usuarios;

public interface UsuarioRepository  extends MongoRepository<Usuarios, String>{

}
