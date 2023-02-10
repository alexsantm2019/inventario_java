package com.inventario1.inventario1.repositories;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.inventario1.inventario1.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

	
	
}