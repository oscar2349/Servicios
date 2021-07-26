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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Oramirez
 */
@Entity
@Table(name = "servicios", catalog = "mydb", schema = "")

public class Servicios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idServicios")
    private Integer idServicios;
    @Column(name = "nombreServicio")
    private String nombreServicio;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "ValorBase")
    private String valorBase;
    @JoinColumn(name = "proveedoresServicio_idProveedoresServicio", referencedColumnName = "idProveedoresServicio")
    @ManyToOne(optional = false)
    private Proveedoresservicio proveedoresservicio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "servicios")
    private List<Ordenservicio> ordenservicioList;

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

    public Proveedoresservicio getProveedoresservicio() {
        return proveedoresservicio;
    }

    public void setProveedoresservicio(Proveedoresservicio proveedoresservicio) {
        this.proveedoresservicio = proveedoresservicio;
    }

    public List<Ordenservicio> getOrdenservicioList() {
        return ordenservicioList;
    }

    public void setOrdenservicioList(List<Ordenservicio> ordenservicioList) {
        this.ordenservicioList = ordenservicioList;
    }
    
}
