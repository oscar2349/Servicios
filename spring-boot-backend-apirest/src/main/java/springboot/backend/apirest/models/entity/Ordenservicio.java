package springboot.backend.apirest.models.entity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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

/**
 *
 * @author Oramirez
 */
@Entity
@Table(name = "ordenservicio", catalog = "mydb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Ordenservicio.findAll", query = "SELECT o FROM Ordenservicio o")})
public class Ordenservicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idOrdenServicio")
    private Integer idOrdenServicio;
    @JoinColumn(name = "servicios_idServicios", referencedColumnName = "idServicios")
    @ManyToOne(optional = false)
    private Servicios servicios;

    public Ordenservicio() {
    }

    public Ordenservicio(Integer idOrdenServicio) {
        this.idOrdenServicio = idOrdenServicio;
    }

    public Integer getIdOrdenServicio() {
        return idOrdenServicio;
    }

    public void setIdOrdenServicio(Integer idOrdenServicio) {
        this.idOrdenServicio = idOrdenServicio;
    }

    public Servicios getServicios() {
        return servicios;
    }

    public void setServicios(Servicios servicios) {
        this.servicios = servicios;
    }
    
}
