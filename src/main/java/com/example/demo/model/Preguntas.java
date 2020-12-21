package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "preguntas")
public class Preguntas {

	@Id
	private String id;
	private String pregunta;
	private String respuesta1;
	private String respuesta2;
	private String respuesta3;
	private int correcta;
	private String imagen;
	private String localizacion_id;

	public String getId() {
		return id;
	}
	public String getPregunta() {
		return pregunta;
	}
	public String getRespuesta1() {
		return respuesta1;
	}
	public String getRespuesta2() {
		return respuesta2;
	}
	public String getRespuesta3() {
		return respuesta3;
	}
	public int getCorrecta() {
		return correcta;
	}
	public String getImagen() {
		return imagen;
	}
	public String getLocalizacion_id() {
		return localizacion_id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}
	public void setRespuesta1(String respuesta1) {
		this.respuesta1 = respuesta1;
	}
	public void setRespuesta2(String respuesta2) {
		this.respuesta2 = respuesta2;
	}
	public void setRespuesta3(String respuesta3) {
		this.respuesta3 = respuesta3;
	}
	public void setCorrecta(int correcta) {
		this.correcta = correcta;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public void setLocalizacion_id(String localizacion_id) {
		this.localizacion_id = localizacion_id;
	}

	public Preguntas(){

	}

	public Preguntas(String id, String pregunta, String respuesta1, String respuesta2, String respuesta3, int correcta,
			String imagen, String localizacion_id) {
		this.id = id;
		this.pregunta = pregunta;
		this.respuesta1 = respuesta1;
		this.respuesta2 = respuesta2;
		this.respuesta3 = respuesta3;
		this.correcta = correcta;
		this.imagen = imagen;
		this.localizacion_id = localizacion_id;
	}



}
