package mloBa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="institution")
public class Institution {

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	@OneToOne
	@JoinColumn(name="company_address", nullable=true)
	private Address address;
}
