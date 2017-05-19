package hello;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {

    List<Person> findBylname(String lname);
    Person findOneBylname(String lname);
	List<Person> findByFnameAndLname(String fname, String lname);
}