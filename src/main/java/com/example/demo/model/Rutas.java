package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "rutas")
public class Rutas {

	@Id
	private String id;
	private String nombre;
	private String ciudad;
	private String tematica;
	private float duracion;
	private String descripcion;
	private String transporte; //DUDA
	private String imagen;
	private int dificultad; //DUDA

	public String getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public String getTematica() {
		return tematica;
	}
	public float getDuracion() {
		return duracion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public String getTransporte() {
		return transporte;
	}
	public String getImagen() {
		return imagen;
	}
	public int getDificultad() {
		return dificultad;
	}

	public void setId(String id) {
		this.id = id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public void setTematica(String tematica) {
		this.tematica = tematica;
	}
	public void setDuracion(float duracion) {
		this.duracion = duracion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setTransporte(String transporte) {
		this.transporte = transporte;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}

	public Rutas(){

	}

	public Rutas(String id, String nombre, String ciudad, String tematica, float duracion, String descripcion,
			String transporte, String imagen, int dificultad) {
		this.id = id;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.tematica = tematica;
		this.duracion = duracion;
		this.descripcion = descripcion;
		this.transporte = transporte;
		this.imagen = imagen;
		this.dificultad = dificultad;
	}



}
