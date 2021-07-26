package springboot.backend.apirest.models.entity;

import java.util.List;

public interface IOrdenServicioDAO {
	
	public Ordenservicio findOne(Integer id);
	public  List<Ordenservicio> findAll();
	

}
