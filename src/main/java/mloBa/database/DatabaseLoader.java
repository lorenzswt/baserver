package mloBa.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import mloBa.Enums.CivilStatus;
import mloBa.domain.PAAntrag;
import mloBa.domain.person.Employee;
import mloBa.domain.person.Student;
import mloBa.repository.EmployeeRepository;
import mloBa.repository.PAAntragRepository;
import mloBa.repository.StudentRepository;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final StudentRepository repository;
	private final EmployeeRepository empRepo;
	private final PAAntragRepository paRepo;

	@Autowired
	public DatabaseLoader(StudentRepository repository, EmployeeRepository empRepo, PAAntragRepository paRepo) {
		this.empRepo = empRepo;
		this.repository = repository;
		this.paRepo= paRepo;
	}

	@Override
	public void run(String... strings) throws Exception {
		Student student =  new Student("Frodo", "Baggins", CivilStatus.LEDIG, "12345");
		this.repository.save(student);
		this.empRepo.save(new Employee("Herr", "Lorenz", CivilStatus.VERHEIRATET));
		this.paRepo.save(new PAAntrag(student, "Eintrag 1 für Student Frodo"));
		this.paRepo.save(new PAAntrag(student, "Eintrag 2 für Student Frodo"));
		
	}
}
