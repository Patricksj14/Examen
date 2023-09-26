package org.cibertec.edu.pe.controller;

import java.util.List;

import org.cibertec.edu.pe.interfaceService.IEmpleadoService;
import org.cibertec.edu.pe.modelo.Empleado;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmpleadoController {
	
	@Autowired
	private IEmpleadoService service;
	
	// Método para listar
		@GetMapping("/listar")
		public String Listar(Model m) {
			List<Empleado> empleado = service.listar();
			m.addAttribute("empleado",empleado);
			m.addAttribute("cantidad", empleado.size());
			return "listar";
		}
		
		@GetMapping("/agregar")
		public String agregar ( Model m) {
			return "agregar";
		}
		
		@PostMapping("/salvar")
		public String salvar ( Empleado e, Model m) {
			service.Agregar(e);
			return "redirect:/listar";
		}

}
