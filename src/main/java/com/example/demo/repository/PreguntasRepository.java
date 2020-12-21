package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Preguntas;

public interface PreguntasRepository  extends MongoRepository<Preguntas, String>{

}
