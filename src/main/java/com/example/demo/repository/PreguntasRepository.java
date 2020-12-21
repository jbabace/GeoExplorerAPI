package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Preguntas;
import com.example.demo.model.Rutas;

public interface PreguntasRepository  extends MongoRepository<Preguntas, String>{

	List<Preguntas> findAllById(String id);

}
