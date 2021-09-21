package com.devops.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devops.models.Paciente;
import com.devops.service.PacienteService;

@RestController
@RequestMapping(path = "/api")
public class PacienteController {
 
	@Autowired
	private PacienteService pacienteService;

	//Creacion de un paciente
	@PostMapping("/paciente")
	public Paciente guardarPaciente(@RequestBody Paciente paciente) {
		
		 if(pacienteService.guardarPaciente(paciente)!=false) {
			 return paciente;
		 }
			 else {
				 return null;
			 }
		 }
	@GetMapping("/pacientes")
	public List<Paciente> recuperarContactos() {
		return pacienteService.obtenerPacientes();
	}
	
	@GetMapping("/paciente/{id}")
	public Paciente recuperarContactos(@PathVariable("id") String id) {
		return pacienteService.recuperarPaciente(id);
	}
	
	}


