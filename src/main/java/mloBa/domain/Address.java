package mloBa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Addresse")
public class Address {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private int plz;
	
	private String city;
	
	private String street;
	
	private String number;
	
	

}
