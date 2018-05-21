/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.beans;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Daw2
 */
@Entity
@Table(name="direccion1a1Anot")
public class Direccion implements Serializable{
    
    @Id
    @Column(name="idDirec")
    private int id;
    
    @Column(name="calle")
    private String calle;
    
    @Column(name="numero")
    private int numero;
    
    @Column(name="poblacion")
    private String poblacion;
    
    @Column(name="provincia")
    private String provincia;

    public Direccion() {
    }

    public Direccion(int id, String calle, int numero, String poblacion, String provincia) {
        this.id = id;
        this.calle = calle;
        this.numero = numero;
        this.poblacion = poblacion;
        this.provincia = provincia;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }
    
    
}
