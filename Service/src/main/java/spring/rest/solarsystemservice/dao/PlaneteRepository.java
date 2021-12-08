package spring.rest.solarsystemservice.dao;

import org.springframework.data.repository.CrudRepository;
import spring.rest.solarsystemservice.model.Planete;

public interface PlaneteRepository extends CrudRepository<Planete, Integer> {

    Planete findById(int id);

    void deleteById(int id);
}
