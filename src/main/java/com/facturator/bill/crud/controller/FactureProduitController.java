package com.facturator.bill.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.facturator.bill.crud.entity.Client;
import com.facturator.bill.crud.entity.FactureProduit;
import com.facturator.bill.crud.service.FactureProduitService;

@RestController
@RequestMapping("/facturation")public class FactureProduitController {

	@Autowired
	private FactureProduitService fps;
	
	@PostMapping("/FactureProduit")
	public FactureProduit saveBillProduct(@RequestBody FactureProduit fp) {
		FactureProduit newBillProduct = fps.saveBillProduct(fp);
		return newBillProduct;
	}
	
	@GetMapping("/listeFactureProduit")
	public List<FactureProduit> allBillProduct(){
		List<FactureProduit> allBillProduct = fps.allBillProduct();
		return allBillProduct;
	}
	
	@GetMapping("/listefactureproduit(fcId)")
	public FactureProduit findBillProduct(@PathVariable int fcId) {
	FactureProduit newBillProduct = fps.findBillProduct(fcId);
	return newBillProduct;
	}
	
	@PutMapping("/listefactureproduit")
	public FactureProduit updateBillProduct(@RequestBody FactureProduit fp) {
		fps.saveBillProduct(fp);
		return fp;
	}
	
	@DeleteMapping("/listecustomer/{cNumero}")
	public void deleteBillProduct(@PathVariable("fcId") int id) {
		fps.deleteBillProduct(id);
	}
	
}