package springboot.backend.apirest.models.entity;

import java.util.List;

public interface IServiciosDAO {
	
	public Servicios findOne(Integer id);
	public  List<Servicios> findAll();
	

}
