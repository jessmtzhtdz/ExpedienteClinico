package org.seguro.expediente.service;

import java.util.List;

import javax.jws.WebService;

import org.seguro.expediente.model.Expediente;

@WebService
public interface ExpedienteService {
	/**
	 * M�todo para crear Expedientes cl�nicos
	 * @param expediente
	 * @return
	 */
	Expediente crearExpediente(Expediente expediente);
	
	/**
	 * M�todo para obtener Expediente cl�nico
	 * @return
	 */
	List<Expediente> obtenerExpediente();

}
