package springboot.backend.apirest.models.entity;

import java.util.List;

public interface IProveedoresDAO {
	
	public Proveedoresservicio findOne(Integer id);
	public  List<Proveedoresservicio> findAll();
	

}
