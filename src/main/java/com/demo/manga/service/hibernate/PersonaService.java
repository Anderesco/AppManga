package com.demo.manga.service.hibernate;

import java.util.List;

import com.demo.manga.bean.PersonaBean;

public interface PersonaService 
{
	public List<PersonaBean> ObtenerPersona(Long ID);
}
