package com.demo.manga.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.manga.entity.Persona;
import com.demo.manga.util.HibernateUtil;

@Repository
@Transactional
public class PersonaRepository 
{
	@SuppressWarnings("unchecked")
	public List<Persona> obtenerPersonaPorId()
	{
		try (Session session = HibernateUtil.getSessionFactoria().openSession()) {
			return session.createQuery("SELECT p FROM Persona p").list();
		}
	}
}
