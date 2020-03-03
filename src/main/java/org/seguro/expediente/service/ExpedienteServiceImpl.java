package org.seguro.expediente.service;

import java.util.List;

import javax.jws.WebService;

import org.seguro.expediente.model.Expediente;
import org.seguro.expediente.repository.ExpedienteRepository;
import org.seguro.expediente.repository.ExpedienteRepositoryImpl;

@WebService(endpointInterface="org.seguro.expediente.service.ExpedienteService")
public class ExpedienteServiceImpl implements ExpedienteService {
	
	ExpedienteRepository expedienteRepository = new ExpedienteRepositoryImpl();

	@Override
	public Expediente crearExpediente(Expediente expediente) {
		return expedienteRepository.crearExpediente(expediente);
	}

	@Override
	public List<Expediente> obtenerExpediente() {
		return expedienteRepository.obtenerExpediente();
	}

}
