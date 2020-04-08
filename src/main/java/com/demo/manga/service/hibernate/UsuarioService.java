package com.demo.manga.service.hibernate;

import com.demo.manga.bean.UsuarioBean;

public interface UsuarioService 
{
	public UsuarioBean ObtenerUsuarioEnSesion(Long ID);
	public Long ValidarUsuario(String usuario, String contraseña);
}
