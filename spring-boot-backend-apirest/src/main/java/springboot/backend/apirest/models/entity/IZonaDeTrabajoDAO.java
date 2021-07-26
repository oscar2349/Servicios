package springboot.backend.apirest.models.entity;

import java.util.List;

public interface IZonaDeTrabajoDAO {
	
	public Zonatrabajo findOne(Integer id);
	public  List<Zonatrabajo> findAll();
	

}
