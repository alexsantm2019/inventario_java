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

    
	  public long getId() {
	        return id;
	    }


	  public void setId(long id) {
	        this.id = id;
	    }


	  public String getFecha() {
	        return fecha;
	    }


	  public void setFecha(String fecha) {
	        this.fecha = fecha;
	    }


	  public String getCodigo() {
	        return codigo;
	    }


	  public void setCodigo(String codigo) {
	        this.codigo = codigo;
	    }
	  

	  public Integer getClienteId() {
	        return clienteId;
	    }


	  public void setClienteId(Integer clienteId) {
	        this.clienteId = clienteId;
	    }	  
	
	
}
