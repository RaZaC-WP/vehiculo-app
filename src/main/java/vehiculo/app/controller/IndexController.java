package vehiculo.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import vehiculo.app.models.entity.User;



@Controller
public class IndexController {

	@GetMapping({"/index","/"})
	public String index() {
		
		return "index";
	}
	
	@GetMapping("/registrar")
	public String registrar(Model model) {
		User usuario = new User();
		model.addAttribute("titulo", "Formulario: Nuevo Usuario");
		model.addAttribute("usuario", usuario);
		
		return "registro";
	}
}
