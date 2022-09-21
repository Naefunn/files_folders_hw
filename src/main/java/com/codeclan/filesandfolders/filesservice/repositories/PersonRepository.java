package com.codeclan.filesandfolders.filesservice.repositories;

import com.codeclan.filesandfolders.filesservice.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
