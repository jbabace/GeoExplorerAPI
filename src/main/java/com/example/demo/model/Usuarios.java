package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "usuarios")
public class Usuarios {

	@Id
	private String id;
	private String usuario; //NO SE REPITE
	private String contrasena;
	private String nombre;
	private String apellidos;
	private String rol;
	private String avatar;
	private boolean conectado;


	public String getId() {
		return id;
	}
	public String getUsuario() {
		return usuario;
	}
	public String getContrasena() {
		return contrasena;
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
	public boolean isConectado() {
		return conectado;
	}


	public void setId(String id) {
		this.id = id;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
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
	public void setConectado(boolean conectado) {
		this.conectado = conectado;
	}

	public Usuarios(){

	}

	public Usuarios(String id, String usuario, String contrasena, String nombre, String apellidos, String rol,
			String avatar, boolean conectado) {
		this.id = id;
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.rol = rol;
		this.avatar = avatar;
		this.conectado = conectado;
	}

}
