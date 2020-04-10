package com.demo.manga.bean;

public class CapitulosMangaBean
{
    private Double numeroCapitulo;
    private String nombreCapitulo;
    
    public CapitulosMangaBean(final Double numeroCapitulo, final String nombreCapitulo) {
        this.numeroCapitulo = numeroCapitulo;
        this.nombreCapitulo = nombreCapitulo;
    }
    
    public CapitulosMangaBean() {
    }
    
    public Double getNumeroCapitulo() {
        return this.numeroCapitulo;
    }
    
    public void setNumeroCapitulo(final Double numeroCapitulo) {
        this.numeroCapitulo = numeroCapitulo;
    }
    
    public String getNombreCapitulo() {
        return this.nombreCapitulo;
    }
    
    public void setNombreCapitulo(final String nombreCapitulo) {
        this.nombreCapitulo = nombreCapitulo;
    }
    
    @Override
    public String toString() {
        return "CapitulosMangaBean {\n" +
        		"numeroCapitulo=" + numeroCapitulo + ",\n" +
        		"nombreCapitulo=" + nombreCapitulo + "\n" +
        		"}";
    }
}
