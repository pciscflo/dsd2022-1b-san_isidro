package com.upc.ventas.rest;

import com.upc.ventas.entidades.Producto;
import com.upc.ventas.negocio.NegocioProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RestProducto {
   @Autowired
   private NegocioProducto negocioProducto;
   @PostMapping("/producto")
   public Producto registrar(@RequestBody Producto producto){
       return negocioProducto.registrar(producto);
   }

   @GetMapping("/productos")
   public List<Producto> obtenerProductos(){
      return negocioProducto.obtenerProductos();
   }

   @GetMapping("/producto/{codigo}")
   public Producto obtenerProducto(@PathVariable(value = "codigo") Long codigo){
      return negocioProducto.obtenerProducto(codigo);
   }
   @DeleteMapping("/producto/{codigo}")
   public Producto borrar(@PathVariable(value = "codigo") Long codigo){
      return negocioProducto.borrarProducto(codigo);
   }


}
