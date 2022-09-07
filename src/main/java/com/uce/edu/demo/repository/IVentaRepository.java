package com.uce.edu.demo.repository;

import java.util.List;

import com.uce.edu.demo.modelo.Producto;
import com.uce.edu.demo.modelo.Venta;

public interface IVentaRepository {
	Venta insertar(Venta venta);
	 public List<Venta> bucarVenta();
}
