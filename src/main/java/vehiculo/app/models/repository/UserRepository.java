package vehiculo.app.models.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import vehiculo.app.models.entity.User;


@Repository
public interface UserRepository extends CrudRepository<User,Long> {

		public Optional<User> findByUsername(String username);
}
