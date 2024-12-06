package org.homework7.repository;

import org.homework7.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByMatNr(String matNr); // bc matNr usually unique
    List<Student> findAllByName(String name);
}
