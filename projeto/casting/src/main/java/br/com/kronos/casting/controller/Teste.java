package br.com.kronos.casting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Teste {

	@RequestMapping("/*")
	public String index(){
		return "public/index";
	}
	@RequestMapping("/Salci_Fufu")
	public String salciFufu(Model model){
		model.addAttribute("nome", "Teste Nome");
		return "public/salciFufu";
	}
	@RequestMapping("/Salci_Fufu2")
	public String salciFufu2(){
		return "public/salciFufu2";
	}
}
