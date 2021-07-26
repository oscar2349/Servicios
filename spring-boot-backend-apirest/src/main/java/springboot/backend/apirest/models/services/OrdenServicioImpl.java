package springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.backend.apirest.models.dao.IOrdenServicio;
import springboot.backend.apirest.models.entity.IOrdenServicioDAO;
import springboot.backend.apirest.models.entity.Ordenservicio;

@Service
public class OrdenServicioImpl implements IOrdenServicioDAO {

	@Autowired
	private IOrdenServicio orderDetailDao;

	
	public Ordenservicio findOne(Integer id) {
		return orderDetailDao.findById(id).orElse(null);
	}
	

	@Override
	public List<Ordenservicio> findAll() {

		return (List<Ordenservicio>) orderDetailDao.findAll();
	}

}
