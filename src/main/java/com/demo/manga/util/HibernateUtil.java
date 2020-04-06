package com.demo.manga.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.demo.manga.entity.CapituloManga;
import com.demo.manga.entity.Genero;
import com.demo.manga.entity.Manga;
import com.demo.manga.entity.MangaGenero;
import com.demo.manga.entity.PaginaManga;
import com.demo.manga.entity.Persona;
import com.demo.manga.entity.Rol;
import com.demo.manga.entity.Usuario;
import com.demo.manga.entity.UsuarioManga;
import com.demo.manga.entity.UsuarioRol;


public class HibernateUtil 
{
private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactoria()
	{
		if(sessionFactory == null)
		{
			try
			{
				Configuration configuration = new Configuration();
				
				Properties ajustes = new Properties();
				
				ajustes.put(Environment.SHOW_SQL, "true");
				ajustes.put(Environment.URL, "jdbc:mysql://34.223.247.148:3306/manga?useSSL=false");
				ajustes.put(Environment.USER, "root");
				ajustes.put(Environment.PASS, "P@ssW0rd2017");
				ajustes.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
				
				ajustes.put(Environment.SHOW_SQL, "true");
                ajustes.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
                //ajustes.put(Environment.HBM2DDL_AUTO, "create");
                
                configuration.setProperties(ajustes);
                configuration.addAnnotatedClass(CapituloManga.class);
                configuration.addAnnotatedClass(Genero.class);
                configuration.addAnnotatedClass(Manga.class);
                configuration.addAnnotatedClass(MangaGenero.class);
                configuration.addAnnotatedClass(PaginaManga.class);
                configuration.addAnnotatedClass(Persona.class);
                configuration.addAnnotatedClass(Rol.class);
                configuration.addAnnotatedClass(Usuario.class);
                configuration.addAnnotatedClass(UsuarioManga.class);
                configuration.addAnnotatedClass(UsuarioRol.class);
                
                ServiceRegistry serviceRegistry = (ServiceRegistry) new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
                
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			}
			catch(Exception e) { e.printStackTrace(); }
		}
		
		return sessionFactory;
	}
}
