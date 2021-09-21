package com.devops.dao;


import java.util.List;

import com.devops.models.Paciente;

public interface PacienteDao {
	
	void agregarPaciente(Paciente paciente);
	Paciente buscarPaciente(String id);
	List<Paciente> getPacientes();

}
