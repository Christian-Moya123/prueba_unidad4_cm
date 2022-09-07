package com.uce.edu.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Venta;

@Repository
@Transactional
public class VentaRepositoryImpl implements IVentaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Venta insertar(Venta venta) {
		// TODO Auto-generated method stub
		this.entityManager.persist(venta);
		return venta;
	}

	@Override
	public List<Venta> bucarVenta() {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery("SELECT v FROM Venta v");
		return jpqlQuery.getResultList();
	}

}
