package com.demo.manga.entity;

import java.util.Date;

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
@Table(name = "paginamanga")
public class PaginaManga 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long idPaginaManga;
	
	@Column(name = "NumeroPagina")
	private Integer numeroPagina;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDCapitulo")
	private CapituloManga idCapitulo;
	
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

	
	public Long getIdPaginaManga() {
		return idPaginaManga;
	}

	public void setIdPaginaManga(Long idPaginaManga) {
		this.idPaginaManga = idPaginaManga;
	}

	public Integer getNumeroPagina() {
		return numeroPagina;
	}

	public void setNumeroPagina(Integer numeroPagina) {
		this.numeroPagina = numeroPagina;
	}

	public CapituloManga getIdCapitulo() {
		return idCapitulo;
	}

	public void setIdCapitulo(CapituloManga idCapitulo) {
		this.idCapitulo = idCapitulo;
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
}
