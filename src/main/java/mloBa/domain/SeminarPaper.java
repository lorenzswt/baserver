package mloBa.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import mloBa.domain.person.Employee;
import mloBa.domain.person.Student;

@Entity
@Table(name="StADA")
public class SeminarPaper {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private int number;
	private String name;
	private String note;
	private int attempt;
	private boolean publicRelease;
	private boolean abort;
	private Date start;
	private Date end;
	private Date suspension;
	private Date due;
	private Date pause;
	private Date atPA;
	private String mark;
	
	@OneToOne
	@JoinColumn(name="pruefbereich_id")
	private ExamDomain examDomain;
	
	@OneToOne
	@JoinColumn(name="Betreuer_id")
	private Employee supervisor;
	
	@OneToOne
	@JoinColumn(name="Pruefer_id")
	private Employee examiner;
	
	@OneToOne
	@JoinColumn(name="Abteilungs_id")
	private Department department;
	
	@OneToOne
	@JoinColumn(name="student_id")
	private Student student;
	
	@OneToOne
	@JoinColumn(name="company_id")
	private Company company;
}
