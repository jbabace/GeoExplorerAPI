package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Localizaciones;

public interface LocalizacionRepository  extends MongoRepository<Localizaciones, String>{

}
