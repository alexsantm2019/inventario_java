package com.inventario1.inventario1.controllers;

import com.inventario1.inventario1.entities.Client;

import com.inventario1.inventario1.repositories.ClientRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Product controller.
 */

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/cliente")
public class ClientController {
     @Autowired

     private ClientRepository clientRepository;
          
     @GetMapping("/clients")
     public List<Client> getAllClients() {
       return clientRepository.findAll();
     }

     @PostMapping(value = "/save", consumes = {"application/xml","application/json"})
     @ResponseBody
     public Client createClient(@RequestBody Client client) {
       return clientRepository.save(client);
     }     
         
     @PutMapping("/update/{id}")
     @ResponseBody    
     public Client updateClient(@PathVariable(value = "id") Long id, @RequestBody Client client) {       
    	 Client updateClient = clientRepository.findById(id).orElseThrow();
    	 updateClient.setNombre(client.getNombre());
    	 updateClient.setApellido(client.getApellido());    		    
    	 return  clientRepository.save(updateClient);      	 
     }
      
     /*
     @DeleteMapping("/delete/{id}")
     public String deleteClient(@PathVariable Long id) {    	 
    	 clientRepository.deleteById(id);
         return "Cliente eliminado";
     }
     */
     
     @DeleteMapping("/delete/{id}")
     public ResponseEntity<Void> deleteClient(@PathVariable Long id) {    	 
    	 clientRepository.deleteById(id);
    	 return ResponseEntity.noContent().build();    	
     } 
     
 
          
     @GetMapping("/mensaje")
     public String mensaje() {
         return "hola desde controlador";
     }

}