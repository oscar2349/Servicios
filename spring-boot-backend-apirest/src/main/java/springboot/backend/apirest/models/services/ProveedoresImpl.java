package springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.backend.apirest.models.dao.IProveedores;
import springboot.backend.apirest.models.entity.IProveedoresDAO;
import springboot.backend.apirest.models.entity.Proveedoresservicio;

@Service
public class ProveedoresImpl implements IProveedoresDAO {

	@Autowired
	private IProveedores proveedoresDao;

	@Override
	public Proveedoresservicio findOne(Integer id) {
		return proveedoresDao.findById(id).orElse(null);
	}
	

	@Override
	public List<Proveedoresservicio> findAll() {

		return (List<Proveedoresservicio>) proveedoresDao.findAll();
	}

}
