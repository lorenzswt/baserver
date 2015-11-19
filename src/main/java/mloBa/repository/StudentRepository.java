package mloBa.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import mloBa.domain.person.Student;


public interface StudentRepository extends CrudRepository<Student, Long> {

    Page<Student> findAll(Pageable pageable);
}
