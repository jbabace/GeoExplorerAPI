package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "usuarios")
public class Usuarios {

	@Id
	private String id;
	private String usuario;
	private String contraseña;
	private String nombre;
	private String apellidos;
	private String rol;
	private String avatar;

	public String getId() {
		return id;
	}
	public String getUsuario() {
		return usuario;
	}
	public String getContraseña() {
		return contraseña;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public String getRol() {
		return rol;
	}
	public String getAvatar() {
		return avatar;
	}

	public void setId(String id) {
		this.id = id;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Usuarios(){

	}

	public Usuarios(String id, String usuario, String contraseña, String nombre, String apellidos, String rol,
			String avatar) {
		this.id = id;
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.rol = rol;
		this.avatar = avatar;
	}



}
