package vehiculo.app.models.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vehiculo.app.models.entity.Coche;
import vehiculo.app.models.repository.CocheRepository;

@Service
public class CocheServiceImp implements ICocheService {

	@Autowired
	private CocheRepository cocheRepository;
	
	@Override
	public List<Coche> listarTodos() {
		return (List<Coche>) cocheRepository.findAll();
	}

	@Override
	public void guardar(Coche coche) {
		cocheRepository.save(coche);
	}

	@Override
	public Coche buscarPorId(Long id) {
		return cocheRepository.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Long id) {
		cocheRepository.deleteById(id);
	}

}
