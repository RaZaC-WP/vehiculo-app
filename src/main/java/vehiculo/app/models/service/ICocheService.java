package vehiculo.app.models.service;

import java.util.List;

import vehiculo.app.models.entity.Coche;

public interface ICocheService  {

	public List<Coche> listarTodos();
	
	public void guardar(Coche coche);
	public Coche buscarPorId(Long id);
	public void eliminar(Long id);
}
