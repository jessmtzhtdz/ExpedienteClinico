package org.seguro.expediente.repository;

import java.util.List;

import org.seguro.expediente.model.Expediente;

public interface ExpedienteRepository {
	
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
