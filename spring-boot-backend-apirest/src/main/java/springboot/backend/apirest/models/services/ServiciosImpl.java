package springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboot.backend.apirest.models.dao.IServicios;
import springboot.backend.apirest.models.entity.IServiciosDAO;
import springboot.backend.apirest.models.entity.Servicios;

@Service
public class ServiciosImpl implements IServiciosDAO {

	@Autowired
	private IServicios serviciosDao;

	@Override
	public Servicios findOne(Integer id) {
		return serviciosDao.findById(id).orElse(null);
	}
	

	@Override
	public List<Servicios> findAll() {

		return (List<Servicios>) serviciosDao.findAll();
	}

}
