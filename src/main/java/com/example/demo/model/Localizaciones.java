package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "localizaciones")
public class Localizaciones {

	@Id
	private String id;
	private String nombre;
	private float latitud;
	private float longitud;
	private boolean oculta;
	private String pista;
	private String imagen_pista;
	private String ruta_id;

	public String getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public float getLatitud() {
		return latitud;
	}
	public float getLongitud() {
		return longitud;
	}
	public boolean isOculta() {
		return oculta;
	}
	public String getPista() {
		return pista;
	}
	public String getImagen_pista() {
		return imagen_pista;
	}
	public String getRuta_id() {
		return ruta_id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setLatitud(float latitud) {
		this.latitud = latitud;
	}
	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}
	public void setOculta(boolean oculta) {
		this.oculta = oculta;
	}
	public void setPista(String pista) {
		this.pista = pista;
	}
	public void setImagen_pista(String imagen_pista) {
		this.imagen_pista = imagen_pista;
	}
	public void setRuta_id(String ruta_id) {
		this.ruta_id = ruta_id;
	}

	public Localizaciones() {

	}

	public Localizaciones(String id, String nombre, float latitud, float longitud, boolean oculta, String pista, String imagen_pista, String ruta_id) {
		this.id = id;
		this.nombre = nombre;
		this.latitud = latitud;
		this.longitud = longitud;
		this.oculta = oculta;
		this.pista = pista;
		this.imagen_pista = imagen_pista;
		this.ruta_id = ruta_id;
	}



}
