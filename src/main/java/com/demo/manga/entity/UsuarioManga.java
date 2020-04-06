package com.demo.manga.entity;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class UsuarioManga 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long idUsuarioManga;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDUsuario")
	private Usuario usuario;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDManga")
	private Manga manga;
	
	@Column(name = "Estado")
	private Boolean estado;

	public Long getIdUsuarioManga() {
		return idUsuarioManga;
	}

	public void setIdUsuarioManga(Long idUsuarioManga) {
		this.idUsuarioManga = idUsuarioManga;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Manga getManga() {
		return manga;
	}

	public void setManga(Manga manga) {
		this.manga = manga;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
}
