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
	
}
