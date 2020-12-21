package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "rutaUsuario")
public class RutaUsuario {

	@Id
	private String id;
	private String usuario_id;
	private String ruta_id;
	private int puntuacion;

	public String getId() {
		return id;
	}
	public String getUsuario_id() {
		return usuario_id;
	}
	public String getRuta_id() {
		return ruta_id;
	}
	public int getPuntuacion() {
		return puntuacion;
	}

	public void setId(String id) {
		this.id = id;
	}
	public void setUsuario_id(String usuario_id) {
		this.usuario_id = usuario_id;
	}
	public void setRuta_id(String ruta_id) {
		this.ruta_id = ruta_id;
	}
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public RutaUsuario(){

	}

	public RutaUsuario(String id, String usuario_id, String ruta_id, int puntuacion) {
		super();
		this.id = id;
		this.usuario_id = usuario_id;
		this.ruta_id = ruta_id;
		this.puntuacion = puntuacion;
	}


}
