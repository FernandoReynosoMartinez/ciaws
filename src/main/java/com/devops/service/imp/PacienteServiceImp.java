package com.devops.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devops.dao.PacienteDao;
import com.devops.models.Paciente;
import com.devops.service.PacienteService;

@Service
public class PacienteServiceImp implements PacienteService {

	@Autowired
	private PacienteDao dao;

	@Override
	public Boolean guardarPaciente(Paciente paciente) {
		if (paciente.getNombre() != null && paciente.getEdad() > 0) {
			dao.agregarPaciente(paciente);
			return true;
		} else
			return false;
	}

	@Override
	public Paciente recuperarPaciente(String id) {

		return dao.buscarPaciente(id);

	}

	@Override
	public List<Paciente> obtenerPacientes() {
		return dao.getPacientes();
	}

}
