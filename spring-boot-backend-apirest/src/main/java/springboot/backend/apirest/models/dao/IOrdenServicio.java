package springboot.backend.apirest.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;


import springboot.backend.apirest.models.entity.Ordendeservicio;

public interface IOrdenServicio extends PagingAndSortingRepository<Ordendeservicio, Integer>{

}
