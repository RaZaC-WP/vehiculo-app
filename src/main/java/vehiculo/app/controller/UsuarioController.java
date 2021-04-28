package vehiculo.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vehiculo.app.models.entity.Usuario;

import vehiculo.app.models.service.IUsuarioService;

@Controller
public class UsuarioController {
	@Autowired
	private IUsuarioService usuarioService;
	
	
	@PostMapping("/registrado")
	public String registrado(@ModelAttribute Usuario usuario) {
		
		
		
		usuarioService.guardar(usuario);
		
		return "views/registro_success";
	}
	
	@GetMapping("/inicioSesion")
	public String inicioSesion(Model model) {
		Usuario usuario = new Usuario();
		model.addAttribute("titulo", "Formulario: Iniciar Sesion");
		model.addAttribute("usuario", usuario);
		
		return "views/inSe_form";
		
	}
	
	@GetMapping("/comprobar")
	public String comprobar(@ModelAttribute Usuario usuario) {
		
		
			return "index";
		
		
		
		
	}
}
