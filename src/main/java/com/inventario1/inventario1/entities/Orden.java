package com.inventario1.inventario1.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orden")
public class Orden {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="id")
	    private Long  id;

	    @Column(name = "fecha", nullable = false)
	    private String fecha;

	    @Column(name = "codigo", nullable = false)
	    private String codigo;
    
	    @Column(name = "clienteid", nullable = false)
	    private Integer clienteId;

	    
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
	  public String getFecha() {
	        return fecha;
	    }

	  /**
	   * Sets first name.
	   *
	   * @param firstName the first name
	   */
	  public void setFecha(String fecha) {
	        this.fecha = fecha;
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
	  public Integer getClienteId() {
	        return clienteId;
	    }

	  /**
	   * Sets last name.
	   *
	   * @param lastName the last name
	   */
	  public void setClienteId(Integer clienteId) {
	        this.clienteId = clienteId;
	    }	  
	
	
}
