package com.uce.edu.demo.repository;

import java.util.List;

import com.uce.edu.demo.modelo.Producto;
import com.uce.edu.demo.sencillo.ProductoStockDto;


public interface IProductoRepository {
	 public Producto ingresoPro(Producto producto);
	 public ProductoStockDto bucarPorCodigoBarras(String codigo);
	 public Producto bucarPorCodigo(String codigo);
	 public List<Producto> bucarProduto();
}
