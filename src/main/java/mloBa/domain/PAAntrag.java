package mloBa.domain;
import java.io.Serializable;

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
public class PAAntrag implements Serializable{
	
	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	private Student student;
	
	@Column(nullable = true)
	private String caseNote;
	
	private PAAntrag() {}
	
	public PAAntrag(Student student, String caseNote) {
		this.student = student;
		this.caseNote = caseNote;
	}


	// setters and getters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Student getStudent() {
		return this.student;
	}

	public void setStudent (Student newStudent) {
		this.student =  newStudent;
	}
	
	public String getCaseNote () {
		return this.caseNote;
	}
	
	public void setCaseNote (String caseNote) {
		this.caseNote = caseNote;
	}

}
