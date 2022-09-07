package com.uce.edu.demo.repository;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.DetalleVenta;
import com.uce.edu.demo.sencillo.ProductoReporteDto;




@Repository
@Transactional
public class DetalleVentaRepositoryImpl implements IDetalleVentaRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public DetalleVenta ingreso(DetalleVenta detalleVenta) {
		// TODO Auto-generated method stub
		this.entityManager.persist(detalleVenta);
		return detalleVenta;
	}

	@Override
	public List<ProductoReporteDto> reporteProductoVendido() {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery("SELECT new com.uce.edu.demo.sencillo.ProductoReporteDto(d.producto.codigoBarras, d.cantidad, d.producto.categoria, d.precioUnitario, d.subTotal) FROM DetalleVenta d");
		
		return jpqlQuery.getResultList();
	}

	@Override
	public List<ProductoReporteDto> reporteVenta(LocalDateTime fecha, String categoria, Integer cantidad) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery("SELECT new com.uce.edu.demo.sencillo.ProductoReporteDto(d.producto.codigoBarras, d.cantidad, d.producto.categoria, d.precioUnitario, d.subTotal) FROM DetalleVenta d where d.venta.fecha = :datoFecha  AND d.producto.categoria = :datoCategoria AND d.cantidad = :datoCantidad");
		jpqlQuery.setParameter("datoFecha", fecha);
		jpqlQuery.setParameter("datoCategoria", categoria);
		jpqlQuery.setParameter("datoCantidad", cantidad);
		return jpqlQuery.getResultList();
	}

	

	

	

}
