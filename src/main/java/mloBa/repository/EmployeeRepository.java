package mloBa.repository;

import org.springframework.data.repository.CrudRepository;

import mloBa.domain.person.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
