package com.example.demo.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Preguntas;
import com.example.demo.model.Rutas;
import com.example.demo.repository.PreguntasRepository;

@RequestMapping("/preguntas")
@RestController
public class PreguntaController {
	@Autowired
	private PreguntasRepository PreguntaRepository;

	@Autowired
	private MongoTemplate mongoTemplate;

	/***********************CREAR***********************/

	@PostMapping("/nuevo")
	public void insertarPregunta(@RequestBody Preguntas nuevaPregunta) {
		PreguntaRepository.save(nuevaPregunta);
	}

	/***********************LEER***********************/

	@GetMapping("/leer")
	public List<Preguntas> leerRutas() {
		return PreguntaRepository.findAll();
	}

	@GetMapping("/leer/{id}")
	public Optional<Preguntas> leerPreguntaId(@PathVariable String id) {
		return PreguntaRepository.findById(id);
	}

	/***********************EDITAR***********************/

	@PutMapping("/editar/{id}")
	public List<Preguntas> editarPreguntaId(@PathVariable String id, @RequestBody Preguntas pregunta){
		List<Preguntas> preguntas = PreguntaRepository.findAllById(id);
		for (Preguntas pregunta1 : preguntas){
			pregunta1.setPregunta(pregunta.getPregunta());
			pregunta1.setRespuesta1(pregunta.getRespuesta1());
			pregunta1.setRespuesta2(pregunta.getRespuesta3());
			pregunta1.setRespuesta2(pregunta.getRespuesta3());
			pregunta1.setCorrecta(pregunta.getCorrecta());
			pregunta1.setImagen(pregunta.getImagen());
			pregunta1.setLocalizacion_id(pregunta.getLocalizacion_id());
		}
		return PreguntaRepository.saveAll(preguntas);
	}


	/***********************ELIMINAR***********************/

	@DeleteMapping("/eliminar")
	public void eliminarPregunta(@RequestBody Preguntas pregunta) {
		PreguntaRepository.deleteAll();
	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminarPreguntaId(@PathVariable String id) {
		PreguntaRepository.deleteById(id);
	}

}
