package com.inventario1.inventario1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventario1.inventario1.entities.Client;
import com.inventario1.inventario1.entities.Orden;

public interface OrdenRepository  extends JpaRepository<Orden, Long>{

}
