package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.RutaUsuario;
import com.example.demo.repository.RutaUsuarioRepository;

@RequestMapping("/rutaUsuario")
@RestController
public class RutaUsuarioController {

	@Autowired
	private RutaUsuarioRepository rutaUsuarioRepository;

	@Autowired
	private MongoTemplate mongoTemplate;

	/**************************************************/
	/******************** INSERTAR ********************/
	/**************************************************/

	@PostMapping("/new")
	public void insertarUsuario(@RequestBody RutaUsuario nuevaRutaUsuario) {
		rutaUsuarioRepository.save(nuevaRutaUsuario);
	}

	/**************************************************/
	/********************** LEER **********************/
	/**************************************************/

	@GetMapping("/all")
	public List<RutaUsuario> getRutaUsuario() {
		List<RutaUsuario> listaRutasUsuarios = rutaUsuarioRepository.findAll();
		return listaRutasUsuarios;
	}

	@GetMapping("/getById/{id}")
	public Optional<RutaUsuario> getById(@PathVariable String id){
		return rutaUsuarioRepository.findById(id);
	}

	//lo mismo que el getById, pero en vez de un optional, devuelve un list
	@GetMapping("/getAllById/{id}")
	public List<RutaUsuario> getAllById(@PathVariable String id) {
		return rutaUsuarioRepository.findRutaUsuarioById(id);
	}


	/*Hace falta comprobar que funciona, que esto ayudara al ranking*/
	@GetMapping("/getAllByRutaId/{id}")
	public List<RutaUsuario> getAllByRutaId(@PathVariable String id) {
		return rutaUsuarioRepository.findRutaUsuarioByRutaIdOrderByPuntuacion(id);
	}


	/**************************************************/
	/******************* MODIFICAR ********************/
	/**************************************************/


	@PutMapping("/updatePuntuacion/{id}/{puntuacion}")
	public void updatePuntuacion(@PathVariable String id, @PathVariable int puntuacion) {

		Query query = new Query(Criteria.where("id").is(id));
		Update update = new Update().inc("puntuacion", puntuacion);
		mongoTemplate.updateFirst(query, update, RutaUsuario.class);

	 }


	@PutMapping("/rutaUsuarioActivar/{id}")
	public void conectarUsuario(@PathVariable String id){

		Query query = new Query(Criteria.where("id").is(id));
		Update update = new Update().set("activo", true);
		mongoTemplate.updateFirst(query, update, RutaUsuario.class);

	}

	@PutMapping("/rutaUsuarioDesactivar/{id}")
	public void desconectarUsuario(@PathVariable String id){

		Query query = new Query(Criteria.where("id").is(id));
		Update update = new Update().set("activo", false);
		mongoTemplate.updateFirst(query, update, RutaUsuario.class);

	}


	/**************************************************/
	/********************* BORRAR *********************/
	/**************************************************/

	@DeleteMapping("/deleteById/{id}")
	public void delete(@PathVariable String id) {
		rutaUsuarioRepository.deleteById(id);
	}

	@DeleteMapping("/deleteByUsuarioId/{id}")
	public void deleteByUsuarioId(@PathVariable String id) {
		rutaUsuarioRepository.deleteByUsuarioId(id);
	}

	@DeleteMapping("/deleteByRutaId/{id}")
	public void deleteByRutaId(@PathVariable String id) {
		rutaUsuarioRepository.deleteByRutaId(id);
	}

	//si te cansas de la vida y quieres borrar todo
	@DeleteMapping("/deleteAll")
	public void deleteUsuarios(){
		rutaUsuarioRepository.deleteAll();
	}

}
