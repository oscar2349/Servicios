package springboot.backend.apirest.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;


import springboot.backend.apirest.models.entity.Ordenservicio;

public interface IOrdenServicio extends PagingAndSortingRepository<Ordenservicio, Integer>{

}
