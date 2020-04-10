package com.demo.manga.service.hibernate;

import java.util.List;
import java.util.Map;

import com.demo.manga.bean.MangaBean;

public interface MangaService
{
    public List<MangaBean> ObtenerListaDeMangas(Long ID);
    
    public String[] ObtenerGenerosPorManga(Long ID);

	public Map<Double, String> ObtenerCapitulos(Long ID);
}
