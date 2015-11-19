package mloBa.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import mloBa.domain.person.Student;

@Entity
@Table(name = "PAAntrag")
public class PAAntrag {
	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String firstName;

	@Column(nullable = false)
	private String lastName;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="student_id", nullable=true)
	private Student student;
	
	private PAAntrag() {}

	public PAAntrag(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Student getStudent() {
		return this.student;
	}

	public void setStudent (Student newStudent) {
		this.student =  newStudent;
	}
	// setters and getters

}
