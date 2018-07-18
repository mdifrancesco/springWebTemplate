package it.weeg.billing.repository;

import it.weeg.billing.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String nome);

    List<User> findByEnabled(Boolean enable);

}
