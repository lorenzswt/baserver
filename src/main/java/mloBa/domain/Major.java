package mloBa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Studiengang")
public class Major {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private String shortname;

}
