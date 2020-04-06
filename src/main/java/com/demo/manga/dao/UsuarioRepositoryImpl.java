package com.demo.manga.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Component;

import com.demo.manga.entity.Usuario;
import com.demo.manga.util.HibernateUtil;

@Component
public class UsuarioRepositoryImpl
{
	public List<Usuario> obtenerUsuarioEnSesion(Integer ID) {
		try (Session session = HibernateUtil.getSessionFactoria().openSession()) {
            return session.createQuery("SELECT u FROM usuario", Usuario.class).list();
        }
	}
	
}
