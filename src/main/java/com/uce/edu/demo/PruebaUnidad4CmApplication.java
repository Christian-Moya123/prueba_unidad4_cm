package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Producto;
import com.uce.edu.demo.sencillo.ProductoReporteDto;
import com.uce.edu.demo.sencillo.ProductoStockDto;
import com.uce.edu.demo.sencillo.ProductoVentaDto;
import com.uce.edu.demo.service.IProductoService;
import com.uce.edu.demo.service.IVentaService;


@SpringBootApplication
public class PruebaUnidad4CmApplication  implements CommandLineRunner{
	private static Logger logger = Logger.getLogger(PruebaUnidad4CmApplication.class);
	
	@Autowired
	private IProductoService productoService;
	
	@Autowired
	private IVentaService ventaService;

	public static void main(String[] args) {
		SpringApplication.run(PruebaUnidad4CmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}

}
