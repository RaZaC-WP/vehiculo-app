package vehiculo.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import vehiculo.app.models.entity.Usuario;


@Controller
public class IndexController {

	@GetMapping({"/index","/"})
	public String index() {
		
		return "index";
	}
	
	@GetMapping("/registrar")
	public String registrar(Model model) {
		Usuario usuario = new Usuario();
		model.addAttribute("titulo", "Formulario: Nuevo Usuario");
		model.addAttribute("usuario", usuario);
		
		return "registro";
	}
}
