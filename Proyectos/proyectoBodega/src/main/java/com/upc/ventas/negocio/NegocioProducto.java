package com.upc.ventas.negocio;

import com.upc.ventas.entidades.Producto;
import com.upc.ventas.repositorios.RepositorioProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NegocioProducto {
    @Autowired
    private RepositorioProducto repositorioProducto;

    public Producto registrar(Producto producto){
        return repositorioProducto.save(producto);
    }
    public List<Producto> obtenerProductos(){
        return repositorioProducto.findAll();
    }
    public Producto obtenerProducto(Long codigo){
        return repositorioProducto.findById(codigo).get();
    }
    public Producto borrarProducto(Long codigo){
        Producto producto;
        producto = repositorioProducto.findById(codigo).get();
        repositorioProducto.delete(producto);
        return producto;
    }
    public Producto actualizarProducto(Producto producto){
        Producto p;
        p = repositorioProducto.findById(producto.getCodigo()).get();
        p = producto;
        return repositorioProducto.save(p);
    }
}
