package com.demo.manga.service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.manga.bean.MangaBean;
import com.demo.manga.dao.MangaRepository;
import com.demo.manga.service.hibernate.MangaService;

@Service("mangaservice")
public class MangaServiceImpl implements MangaService
{
    @Autowired
    MangaRepository mangaRepositorio;
    
    @Override
    public List<MangaBean> ObtenerListaDeMangas(Long ID) 
    {
        return this.mangaRepositorio.ObtenerMangas()
        		.parallelStream()
        		.filter(manga -> ID == manga.getIdManga())
        		.map(manga -> {
		            MangaBean mangaBean = new MangaBean();
		            mangaBean.setNombre1(manga.getNombreManga());
		            mangaBean.setNombre2(manga.getNombreManga2());
		            mangaBean.setAutores(manga.getAutores());
		            mangaBean.setAño(manga.getAnio());
		            mangaBean.setDescripcion(manga.getDescripcion());
		            mangaBean.setEstadoActual(manga.getEstadoActual());
		            mangaBean.setCapitulos(manga.getCapitulos());
		            mangaBean.setPrecuela(manga.getPrecuela());
		            mangaBean.setSecuela(manga.getSecuela());
		            mangaBean.setListaCapitulos(this.ObtenerCapitulos(manga.getIdManga()));
		            mangaBean.setGenero(this.ObtenerGenerosPorManga(manga.getIdManga()));
		            
		            return mangaBean;
		            }).collect(Collectors.toList());
    }
    
    @Override
    public String[] ObtenerGenerosPorManga(Long ID) 
    {
        List<String[]> listaGenero = mangaRepositorio.ObtenerGeneroDeMangas(ID);
        String[] generoArray = new String[listaGenero.size()];
        generoArray = listaGenero.toString().replace("[", "").replace("]", "").replace(" ", "").split(",");
        
        return generoArray;
    }
	
	@Override
	public Map<Double, String> ObtenerCapitulos(Long ID)
	{
		Map<Double, String> map = new TreeMap<Double, String>();
		
		for(Object[] objeto : mangaRepositorio.ObtenerCapitulosMangaPorId(ID))
			map.put((Double) objeto[0], (String) objeto[1]);
		
		return map;
	}
}
