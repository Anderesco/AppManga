package com.demo.manga.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.manga.bean.UsuarioBean;
import com.demo.manga.bean.UsuarioSesionBean;
import com.demo.manga.dao.UsuarioRepository;
import com.demo.manga.service.hibernate.PersonaService;
import com.demo.manga.service.hibernate.UsuarioService;

@Service(value = "usuarioservice")
public class UsuarioServiceImpl implements UsuarioService
{
	@Autowired
	private UsuarioRepository usuarioRepositorio;
	
	@Autowired
	private PersonaService personaService;

	@Override
	public Long ValidarUsuario(String usuario, String contraseña) {
		
		UsuarioSesionBean usuarioSesion = usuarioRepositorio.validarUsuario(usuario, contraseña)
				.parallelStream()
				.map(usu -> new UsuarioSesionBean(usu.getIdUsuario(),usu.getNombreUsuario(), usu.getContrasenia()))
				.collect(Collectors.toList()).get(0);
		
		return usuarioSesion.getID();
	}
	
	@Override
	public UsuarioBean ObtenerUsuarioEnSesion(Long ID) {
		List<Object[]> listaUsuarioSesion = usuarioRepositorio.obtenerUsuarioRol(ID);
		UsuarioBean usuarioBean = new UsuarioBean();
		
		try 
		{
			for(Object[] objeto : listaUsuarioSesion)
			{
				usuarioBean.setNombreUsuario((String) objeto[0]);
				usuarioBean.setContraseña((String) objeto[1]);
				usuarioBean.setNombreRol((String) objeto[3]);
				usuarioBean.setPersona(personaService.ObtenerPersona(Long.parseLong(String.valueOf(objeto[2]))).get(0));
			}
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return usuarioBean;
	}
	
}
