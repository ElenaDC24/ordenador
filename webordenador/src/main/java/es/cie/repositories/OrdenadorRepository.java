package es.cie.repositories;

public interface OrdenadorRepository {
	
	List<Ordenador> buscarTodos();
	void insertar(Ordenador ordenador)

}
