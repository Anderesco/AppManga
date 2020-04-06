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
@Table(name = "mangagenero")
public class MangaGenero 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long idMangaGenero;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDManga")
	private Manga manga;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDGenero")
	private Genero genero;
	
	@Column(name = "Estado")
	private Boolean estado;

	
	public Long getIdMangaGenero() {
		return idMangaGenero;
	}

	public void setIdMangaGenero(Long idMangaGenero) {
		this.idMangaGenero = idMangaGenero;
	}

	public Manga getManga() {
		return manga;
	}

	public void setManga(Manga manga) {
		this.manga = manga;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
}
