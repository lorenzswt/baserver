package mloBa.domain.person;

import javax.persistence.*;

import mloBa.Enums.CivilStatus;
import mloBa.domain.Major;

@Entity
@Table(name = "student")
public class Student extends Person{

	public Student(String firstName, String lastName, CivilStatus civilStatus) {
		super(firstName, lastName, civilStatus);
		// TODO Auto-generated constructor stub
	}

	
	@OneToOne
	@JoinColumn(name="major_id")
	private Major major;
	
	private String matNr;
	
	private String matNr2;
	


}
