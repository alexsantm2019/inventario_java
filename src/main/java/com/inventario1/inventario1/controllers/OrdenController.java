package com.inventario1.inventario1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.inventario1.inventario1.entities.Orden;
import com.inventario1.inventario1.repositories.OrdenRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/orden")
public class OrdenController {
	 @Autowired

     private OrdenRepository ordenRepository;
     
     @GetMapping("/ordenes")
     public List<Orden> getAllOrdenes() {
       return ordenRepository.findAll();
     }

     @PostMapping(value = "/save", consumes = {"application/xml","application/json"})
     @ResponseBody
     public Orden createOrden(@RequestBody Orden orden) {
       return ordenRepository.save(orden);
     }     
         
     @PutMapping("/update/{id}")
     @ResponseBody    
     public Orden updateOrden(@PathVariable(value = "id") Long id, @RequestBody Orden orden) {       
    	 Orden updateOrden = ordenRepository.findById(id).orElseThrow();
    	 updateOrden.setFecha(orden.getFecha());
    	 updateOrden.setCodigo(orden.getCodigo());    		    
    	 updateOrden.setClienteId(orden.getClienteId());
    	 return  ordenRepository.save(updateOrden);      	 
     }
          
     /*
     @DeleteMapping("/delete/{id}")
     public String deleteOrden(@PathVariable Long id) {    	 
    	 ordenRepository.deleteById(id);
         return "Orden eliminada";
     } 
     */
     @DeleteMapping("/delete/{id}")
     public ResponseEntity<Void> deleteOrden(@PathVariable Long id) {    	 
    	 ordenRepository.deleteById(id);
    	 return ResponseEntity.noContent().build();    	
     } 
          
     @GetMapping("/mensaje")
     public String mensaje() {
         return "hola desde controlador";
     }
	
	
}
