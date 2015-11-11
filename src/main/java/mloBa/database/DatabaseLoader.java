package mloBa.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import mloBa.domain.Student;
import mloBa.repository.StudentRepository;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final StudentRepository repository;

	@Autowired
	public DatabaseLoader(StudentRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... strings) throws Exception {
		this.repository.save(new Student("Frodo", "Baggins"));
	}
}
