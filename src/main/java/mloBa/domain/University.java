package mloBa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Universitaet")
public class University {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	@OneToOne
	@JoinColumn(name="address_id")
	private Address address;
	

}
