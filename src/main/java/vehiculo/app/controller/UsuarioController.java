package vehiculo.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vehiculo.app.models.entity.User;


import vehiculo.app.models.service.UserDetailsServiceImpl;

@Controller
public class UsuarioController {
	@Autowired
	private UserDetailsServiceImpl usuarioService;
	
	
	@PostMapping("/registrado")
	public String registrado(@ModelAttribute User usuario) {
		
		
		
		usuarioService.loadUserByUsername(usuario.getUsername());
		
		return "views/registro_success";
	}
	
	@GetMapping("/inicioSesion")
	public String inicioSesion(Model model) {
		User usuario = new User();
		model.addAttribute("titulo", "Formulario: Iniciar Sesion");
		model.addAttribute("usuario", usuario);
		
		return "views/inSe_form";
		
	}
	
	/** @PostMapping("/comprobar")
	public String comprobar(@ModelAttribute Usuario usuario , List<Usuario> usuarios) {
		
		System.out.println(usuarioService.loadUserByUsername());
		
		
		
			return "index";
		
		
		
		
	} **/
}
