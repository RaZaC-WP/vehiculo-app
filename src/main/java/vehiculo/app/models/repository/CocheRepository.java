package vehiculo.app.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import vehiculo.app.models.entity.Coche;

@Repository
public interface CocheRepository extends CrudRepository<Coche, Long> {

}
