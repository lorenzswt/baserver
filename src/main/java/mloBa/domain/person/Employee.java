package mloBa.domain.person;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import mloBa.Enums.CivilStatus;
import mloBa.domain.Department;

@Entity
@Table(name = "Mitarbeiter")
public class Employee extends Person{
	
	public Employee(String firstName, String lastName, CivilStatus civilStatus) {
		super(firstName, lastName, civilStatus);
		// TODO Auto-generated constructor stub
	}
	
	@OneToOne
	@JoinColumn(name="deparment_D")
	private Department department;

}
