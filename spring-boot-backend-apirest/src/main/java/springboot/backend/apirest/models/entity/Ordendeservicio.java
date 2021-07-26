/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springboot.backend.apirest.models.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Oramirez
 */
@Entity
@Table(name = "ordendeservicio", catalog = "mydb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ordendeservicio.findAll", query = "SELECT o FROM Ordendeservicio o")
    , @NamedQuery(name = "Ordendeservicio.findByIdOrdenDeServicio", query = "SELECT o FROM Ordendeservicio o WHERE o.idOrdenDeServicio = :idOrdenDeServicio")})
public class Ordendeservicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idOrdenDeServicio")
    private Integer idOrdenDeServicio;
    @JoinColumn(name = "Servicios_idServicios", referencedColumnName = "idServicios")
    @ManyToOne(optional = false)
    private Servicios serviciosidServicios;

    public Ordendeservicio() {
    }

    public Ordendeservicio(Integer idOrdenDeServicio) {
        this.idOrdenDeServicio = idOrdenDeServicio;
    }

    public Integer getIdOrdenDeServicio() {
        return idOrdenDeServicio;
    }

    public void setIdOrdenDeServicio(Integer idOrdenDeServicio) {
        this.idOrdenDeServicio = idOrdenDeServicio;
    }

    public Servicios getServiciosidServicios() {
        return serviciosidServicios;
    }

    public void setServiciosidServicios(Servicios serviciosidServicios) {
        this.serviciosidServicios = serviciosidServicios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrdenDeServicio != null ? idOrdenDeServicio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ordendeservicio)) {
            return false;
        }
        Ordendeservicio other = (Ordendeservicio) object;
        if ((this.idOrdenDeServicio == null && other.idOrdenDeServicio != null) || (this.idOrdenDeServicio != null && !this.idOrdenDeServicio.equals(other.idOrdenDeServicio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Ordendeservicio[ idOrdenDeServicio=" + idOrdenDeServicio + " ]";
    }
    
}
