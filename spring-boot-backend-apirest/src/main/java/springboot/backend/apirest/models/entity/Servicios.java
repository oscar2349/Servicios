/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Oramirez
 */
@Entity
@Table(name = "servicios", catalog = "mydb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Servicios.findAll", query = "SELECT s FROM Servicios s")
    , @NamedQuery(name = "Servicios.findByIdServicios", query = "SELECT s FROM Servicios s WHERE s.idServicios = :idServicios")
    , @NamedQuery(name = "Servicios.findByNombreServicio", query = "SELECT s FROM Servicios s WHERE s.nombreServicio = :nombreServicio")
    , @NamedQuery(name = "Servicios.findByDescripcion", query = "SELECT s FROM Servicios s WHERE s.descripcion = :descripcion")
    , @NamedQuery(name = "Servicios.findByValorBase", query = "SELECT s FROM Servicios s WHERE s.valorBase = :valorBase")})
public class Servicios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idServicios")
    private Integer idServicios;
    @Column(name = "NombreServicio")
    private String nombreServicio;
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "ValorBase")
    private String valorBase;
    @ManyToMany(mappedBy = "serviciosList")
    private List<Proveedoresservicio> proveedoresservicioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "serviciosidServicios")
    private List<Ordendeservicio> ordendeservicioList;

    public Servicios() {
    }

    public Servicios(Integer idServicios) {
        this.idServicios = idServicios;
    }

    public Integer getIdServicios() {
        return idServicios;
    }

    public void setIdServicios(Integer idServicios) {
        this.idServicios = idServicios;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getValorBase() {
        return valorBase;
    }

    public void setValorBase(String valorBase) {
        this.valorBase = valorBase;
    }

    @XmlTransient
    public List<Proveedoresservicio> getProveedoresservicioList() {
        return proveedoresservicioList;
    }

    public void setProveedoresservicioList(List<Proveedoresservicio> proveedoresservicioList) {
        this.proveedoresservicioList = proveedoresservicioList;
    }

    @XmlTransient
    public List<Ordendeservicio> getOrdendeservicioList() {
        return ordendeservicioList;
    }

    public void setOrdendeservicioList(List<Ordendeservicio> ordendeservicioList) {
        this.ordendeservicioList = ordendeservicioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idServicios != null ? idServicios.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Servicios)) {
            return false;
        }
        Servicios other = (Servicios) object;
        if ((this.idServicios == null && other.idServicios != null) || (this.idServicios != null && !this.idServicios.equals(other.idServicios))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.mavenproject1.Servicios[ idServicios=" + idServicios + " ]";
    }
    
}
