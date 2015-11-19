package mloBa.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import mloBa.Enums.CivilStatus;
import mloBa.domain.person.Employee;
import mloBa.domain.person.Student;
import mloBa.repository.EmployeeRepository;
import mloBa.repository.StudentRepository;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final StudentRepository repository;
	private final EmployeeRepository empRepo;

	@Autowired
	public DatabaseLoader(StudentRepository repository, EmployeeRepository empRepo) {
		this.empRepo = empRepo;
		this.repository = repository;
	}

	@Override
	public void run(String... strings) throws Exception {
		this.repository.save(new Student("Frodo", "Baggins", CivilStatus.LEDIG));
		this.empRepo.save(new Employee("Herr", "Lorenz", CivilStatus.VERHEIRATET));
	}
}
