package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Localizaciones;
import com.example.demo.model.RutaUsuario;
import com.example.demo.repository.LocalizacionRepository;


@RequestMapping("/localizaciones")
@RestController
public class LocalizacionController {

	@Autowired
	private LocalizacionRepository localizacionRepository;

	@Autowired
	private MongoTemplate mongoTemplate;

	/*
	 * CREATE
	 * 			*/
	//Crear una localización nueva
	@PostMapping("/nuevo")
	public void insertarLocalizacion(@RequestBody Localizaciones nuevaLocalizacion) {
		localizacionRepository.save(nuevaLocalizacion);
	}

	/********
	 * READ
	 *******/
	//todas
	@GetMapping("/todas")
	public List<Localizaciones> allLocalizaciones(){
		return localizacionRepository.findAll();
	}

	//por nombre
	@GetMapping("/porNombre/{nombre}")
	public List<Localizaciones> getByName(@PathVariable String nombre) {
		return localizacionRepository.findByNombre(nombre);
	}
	//por id
	@GetMapping("/porId/{id}")
    public Localizaciones getById(@PathVariable String id) {
      return localizacionRepository.findById(id).orElse(null);
    }
	//todos ordenados por el nombre
	@GetMapping("/todosEnOrden")
	 public List<Localizaciones> getLocalizacinoesOrdenados() {
		List<Localizaciones> listaLocalizaciones = localizacionRepository.findAll(Sort.by(Sort.Direction.ASC, "nombre"));
	    return listaLocalizaciones;
	 }

	/*************
	 * UPDATE (edit)
	 *************/
	//Editar una localización
	@PutMapping("/editId/{id}")
	public List<Localizaciones> editarPorId(@PathVariable String id, @RequestBody Localizaciones nuevaLocalizacion) {
		 List<Localizaciones> listaLocalizacioness = localizacionRepository.findAll();
		 for (Localizaciones localizacion : listaLocalizacioness) {
			 if(localizacion.getId().equals(id)){
				 localizacion.setNombre(nuevaLocalizacion.getNombre());
				 localizacion.setLatitud(nuevaLocalizacion.getLatitud());
				 localizacion.setLongitud(nuevaLocalizacion.getLongitud());
				 localizacion.setOculta(nuevaLocalizacion.isOculta());
				 localizacion.setImagen_pista(nuevaLocalizacion.getImagen_pista());
				 localizacion.setListaPreguntas(nuevaLocalizacion.getListaPreguntas());
				 localizacion.setPista(nuevaLocalizacion.getPista());
				 localizacion.setRuta_id(nuevaLocalizacion.getRuta_id());
			 }

		 }

		 return localizacionRepository.saveAll(listaLocalizacioness);
	}
	@PutMapping("/editNombre/{nombre}")
	public List<Localizaciones> editarPorNombre(@PathVariable String nombre, @RequestBody Localizaciones nuevaLocalizacion) {
		 List<Localizaciones> listaLocalizacioness = localizacionRepository.findAll();
		 for (Localizaciones localizacion : listaLocalizacioness) {
			 if(localizacion.getNombre().equals(nombre)){
				 localizacion.setNombre(nuevaLocalizacion.getNombre());
				 localizacion.setLatitud(nuevaLocalizacion.getLatitud());
				 localizacion.setLongitud(nuevaLocalizacion.getLongitud());
				 localizacion.setOculta(nuevaLocalizacion.isOculta());
				 localizacion.setImagen_pista(nuevaLocalizacion.getImagen_pista());
				 localizacion.setListaPreguntas(nuevaLocalizacion.getListaPreguntas());
				 localizacion.setPista(nuevaLocalizacion.getPista());
				 localizacion.setRuta_id(nuevaLocalizacion.getRuta_id());
			 }

		 }

		 return localizacionRepository.saveAll(listaLocalizacioness);

	}

	/*********
	 * DELETE
	 *********/
	//Eliminar TODAS las localizaciones
	 @DeleteMapping("/eliminarTodas") void deleteAll() {
		localizacionRepository.deleteAll();
	}
	//Eliminar UNA localizacion
	@DeleteMapping("/eliminarPorId/{id}") void deleteLocalizacionId(@PathVariable String id) {
		localizacionRepository.deleteById(id);
	}
	//Eliminar localización por nombre
	@DeleteMapping("/eliminarPorNombre/{nombre}") void deleteLocalizacionNombre(@PathVariable String nombre) {
		localizacionRepository.deleteByNombre(nombre);
	}
}
