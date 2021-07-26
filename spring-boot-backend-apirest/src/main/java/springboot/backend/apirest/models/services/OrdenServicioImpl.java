package springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.backend.apirest.models.dao.IOrdenServicio;
import springboot.backend.apirest.models.entity.IOrdenServicioDAO;
import springboot.backend.apirest.models.entity.Ordendeservicio;

@Service
public class OrdenServicioImpl implements IOrdenServicioDAO {

	@Autowired
	private IOrdenServicio orderDetailDao;

	
	public Ordendeservicio findOne(Integer id) {
		return orderDetailDao.findById(id).orElse(null);
	}
	

	@Override
	public List<Ordendeservicio> findAll() {

		return (List<Ordendeservicio>) orderDetailDao.findAll();
	}

}
