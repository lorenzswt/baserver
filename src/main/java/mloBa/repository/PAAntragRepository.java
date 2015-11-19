package mloBa.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import mloBa.domain.PAAntrag;
import mloBa.domain.person.Student;

public interface PAAntragRepository extends PagingAndSortingRepository<PAAntrag, Long>{
	
	List<PAAntrag> findByStudentMatNr(@Param("matNr") String matNr);
	

}
