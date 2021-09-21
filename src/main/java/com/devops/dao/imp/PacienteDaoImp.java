package com.devops.dao.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.devops.dao.PacienteAgenda;
import com.devops.dao.PacienteDao;
import com.devops.models.Paciente;

@Repository
public class PacienteDaoImp implements PacienteDao {

	@Autowired
	PacienteAgenda pacienteAgenda;

	@Override

	public void agregarPaciente(Paciente paciente) {
		pacienteAgenda.save(paciente);
	}

	@Override
	public Paciente buscarPaciente(String id) {
		return pacienteAgenda.findById(id).get();

	}

	@Override
	public List<Paciente> getPacientes() {
		return pacienteAgenda.findAll();
	}

}
