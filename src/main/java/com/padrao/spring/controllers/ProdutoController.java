package com.padrao.spring.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.padrao.spring.entities.Product;

@Controller
@RequestMapping( value="product")
public class ProdutoController {
	
	@RequestMapping( method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		List<Product> ListaDeProdutos = new ArrayList<Product>();  
		ListaDeProdutos.add( new Product("p01","nome 1","unnamed1.gif", 20, 4) );
		ListaDeProdutos.add( new Product("p02","nome 2","unnamed2.gif", 30, 3) );
		ListaDeProdutos.add( new Product("p03","nome 3","unnamed3.gif", 302, 9) );
		modelMap.put("products", ListaDeProdutos);
		return "product/index";
	}
}
