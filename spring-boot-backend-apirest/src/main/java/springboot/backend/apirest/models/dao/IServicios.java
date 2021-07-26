package springboot.backend.apirest.models.dao;


import org.springframework.data.repository.PagingAndSortingRepository;

import springboot.backend.apirest.models.entity.Servicios;

public interface IServicios extends PagingAndSortingRepository<Servicios, Integer> {

}
