package springboot.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import springboot.backend.apirest.models.entity.Servicios;

public interface IServicios extends PagingAndSortingRepository<Servicios, Integer> {

	@Query(value = "SELECT * FROM test.order_detail where order_id = ?1 ;", nativeQuery = true)
	public List<Servicios> findOrderId(Integer id);
}
