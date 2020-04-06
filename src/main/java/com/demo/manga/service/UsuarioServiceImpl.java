package com.demo.manga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.manga.dao.UsuarioRepositoryImpl;
import com.demo.manga.entity.Usuario;
import com.demo.manga.service.hibernate.UsuarioService;

@Service(value = "usuarioservice")
public class UsuarioServiceImpl implements UsuarioService
{
	@Autowired
	private UsuarioRepositoryImpl usuarioRepositorio;

	@Override
	public List<Usuario> ObtenerUsuarioEnSesion(Integer ID) {
		System.out.println("Si pasa el Servicio");
		return  usuarioRepositorio.obtenerUsuarioEnSesion(ID);
	}
	
}
