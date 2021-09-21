package com.devops.service;

import java.util.List;

import com.devops.models.Paciente;

public interface PacienteService {
	
	Boolean guardarPaciente(Paciente paciente);
	Paciente recuperarPaciente(String id);
	List<Paciente> obtenerPacientes();

}
