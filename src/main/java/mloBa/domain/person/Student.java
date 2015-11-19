package mloBa.domain.person;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;



import mloBa.Enums.CivilStatus;
import mloBa.domain.Major;
import mloBa.domain.PAAntrag;

@Entity
@Table(name = "student")
public class Student extends Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Major getMajor() {
		return major;
	}

	public void setMajor(Major major) {
		this.major = major;
	}
	
	@Column(nullable = false)
	public String getMatNr() {
		return matNr;
	}

	public void setMatNr(String matNr) {
		this.matNr = matNr;
	}

	public String getMatNr2() {
		return matNr2;
	}

	public void setMatNr2(String matNr2) {
		this.matNr2 = matNr2;
	}

	public Student() {
		
	}
	
	public Student(String firstName, String lastName, CivilStatus civilStatus, String matNr) {
		super (firstName, lastName, civilStatus);
		this.matNr = matNr;
		// TODO Auto-generated constructor stub
	}
	
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
