package com.cursomc.resources;

import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")
public class CategoriasResources {
	
	@RequestMapping(method = RequestMethod.GET)
	public String Listar() {
		return "Rest está Funcionando";
	}

}
