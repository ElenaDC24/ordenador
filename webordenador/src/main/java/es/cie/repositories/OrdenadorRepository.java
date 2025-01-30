package es.cie.repositories;

import java.util.List;

import es.cie.negocio.Ordenador;

public interface OrdenadorRepository {
	
	List<Ordenador> buscarTodos();
	void insertar(Ordenador ordenador);

}
