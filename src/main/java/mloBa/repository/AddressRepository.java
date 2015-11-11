package mloBa.repository;

import org.springframework.data.repository.CrudRepository;

import mloBa.domain.Address;
public interface AddressRepository extends CrudRepository<Address, Long> {

}
