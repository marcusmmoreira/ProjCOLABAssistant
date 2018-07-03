package br.univille.projcolabassistant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/catalogo")
public class ConsultAccessoriesController {

	@GetMapping("")
	public ModelAndView index() {
		return new ModelAndView("/catalog/accessoryList");
	}

}