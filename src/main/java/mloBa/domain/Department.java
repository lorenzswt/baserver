package mloBa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Table(name="Abteilung")
public class Department extends Institution {

	private String shortName;
}
