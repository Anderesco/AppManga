package com.demo.manga.service.hibernate;

import java.util.List;

import com.demo.manga.bean.CapitulosMangaBean;
import com.demo.manga.bean.MangaBean;

public interface MangaService
{
    List<MangaBean> ObtenerListaDeMangas(Long ID);
    
    String[] ObtenerGenerosPorManga(Long ID);
    
    List<CapitulosMangaBean> ObtenerCapitulosManga(Long ID);
}
