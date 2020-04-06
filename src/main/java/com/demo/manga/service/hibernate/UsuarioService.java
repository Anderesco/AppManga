package com.demo.manga.service.hibernate;

import java.util.List;

import com.demo.manga.entity.Usuario;

public interface UsuarioService 
{
	public List<Usuario> ObtenerUsuarioEnSesion(Integer ID);
}
