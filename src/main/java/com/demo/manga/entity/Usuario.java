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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long idUsuario;
	
	@Column(name = "NombreUsuario")
	private String nombreUsuario;
	
	@Column(name = "Contrasenia")
	private String contrasenia;
	
	@JoinColumn(name = "IDPersona")
	@OneToOne(fetch = FetchType.LAZY)
	private Persona persona;
	
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
	
	@OneToMany(mappedBy = "usuariomanga")
	private List<UsuarioManga> listaUsuarioManga;

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
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

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
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

	public List<UsuarioManga> getListaUsuarioManga() {
		return listaUsuarioManga;
	}

	public void setListaUsuarioManga(List<UsuarioManga> listaUsuarioManga) {
		this.listaUsuarioManga = listaUsuarioManga;
	}
}
