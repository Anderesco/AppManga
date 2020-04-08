package com.demo.manga.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.manga.bean.PersonaBean;
import com.demo.manga.service.hibernate.PersonaService;

@RestController
public class PersonaController 
{
	@Autowired
	private PersonaService personaService;
	
	@ResponseBody
	@GetMapping("/persona/{ID}")
	public List<PersonaBean> ObtenerPersonaPorId(@PathVariable Long ID){
		return personaService.ObtenerPersona(ID);
	}
}
