package springboot.backend.apirest.models.dao;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import springboot.backend.apirest.models.entity.Proveedoresservicio;

public interface IProveedores extends PagingAndSortingRepository<Proveedoresservicio, Integer>{

	
	
}
