package org.seguro.expediente.service;

import java.util.List;

import javax.jws.WebService;

import org.seguro.expediente.model.Expediente;

@WebService
public interface ExpedienteService {
	/**
	 * Método para crear Expedientes clínicos
	 * @param expediente
	 * @return
	 */
	Expediente crearExpediente(Expediente expediente);
	
	/**
	 * Método para obtener Expediente clínico
	 * @return
	 */
	List<Expediente> obtenerExpediente();

}
