package com.demo.manga.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "capitulomanga")
public class CapituloManga 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long idCapituloManga;
	
	@Column(name = "NumeroCapitulo")
	private Integer numeroCapitulo;
	
	@Column(name = "NombreCapitulo")
	private String nombreCapitulo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDManga")
	private Manga idManga;
	
	@Column(name = "Path")
	private String path;
	
	@Column(name = "UsuarioCreacion")
	private Long idUsuarioCreacion;
	
	@Column(name = "FechaCreacion")
	private Date fechaCreacion;
	
	@Column(name = "UsuarioModificacion")
	private Long idUsuarioModificacion;
	
	@Column(name = "FechaModificacion")
	private Date fechaModificacion;
	
	@Column(name = "Estado")
	private Boolean estado;
	
	@OneToMany(fetch = FetchType.LAZY)
	private List<PaginaManga> listaPaginaManga;

	public Long getIdGenero() {
		return idCapituloManga;
	}

	public void setIdGenero(Long idCapituloManga) {
		this.idCapituloManga = idCapituloManga;
	}

	public Integer getNumeroCapitulo() {
		return numeroCapitulo;
	}

	public void setNumeroCapitulo(Integer numeroCapitulo) {
		this.numeroCapitulo = numeroCapitulo;
	}

	public String getNombreCapitulo() {
		return nombreCapitulo;
	}

	public void setNombreCapitulo(String nombreCapitulo) {
		this.nombreCapitulo = nombreCapitulo;
	}

	public Manga getIdManga() {
		return idManga;
	}

	public void setIdManga(Manga idManga) {
		this.idManga = idManga;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Long getIdUsuarioCreacion() {
		return idUsuarioCreacion;
	}

	public void setIdUsuarioCreacion(Long idUsuarioCreacion) {
		this.idUsuarioCreacion = idUsuarioCreacion;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Long getIdUsuarioModificacion() {
		return idUsuarioModificacion;
	}

	public void setIdUsuarioModificacion(Long idUsuarioModificacion) {
		this.idUsuarioModificacion = idUsuarioModificacion;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public List<PaginaManga> getListaPaginaManga() {
		return listaPaginaManga;
	}

	public void setListaCapituloManga(List<PaginaManga> listaPaginaManga) {
		this.listaPaginaManga = listaPaginaManga;
	}
}
