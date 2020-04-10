package com.demo.manga.dao;

import org.hibernate.Session;
import com.demo.manga.util.HibernateUtil;
import com.demo.manga.entity.Manga;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class MangaRepository
{
    
	public List<Manga> ObtenerMangas() 
    {
        try (Session session = HibernateUtil.getSessionFactoria().openSession()) {
            return session.createNativeQuery("SELECT * FROM Manga", Manga.class).list();
        }
    }
    
    @SuppressWarnings("unchecked")
	public List<String[]> ObtenerGeneroDeMangas(Long ID) 
    {
        try (Session session = HibernateUtil.getSessionFactoria().openSession()) {
            return session.createNativeQuery(
            		"SELECT g.NombreGenero FROM Genero g\n" +
            		"INNER JOIN MangaGenero mg ON mg.IDGenero = g.ID\n" +
            		"INNER JOIN Manga m ON m.ID = mg.IDManga\n" +
            		"WHERE mg.IDManga = :ID")
            		.setParameter("ID", ID)
            		.list();
        }
    }
    
    @SuppressWarnings("unchecked")
	public List<Object[]> ObtenerCapitulosMangaPorId(Long ID) 
    {
        try (Session session = HibernateUtil.getSessionFactoria().openSession()) {
            return session.createNativeQuery(
            		"SELECT cp.NumeroCapitulo, cp.NombreCapitulo FROM CapituloManga cp\n" +
            		"INNER JOIN Manga m ON m.ID = cp.IDManga\n" +
            		"WHERE m.ID = :ID\n" +
            		"ORDER BY cp.NumeroCapitulo ASC")
            		.setParameter("ID", ID)
            		.list();
        }
    }
}