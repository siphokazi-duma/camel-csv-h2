package za.co.duma.camelcsv.repository;

import za.co.duma.camelcsv.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {}
