package com.demo.manga.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.manga.bean.UsuarioBean;
import com.demo.manga.service.hibernate.UsuarioService;

@Controller("/")
public class UsuarioController 
{
	@Autowired
	private UsuarioService usuarioService;
	
	@ResponseBody
	@RequestMapping(value = "usuario/{ID}")
	public UsuarioBean MostrarUsuario(@PathVariable Long ID){
		return usuarioService.ObtenerUsuarioEnSesion(ID);
	}
	
	@ResponseBody
	@PostMapping("login")
	public Long login(@RequestParam String usuario, @RequestParam String contraseña){
		
		return usuarioService.ValidarUsuario(usuario, contraseña);
	}
	
	@GetMapping("principal")
	public String menu () {
		return "index";
	}
	
	@ResponseBody
	@PostMapping("ingreso")
	public UsuarioBean MostrarUsuario(@RequestParam String usuario, @RequestParam String contraseña) throws Exception
	{
		UsuarioBean usuarioDatos = null;
		
		try {
			 usuarioDatos = usuarioService.ObtenerUsuarioEnSesion(this.login(usuario, contraseña));
		} 
		catch (Exception e) {
			throw new Exception("Usurio y/o contraseña Incorrecta");
		}
		return usuarioDatos;
	}
}
