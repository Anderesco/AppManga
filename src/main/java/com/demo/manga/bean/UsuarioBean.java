package com.demo.manga.bean;

import java.io.Serializable;

public class UsuarioBean implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String nombreUsuario;
	private String contrasenia;
	private RolBean nombreRol;
	
	public UsuarioBean() {
		super();
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public RolBean getNombreRol() {
		return nombreRol;
	}
	public void setNombreRol(RolBean nombreRol) {
		this.nombreRol = nombreRol;
	}

	@Override
	public String toString() {
		return "UsuarioBean {" + "\n" +
			   "nombreUsuario=" + nombreUsuario + ",\n" +
			   "contrasenia=" + contrasenia + ",\n " + 
			   "nombreRol=" + nombreRol + "\n" +
			   "}";
	}
	
}
