
package com.inventario1.inventario1.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * The type User.
 *
 * @author Givantha Kalansuriya
 */
@Entity
@Table(name = "cliente")

public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long  id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellido", nullable = false)
    private String apellido;

    
  public long getId() {
        return id;
    }

  public void setId(long id) {
        this.id = id;
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

  

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", firstName='" + nombre + '\'' +
                ", lastName='" + apellido + '\'' +
                '}';
    }


}