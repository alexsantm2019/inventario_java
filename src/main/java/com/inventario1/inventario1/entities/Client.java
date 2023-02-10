
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

    
  /**
   * Gets id.
   *
   * @return the id
   */
  public long getId() {
        return id;
    }

  /**
   * Sets id.
   *
   * @param id the id
   */
  public void setId(long id) {
        this.id = id;
    }

  /**
   * Gets first name.
   *
   * @return the first name
   */
  public String getNombre() {
        return nombre;
    }

  /**
   * Sets first name.
   *
   * @param firstName the first name
   */
  public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  /**
   * Gets last name.
   *
   * @return the last name
   */
  public String getApellido() {
        return apellido;
    }

  /**
   * Sets last name.
   *
   * @param lastName the last name
   */
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