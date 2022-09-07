package com.uce.edu.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.uce.edu.demo.modelo.Producto;

import com.uce.edu.demo.service.IProductoService;

@Controller
@RequestMapping("/productos")
public class ProductoController {
	
	@Autowired
	private IProductoService productoService;
	
	@GetMapping
	public String listar(Model modelo) {
		List<Producto> productos=this.productoService.bucarProduto();
		modelo.addAttribute("listaProductos", productos);
		return "listaProductos";
	}
	
	@PostMapping
	public String crearProducto(Producto producto, Model modelo) {
		productoService.ingresoPro(producto);
		modelo.addAttribute("ingresarProducto", new Producto());
		return "redirect:/productos";
	}
	
	@GetMapping("/nuevo")
	public String nuevo(Model modelo) {
		modelo.addAttribute("ingresarProducto", new Producto());
		return "CrearProducto";
	}
	
	
	

}
