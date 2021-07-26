package springboot.backend.apirest.models.entity;

import java.util.List;

public interface IOrdenServicioDAO {
	
	public Ordendeservicio findOne(Integer id);
	public  List<Ordendeservicio> findAll();
	

}
