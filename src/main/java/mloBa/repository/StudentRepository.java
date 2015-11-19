package mloBa.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import mloBa.domain.person.Student;

@RepositoryRestResource(collectionResourceRel = "student", path = "students")
public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {

    List<Student> findAllByLastName(@Param("name") String name);
    Student findOneByEmail(@Param("email") String email);
    Student findOneByMatNr(@Param("matNr") String matNr);
}
