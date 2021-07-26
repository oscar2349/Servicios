package springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Oramirez
 */
@Entity
@Table(name = "zonatrabajo", catalog = "mydb", schema = "")

public class Zonatrabajo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idZonaTrabajo")
    private Integer idZonaTrabajo;
    @Column(name = "ubicacion")
    private String ubicacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "zonatrabajo")
    private List<Proveedoresservicio> proveedoresservicioList;

    public Zonatrabajo() {
    }

    public Zonatrabajo(Integer idZonaTrabajo) {
        this.idZonaTrabajo = idZonaTrabajo;
    }

    public Integer getIdZonaTrabajo() {
        return idZonaTrabajo;
    }

    public void setIdZonaTrabajo(Integer idZonaTrabajo) {
        this.idZonaTrabajo = idZonaTrabajo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<Proveedoresservicio> getProveedoresservicioList() {
        return proveedoresservicioList;
    }

    public void setProveedoresservicioList(List<Proveedoresservicio> proveedoresservicioList) {
        this.proveedoresservicioList = proveedoresservicioList;
    }
}
