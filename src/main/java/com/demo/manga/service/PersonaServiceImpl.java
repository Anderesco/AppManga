package com.demo.manga.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.manga.bean.PersonaBean;
import com.demo.manga.dao.PersonaRepository;
import com.demo.manga.service.hibernate.PersonaService;

@Service(value = "personaservice")
public class PersonaServiceImpl implements PersonaService
{
	@Autowired
	private PersonaRepository personaRepositorio;

	@Override
	public List<PersonaBean> ObtenerPersona(Long ID) 
	{
		return personaRepositorio.obtenerPersonaPorId()
				.parallelStream()
				.filter(persona -> ID == persona.getIdPersona())
				.map(persona -> {
					PersonaBean personaBean = new PersonaBean();
					
					personaBean.setNombre(persona.getNombrePersona());
					personaBean.setApellidoPaterno(persona.getApellidoPaterno());
					personaBean.setApellidoMaterno(persona.getApellidoMaterno());
					personaBean.setCorreo(persona.getCorreo());
					
					return personaBean;
				}).collect(Collectors.toList());
	}

}
