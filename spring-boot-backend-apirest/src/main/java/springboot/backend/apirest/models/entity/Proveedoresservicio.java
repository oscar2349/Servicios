package springboot.backend.apirest.models.entity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Oramirez
 */
@Entity
@Table(name = "proveedoresservicio", catalog = "mydb", schema = "")
public class Proveedoresservicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idProveedoresServicio")
    private Integer idProveedoresServicio;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "proveedoresservicio")
    private List<Servicios> serviciosList;
    @JoinColumn(name = "zonaTrabajo_idZonaTrabajo", referencedColumnName = "idZonaTrabajo")
    @ManyToOne(optional = false)
    private Zonatrabajo zonatrabajo;

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

    public List<Servicios> getServiciosList() {
        return serviciosList;
    }

    public void setServiciosList(List<Servicios> serviciosList) {
        this.serviciosList = serviciosList;
    }

    public Zonatrabajo getZonatrabajo() {
        return zonatrabajo;
    }

    public void setZonatrabajo(Zonatrabajo zonatrabajo) {
        this.zonatrabajo = zonatrabajo;
    }

    
}
