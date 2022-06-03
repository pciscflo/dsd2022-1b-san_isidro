package com.upc.ventas.repositorios;

import com.upc.ventas.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioProducto extends JpaRepository<Producto,Long> {
}
