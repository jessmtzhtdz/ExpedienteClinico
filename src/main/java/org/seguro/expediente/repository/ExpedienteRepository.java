package org.seguro.expediente.repository;

import java.util.List;

import org.seguro.expediente.model.Expediente;

public interface ExpedienteRepository {
	
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
