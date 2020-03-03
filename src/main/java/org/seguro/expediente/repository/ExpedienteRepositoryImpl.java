package org.seguro.expediente.repository;

import java.util.ArrayList;
import java.util.List;

import org.seguro.expediente.model.Expediente;



public class ExpedienteRepositoryImpl implements ExpedienteRepository{
	private static List<Expediente> expedienteClinico = new ArrayList<>();
	
	@Override
	public Expediente crearExpediente(Expediente expediente) {
		System.out.println("Crear Expediente::::");
		expedienteClinico.add(expediente);
		return expediente;
	}

	@Override
	public List<Expediente> obtenerExpediente() {
		System.out.println(":::Obtener Expediente");
		return expedienteClinico;
	}

}
