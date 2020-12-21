package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Rutas;

public interface RutaRepository extends MongoRepository<Rutas, String>{

	List<Rutas> findByNombre(String nombre);

	void deleteByNombre(String nombre);

	List<Rutas> findAllById(String id);



}
