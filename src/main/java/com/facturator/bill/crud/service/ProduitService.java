package com.facturator.bill.crud.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facturator.bill.crud.entity.Produit;
import com.facturator.bill.crud.repository.ProduitRepository;

@Service
public class ProduitService {

	@Autowired
	private ProduitRepository pr;
		
	@Transactional
    public Produit saveProduct(Produit pro) {
    
        Produit newProduct = pr.save(pro);
        return newProduct;
	
	}
	
	public List<Produit> allProduct(){
		
		List<Produit> allProduct = pr.findAll();
		return allProduct;
	}
	
	public Produit findProduct(int id) {
		Optional<Produit> resultatId = pr.findById(id);
		
		Produit testId = null;
		
		if (resultatId.isPresent()) {
			testId = resultatId.get();
		} else {
			throw new RuntimeException("Je n'ai pas trouvé cette id : " + id);
		
		}
		
		return testId;
	}
	
	public void updateProduct (Produit pro, int id) {
		pr.save(pro);
	}
	
	public void deleteProduct(int id) {
		pr.deleteById(id);
	}
	
}