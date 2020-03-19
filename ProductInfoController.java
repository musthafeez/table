package com.example.minilogin.controller;



import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



import com.example.minilogin.DAO.ProductInfoDao;



@CrossOrigin(origins = "http://localhost:4200")

@RestController

public class ProductInfoController {

	@Autowired

	private ProductInfoDao productInfo;

	

	@GetMapping("/products")

	public List getProducts() {	

	return productInfo.viewAllProducts();

}

	@GetMapping("/products1")

	public List getProducts1() {	

	return productInfo.viewAllProducts0();
}

	
	@GetMapping("/products2")

	public List getProducts2() {	

	return productInfo.viewAllProducts1();
}

		//clothes(2)
	@GetMapping("/products3")

	public List getProducts3() {	

	return productInfo.viewAllProducts2();
	
	
}
	//drinks(3)
	@GetMapping("/products4")

	public List getProducts4() {	

	return productInfo.viewAllProducts3();
	
	
}
	
}