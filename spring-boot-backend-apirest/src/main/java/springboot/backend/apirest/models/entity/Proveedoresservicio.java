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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
@Table(name = "proveedoresservicio", catalog = "mydb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proveedoresservicio.findAll", query = "SELECT p FROM Proveedoresservicio p")
    , @NamedQuery(name = "Proveedoresservicio.findByIdProveedoresServicio", query = "SELECT p FROM Proveedoresservicio p WHERE p.idProveedoresServicio = :idProveedoresServicio")
    , @NamedQuery(name = "Proveedoresservicio.findByNombre", query = "SELECT p FROM Proveedoresservicio p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Proveedoresservicio.findByApellido", query = "SELECT p FROM Proveedoresservicio p WHERE p.apellido = :apellido")})
public class Proveedoresservicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idProveedoresServicio")
    private Integer idProveedoresServicio;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Apellido")
    private String apellido;
    @JoinTable(name = "zonatrabajo_has_proveedoresservicio", joinColumns = {
        @JoinColumn(name = "ProveedoresServicio_idProveedoresServicio", referencedColumnName = "idProveedoresServicio")}, inverseJoinColumns = {
        @JoinColumn(name = "ZonaTrabajo_idZonaTrabajo", referencedColumnName = "idZonaTrabajo")})
    @ManyToMany
    private List<Zonatrabajo> zonatrabajoList;
    @JoinTable(name = "proveedoresservicio_has_servicios", joinColumns = {
        @JoinColumn(name = "ProveedoresServicio_idProveedoresServicio", referencedColumnName = "idProveedoresServicio")}, inverseJoinColumns = {
        @JoinColumn(name = "Servicios_idServicios", referencedColumnName = "idServicios")})
    @ManyToMany
    private List<Servicios> serviciosList;

    public Proveedoresservicio() {
    }

    public Proveedoresservicio(Integer idProveedoresServicio) {
        this.idProveedoresServicio = idProveedoresServicio;
    }

    public Integer getIdProveedoresServicio() {
        return idProveedoresServicio;
    }

    public void setIdProveedoresServicio(Integer idProveedoresServicio) {
        this.idProveedoresServicio = idProveedoresServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @XmlTransient
    public List<Zonatrabajo> getZonatrabajoList() {
        return zonatrabajoList;
    }

    public void setZonatrabajoList(List<Zonatrabajo> zonatrabajoList) {
        this.zonatrabajoList = zonatrabajoList;
    }

    @XmlTransient
    public List<Servicios> getServiciosList() {
        return serviciosList;
    }

    public void setServiciosList(List<Servicios> serviciosList) {
        this.serviciosList = serviciosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProveedoresServicio != null ? idProveedoresServicio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveedoresservicio)) {
            return false;
        }
        Proveedoresservicio other = (Proveedoresservicio) object;
        if ((this.idProveedoresServicio == null && other.idProveedoresServicio != null) || (this.idProveedoresServicio != null && !this.idProveedoresServicio.equals(other.idProveedoresServicio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Proveedoresservicio[ idProveedoresServicio=" + idProveedoresServicio + " ]";
    }
    
}
