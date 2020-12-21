package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Localizaciones;
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
	public void insertarDepartamento(@RequestBody Localizaciones nuevaLocalizacion) {
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
	@GetMapping("/porLocalizacion/{nombre}")
	public List<Localizaciones> getByName(@PathVariable String nombre) {
		return localizacionRepository.findByNombre(nombre);
	}
	//por id
	@GetMapping("/porId/{id}")
    public Localizaciones getEmpleados(@PathVariable String id) {
      return localizacionRepository.findById(id).orElse(null);
    }
	//todos ordenados por el nombre
	@GetMapping("/todosEnOrden")
	 public List<Localizaciones> getLocalizacinoesOrdenados() {
		List<Localizaciones> listaLocalizaciones = localizacionRepository.findAll(Sort.by(Sort.Direction.DESC, "nombre"));
	    return listaLocalizaciones;
	 }
	
	/*************
	 * UPDATE (edit)
	 *************/
	//Editar una localización
	 @PutMapping("/edit/{id}")
	 public List<Localizaciones> bajarSalario(@PathVariable String id, @RequestBody Localizaciones nuevaLocalizacion) {		  
		   
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
	 
	/*********
	 * DELETE
	 *********/
	//Eliminar TODAS las localizaciones
	 @DeleteMapping("/eliminarTodas") void deleteAll() {
		localizacionRepository.deleteAll();
	}
	//Eliminar UNA localizacion
	@DeleteMapping("/eliminarLocalizacion/{id}") void deleteEmp(@PathVariable String id) {
		localizacionRepository.deleteById(id);
	}
}
