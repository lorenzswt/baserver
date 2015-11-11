package mloBa.domain;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String firstName;

	@Column(nullable = false)
	private String lastName;

	private Student() {}

	public Student(String firstName, String lastName) {
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

	// setters and getters

}
