package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Localizaciones;

public interface LocalizacionRepository  extends MongoRepository<Localizaciones, String>{

	List<Localizaciones> findByNombre(String nombre);

	void deleteById(String id);

}
