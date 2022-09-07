package com.uce.edu.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uce.edu.demo.modelo.Producto;
import com.uce.edu.demo.modelo.Venta;

import com.uce.edu.demo.sencillo.ProductoVentaDto;
import com.uce.edu.demo.service.IVentaService;

@Controller
@RequestMapping("/ventas")
public class VentaController {
	@Autowired
	private IVentaService ventaService;
	
	@GetMapping
	public String listar(Model modelo) {
		List<Venta> ventas=this.ventaService.buscarVenta();
		modelo.addAttribute("listaVentas", ventas);
		return "listaVentas";
	}
	
	@PostMapping("/{numeroCedula}/{numeroNumero}")
	public String crearVenta(@PathVariable("numeroCedula") String cedula, @PathVariable("numeroNumero") String numero, List<ProductoVentaDto> ventas, Model modelo) {
		ventaService.insertar(cedula, numero, ventas);
		modelo.addAttribute("VentaDto", new ProductoVentaDto());
		modelo.addAttribute("Venta", new Venta());
		return "redirect:/ventas";
	}
	
	@GetMapping("/nuevo")
	public String nuevo(Model modelo) {
		
		modelo.addAttribute("VentaDto", new ProductoVentaDto());
		modelo.addAttribute("Venta", new Venta());
		return "CrearVenta";
	}
	

}
