/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Oramirez
 */
@Entity
@Table(name = "zonatrabajo", catalog = "mydb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Zonatrabajo.findAll", query = "SELECT z FROM Zonatrabajo z")
    , @NamedQuery(name = "Zonatrabajo.findByIdZonaTrabajo", query = "SELECT z FROM Zonatrabajo z WHERE z.idZonaTrabajo = :idZonaTrabajo")
    , @NamedQuery(name = "Zonatrabajo.findByUbicacion", query = "SELECT z FROM Zonatrabajo z WHERE z.ubicacion = :ubicacion")})
public class Zonatrabajo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idZonaTrabajo")
    private Integer idZonaTrabajo;
    @Column(name = "Ubicacion")
    private String ubicacion;
    @ManyToMany(mappedBy = "zonatrabajoList")
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

    @XmlTransient
    public List<Proveedoresservicio> getProveedoresservicioList() {
        return proveedoresservicioList;
    }

    public void setProveedoresservicioList(List<Proveedoresservicio> proveedoresservicioList) {
        this.proveedoresservicioList = proveedoresservicioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idZonaTrabajo != null ? idZonaTrabajo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zonatrabajo)) {
            return false;
        }
        Zonatrabajo other = (Zonatrabajo) object;
        if ((this.idZonaTrabajo == null && other.idZonaTrabajo != null) || (this.idZonaTrabajo != null && !this.idZonaTrabajo.equals(other.idZonaTrabajo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Zonatrabajo[ idZonaTrabajo=" + idZonaTrabajo + " ]";
    }
    
}
