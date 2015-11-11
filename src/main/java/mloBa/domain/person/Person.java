package mloBa.domain.person;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import mloBa.Enums.CivilStatus;
import mloBa.domain.Address;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="person")
@DiscriminatorColumn(name="type", discriminatorType = DiscriminatorType.STRING)
public abstract class Person {
	
	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String firstName;

	@Column(nullable = false)
	private String lastName;
	
	private String email;
	
	private String birthName;
	
	private Date birthDate;
	
	private String telNr;
	
	private String telMobileNr;
	
	@Enumerated
	private CivilStatus civilStatus;
	
	
	@OneToOne
	@JoinColumn(name="address_id", nullable=true)
	private Address address;
	
	private Person() {}

	public Person(String firstName, String lastName, CivilStatus civilStatus) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.civilStatus = civilStatus;
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


}
