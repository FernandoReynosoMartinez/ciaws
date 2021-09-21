package com.devops.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.devops.models.Paciente;

public interface PacienteAgenda extends MongoRepository<Paciente,String> {

}
