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

import com.inventario1.inventario1.entities.Articulo;
import com.inventario1.inventario1.repositories.ArticuloRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/articulo")
public class ArticuloController {
	 @Autowired

     private ArticuloRepository articuloRepository;
     
     @GetMapping("/articulos")
     public List<Articulo> getAllOrdenes() {
       return articuloRepository.findAll();
     }

     @PostMapping(value = "/save", consumes = {"application/xml","application/json"})
     @ResponseBody
     public Articulo createArticulo(@RequestBody Articulo articulo) {
       return articuloRepository.save(articulo);
     }     
         
     @PutMapping("/update/{id}")
     @ResponseBody    
     public Articulo updateOrden(@PathVariable(value = "id") Long id, @RequestBody Articulo articulo) {       
    	 Articulo updateArticulo = articuloRepository.findById(id).orElseThrow();
    	 updateArticulo.setNombre(articulo.getNombre());
    	 updateArticulo.setCodigo(articulo.getCodigo());
    	 updateArticulo.setPrecioUnitario(articulo.getPrecioUnitario());
    	 updateArticulo.setOrdenId(articulo.getOrdenId());
    	 return  articuloRepository.save(updateArticulo);      	 
     }
          
     /*
     @DeleteMapping("/delete/{id}")
     public String deleteArticulo(@PathVariable Long id) {    	 
    	 articuloRepository.deleteById(id);
         return "articulo eliminado";
     } 
     */
     @DeleteMapping("/delete/{id}")
     public ResponseEntity<Void> deleteArticulo(@PathVariable Long id) {    	 
    	 articuloRepository.deleteById(id);
    	 return ResponseEntity.noContent().build();    	
     } 
          
     @GetMapping("/mensaje")
     public String mensaje() {
         return "hola desde controlador";
     }
	
	
}
