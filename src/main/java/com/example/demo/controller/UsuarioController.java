package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Usuarios;
import com.example.demo.repository.UsuarioRepository;


@RequestMapping("/usuarios")
@RestController
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private MongoTemplate mongoTemplate;

	@PostMapping("/nuevo")
	public void insertarDepartamento(@RequestBody Usuarios nuevoUsuario) {
		usuarioRepository.save(nuevoUsuario);
	}

}
