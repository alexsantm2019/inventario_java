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
	    
	    @Column(name = "preciounitario", nullable = false)
	    private Float precioUnitario;
    
	    @Column(name = "ordenid", nullable = false)
	    private Integer ordenId;

	    
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

	  public String getCodigo() {
	        return codigo;
	    }

	  public void setCodigo(String codigo) {
	        this.codigo = codigo;
	    }
	  
	  public Float getPrecioUnitario() {
	        return precioUnitario;
	    }

	  public void setPrecioUnitario(Float precioUnitario) {
	        this.precioUnitario = precioUnitario;
	    }	  
	  
	  public Integer getOrdenId() {
	        return ordenId;
	    }

	  public void setOrdenId(Integer ordenId) {
	        this.ordenId = ordenId;
	    }		  
	
	
}
