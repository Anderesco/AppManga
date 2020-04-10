package com.demo.manga.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.manga.entity.Usuario;
import com.demo.manga.util.HibernateUtil;

@Transactional
@Repository
public class UsuarioRepository
{
	public List<Usuario> obtenerUsuarioEnSesion() {
		try (Session session = HibernateUtil.getSessionFactoria().openSession()) {
            return session.createNativeQuery("SELECT * FROM Usuario", Usuario.class).list();
        }
	}
	
	public List<Usuario> validarUsuario(String usuario, String contraseña)
	{
		try (Session session = HibernateUtil.getSessionFactoria().openSession()) {
			return session.createNativeQuery(
					"SELECT DISTINCT * FROM Usuario\n" + 
					"WHERE NombreUsuario = :usuario\n" +
					"AND Contrasenia = :contraseña", Usuario.class)
					.setParameter("usuario", usuario)
					.setParameter("contraseña", contraseña)
					.list();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Object[]> obtenerUsuarioRol(Long ID)
	{
		try (Session session = HibernateUtil.getSessionFactoria().openSession()){
			return session.createSQLQuery(
					"SELECT u.NombreUsuario, u.Contrasenia, u.IDPersona, r.NombreRol\n" +
					"FROM usuario u\n" +
					"INNER JOIN usuariorol ur ON ur.IDUsuario = u.ID\n" +
					"INNER JOIN rol r ON r.ID = ur.IDRol\n" + 
					"WHERE u.ID = :ID")
					.setParameter("ID", ID)
					.list();
		}
	}
	
}
