package mloBa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="FremdUniPruefung")
public class ForeignExam {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private int number;
	
	@OneToOne
	@JoinColumn(name="uni_id")
	private University university;

}
