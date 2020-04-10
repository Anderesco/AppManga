package com.demo.manga.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;

import com.demo.manga.bean.CapitulosMangaBean;
import com.demo.manga.service.hibernate.MangaService;
import com.demo.manga.bean.MangaBean;

import org.springframework.stereotype.Controller;

@Controller
public class MangaController
{
    @Autowired
    private MangaService mangaService;
    
    @ResponseBody
    @PostMapping({ "/manga" })
    public List<MangaBean> ObtenerListaManga(@RequestParam Long ID) {
        return (List<MangaBean>)this.mangaService.ObtenerListaDeMangas(ID);
    }
    
    @ResponseBody
    @GetMapping({ "/mangaCapitulo/{ID}" })
    public List<CapitulosMangaBean> obtenerCapitulos(@PathVariable Long ID) {
        return (List<CapitulosMangaBean>)this.mangaService.ObtenerCapitulosManga(ID);
    }
}
