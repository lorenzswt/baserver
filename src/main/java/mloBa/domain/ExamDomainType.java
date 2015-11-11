package mloBa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PruefbereichTyp")
public class ExamDomainType {

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
}
