package com.demo.manga.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;

import com.demo.manga.service.hibernate.MangaService;
import com.demo.manga.bean.MangaBean;

import org.springframework.stereotype.Controller;

@Controller
public class MangaController
{
    @Autowired
    private MangaService mangaService;
    
    @ResponseBody
    @PostMapping("/manga")
    public List<MangaBean> ObtenerListaManga(@RequestParam Long ID) {
        return mangaService.ObtenerListaDeMangas(ID);
    }
    
}
