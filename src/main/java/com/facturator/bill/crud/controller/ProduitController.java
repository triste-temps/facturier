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
import com.facturator.bill.crud.entity.Produit;
import com.facturator.bill.crud.service.ProduitService;

@RestController
@RequestMapping("/facturation")
public class ProduitController {

@Autowired
private ProduitService ps;
// request body interragi avec le json on le fait dans le controller car c'est la derniere couche 

@PostMapping("/produit")
//http://localhost:8080/test/produit
public Produit saveProduit(@RequestBody Produit pro) {
    Produit newProduct = ps.saveProduct(pro);
    return newProduct;
}

@GetMapping("/listeproduit")

public List<Produit> allProduct(){
	List<Produit> listAllProduct = ps.allProduct();
	return listAllProduct;
}
	
@GetMapping("/listeproduit/{}pReference}")

public Produit findProduct(@PathVariable int pReference) {
	Produit newProduct = ps.findProduct(pReference);
	return newProduct;
}

@PutMapping("/listeproduit")
public Produit updateProduct(@RequestBody Produit pro) {
	ps.saveProduct(pro);
	return pro;
}

@DeleteMapping("/listeproduit/{pReference}")
public void deleteProduct(@PathVariable("pReference") int id) {
	//supprimer produit
	ps.deleteProduct(id);

}

}

