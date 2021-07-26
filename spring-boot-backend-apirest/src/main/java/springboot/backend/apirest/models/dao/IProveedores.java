package springboot.backend.apirest.models.dao;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import springboot.backend.apirest.models.entity.Proveedoresservicio;

public interface IProveedores extends PagingAndSortingRepository<Proveedoresservicio, Integer>{

	@Query(
			  value = "SELECT * FROM test.order where creation_date BETWEEN ?1 AND ?2 ORDER BY creation_date DESC  ", 
			  nativeQuery = true)
	public List <Proveedoresservicio> findByStartDateBetween(String fechaInicial,String fechaFinal);
	
	
}
