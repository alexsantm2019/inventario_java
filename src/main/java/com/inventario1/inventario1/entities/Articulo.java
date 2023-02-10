package com.inventario1.inventario1.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "articulo")
public class Articulo {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="id")
	    private Long  id;

	    @Column(name = "nombre", nullable = false)
	    private String nombre;

	    @Column(name = "codigo", nullable = false)
	    private String codigo;
	    
	    @Column(name = "precio_unitario", nullable = false)
	    private Float precioUnitario;
    
	    @Column(name = "orden_id", nullable = false)
	    private Integer ordenId;

	    
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
	  public String getCodigo() {
	        return codigo;
	    }

	  /**
	   * Sets last name.
	   *
	   * @param lastName the last name
	   */
	  public void setCodigo(String codigo) {
	        this.codigo = codigo;
	    }
	  
	  /**
	   * Gets last name.
	   *
	   * @return the last name
	   */
	  public Float getPrecioUnitario() {
	        return precioUnitario;
	    }

	  /**
	   * Sets last name.
	   *
	   * @param lastName the last name
	   */
	  public void setPrecioUnitario(Float precioUnitario) {
	        this.precioUnitario = precioUnitario;
	    }	  
	  
	  
	  /**
	   * Gets last name.
	   *
	   * @return the last name
	   */
	  public Integer getOrdenId() {
	        return ordenId;
	    }

	  /**
	   * Sets last name.
	   *
	   * @param lastName the last name
	   */
	  public void setOrdenId(Integer ordenId) {
	        this.ordenId = ordenId;
	    }		  
	
	
}
