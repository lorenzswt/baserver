package mloBa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "modul")
public class Modul {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private String shortName;
	
	private int number;
	
	private int credits;
	
	private int assignment;
	
	private int z;

}
