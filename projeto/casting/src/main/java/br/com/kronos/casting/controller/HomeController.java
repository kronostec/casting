package br.com.kronos.casting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.kronos.commons.controller.KronosBaseController;

@Controller
public class HomeController extends KronosBaseController {

	@RequestMapping("/*")
	public String index(Model model){
		return "public/index";
	}
	
	@RequestMapping("/contato")
	public String contato(Model model){
		return "public/contato/contato";
	}
	
	@RequestMapping("/home")
	public String home(Model model){
		return "public/home/home";
	}
	
	@RequestMapping("/menu")
	public String menu(Model model){
		return "public/layout/menu";
	}
	
	@RequestMapping("/footer")
	public String footer(Model model){
		return "public/layout/footer";
	}
}
