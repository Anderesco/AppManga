package com.demo.manga.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "manga")
public class Manga 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long idManga;
	
	@Column(name = "NombreManga")
	private String nombreManga;
	
	@Column(name = "NombreManga2")
	private String nombreManga2;
	
	@Column(name = "EstadoActual")
	private String estadoActual;
	
	@Column(name = "Capitulos")
	private Integer capitulos;
	
	@Column(name = "ImagenPortadaRuta")
	private String portadaRuta;
	
	@Column(name = "Descripcion")
	private String descripcion;
	
	@Column(name = "Autores")
	private String autores;
	
	@Column(name = "Anio")
	private Integer anio;
	
	@Column(name = "RutaManga")
	private String rutaManga;
	
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
	
	@Column(name = "Precuela")
    private String precuela;
	
    @Column(name = "Secuela")
    private String secuela;
	
	@OneToMany(mappedBy = "manga", fetch = FetchType.LAZY)
	private List<MangaGenero> listaMangaGenero;
	
	@OneToMany(mappedBy = "idManga", fetch = FetchType.LAZY)
	private List<CapituloManga> listaCapitulosManga;
	
	@OneToMany(mappedBy = "manga", fetch = FetchType.LAZY)
	private List<UsuarioManga> listaUsuarioManga;

	
	public Long getIdManga() {
		return idManga;
	}

	public void setIdManga(Long idManga) {
		this.idManga = idManga;
	}

	public String getNombreManga() {
		return nombreManga;
	}

	public void setNombreManga(String nombreManga) {
		this.nombreManga = nombreManga;
	}

	public String getNombreManga2() {
		return nombreManga2;
	}

	public void setNombreManga2(String nombreManga2) {
		this.nombreManga2 = nombreManga2;
	}

	public String getEstadoActual() {
		return estadoActual;
	}

	public void setEstadoActual(String estadoActual) {
		this.estadoActual = estadoActual;
	}

	public Integer getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(Integer capitulos) {
		this.capitulos = capitulos;
	}

	public String getPortadaRuta() {
		return portadaRuta;
	}

	public void setPortadaRuta(String portadaRuta) {
		this.portadaRuta = portadaRuta;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getAutores() {
		return autores;
	}

	public void setAutores(String autores) {
		this.autores = autores;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public String getRutaManga() {
		return rutaManga;
	}

	public void setRutaManga(String rutaManga) {
		this.rutaManga = rutaManga;
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

	public String getPrecuela() {
		return precuela;
	}

	public void setPrecuela(String precuela) {
		this.precuela = precuela;
	}

	public String getSecuela() {
		return secuela;
	}

	public void setSecuela(String secuela) {
		this.secuela = secuela;
	}

	public List<MangaGenero> getListaMangaGenero() {
		return listaMangaGenero;
	}

	public void setListaMangaGenero(List<MangaGenero> listaMangaGenero) {
		this.listaMangaGenero = listaMangaGenero;
	}

	public List<CapituloManga> getListaCapitulosManga() {
		return listaCapitulosManga;
	}

	public void setListaCapitulosManga(List<CapituloManga> listaCapitulosManga) {
		this.listaCapitulosManga = listaCapitulosManga;
	}

	public List<UsuarioManga> getListaUsuarioManga() {
		return listaUsuarioManga;
	}

	public void setListaUsuarioManga(List<UsuarioManga> listaUsuarioManga) {
		this.listaUsuarioManga = listaUsuarioManga;
	}

}
