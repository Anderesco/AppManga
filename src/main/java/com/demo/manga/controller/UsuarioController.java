package com.demo.manga.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.manga.entity.Usuario;
import com.demo.manga.service.hibernate.UsuarioService;

@Controller("/")
public class UsuarioController 
{
	@Autowired
	private UsuarioService usuarioService;
	
	@ResponseBody
	@RequestMapping(value = "usuario/{ID}")
	public List<Usuario> MostrarUsuario(@PathVariable Integer ID)
	{
		return usuarioService.ObtenerUsuarioEnSesion(ID);
	}
}
