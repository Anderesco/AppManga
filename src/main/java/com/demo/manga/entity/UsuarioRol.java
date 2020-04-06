package com.demo.manga.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuariorol")
public class UsuarioRol 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long idUsuarioRol;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDUsuario")
	private Usuario usuario;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDRol")
	private Rol rol;
	
	@Column(name = "Estado")
	private Boolean estado;

	
	public Long getIdUsuarioRol() {
		return idUsuarioRol;
	}

	public void setIdUsuarioRol(Long idUsuarioRol) {
		this.idUsuarioRol = idUsuarioRol;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
}
