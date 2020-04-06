package com.demo.manga.bean;

import java.io.Serializable;
import java.util.List;

public class MangaBean implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String nombre1;
	private String nombre2;
	private String autores;
	private Integer anio;
	private String estadoActual;
	private Integer capitulos;
	private String descripcion;
	private List<String> nombreGenero;
	private List<String> listaCapitulos;
	
	
	public MangaBean() {
		super();
	}
	
	public String getNombre1() {
		return nombre1;
	}
	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}
	public String getNombre2() {
		return nombre2;
	}
	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public List<String> getNombreGenero() {
		return nombreGenero;
	}
	public void setNombreGenero(List<String> nombreGenero) {
		this.nombreGenero = nombreGenero;
	}
	public List<String> getListaCapitulos() {
		return listaCapitulos;
	}
	public void setListaCapitulos(List<String> listaCapitulos) {
		this.listaCapitulos = listaCapitulos;
	}

	@Override
	public String toString() 
	{
		return "MangaBean {\n" +
			   "nombre1=" + nombre1 + ",\n" +
			   "nombre2=" + nombre2 + ",\n " +
			   "autores=" + autores + ",\n " +
			   "anio=" + anio + ",\n " +
			   "estadoActual=" + estadoActual + ",\n " +
			   "capitulos=" + capitulos + ", " +
			   "descripcion=" + descripcion+ ",\n" +
			   "nombreGenero=" + nombreGenero + ", " +
			   "listaCapitulos=" + listaCapitulos + "\n}";
	}
	
	
}
