package com.uce.edu.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.modelo.DetalleVenta;
import com.uce.edu.demo.modelo.Producto;
import com.uce.edu.demo.modelo.Venta;
import com.uce.edu.demo.sencillo.ProductoReporteDto;
import com.uce.edu.demo.sencillo.ProductoVentaDto;



public interface IVentaService {
	Venta insertar(String cedula, String numero, List<ProductoVentaDto> productos);
	public List<ProductoReporteDto> reporteProductoVendido();
	
	List<ProductoReporteDto> reporteVenta(LocalDateTime fecha, String categoria, Integer cantidad);
	
	public List<Venta> buscarVenta();
	

}
