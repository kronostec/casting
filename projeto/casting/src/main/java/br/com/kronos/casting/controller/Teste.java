package br.com.kronos.casting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Teste {
	
	@RequestMapping("/*")
	public String index(Model model){
		throw new RuntimeException("teste de exeção");
	}
	
}
