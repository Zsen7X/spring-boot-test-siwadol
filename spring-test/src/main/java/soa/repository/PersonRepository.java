package soa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import soa.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer>{

}
