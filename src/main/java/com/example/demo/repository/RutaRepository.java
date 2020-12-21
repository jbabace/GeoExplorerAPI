package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Rutas;

public interface RutaRepository extends MongoRepository<Rutas, String>{



}
