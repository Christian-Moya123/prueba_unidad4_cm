package com.uce.edu.demo.service;

import java.util.List;

import com.uce.edu.demo.modelo.Producto;
import com.uce.edu.demo.sencillo.ProductoStockDto;


public interface IProductoService {
	Producto ingresoPro(Producto producto);
	public ProductoStockDto bucarPorCodigoBarras(String codigo);
	 List<Producto> bucarProduto();
}
