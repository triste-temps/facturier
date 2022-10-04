package com.facturator.bill.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facturator.bill.crud.entity.Client;
import com.facturator.bill.crud.entity.FactureProduit;
import com.facturator.bill.crud.repository.FactureProduitRepository;

@Service
public class FactureProduitService {

	@Autowired
	private FactureProduitRepository fpr;
	
	public FactureProduit saveBillProduct(FactureProduit fp) {
		
		FactureProduit newBillProduct = fpr.save(fp);
		return newBillProduct;
	}
	
	public List <FactureProduit> allBillProduct(){
		
		List<FactureProduit> allBillProduct = fpr.findAll();
		return allBillProduct;
	}
	
	public FactureProduit findBillProduct(int id) {
		Optional<FactureProduit> resultatId = fpr.findById(id);
		
		FactureProduit testId = null;
		
		if (resultatId.isPresent()) {
			testId = resultatId.get();
		} else {
			throw new RuntimeException("Je n'ai pas trouvé cette id : " + id);
		
		}
		
		return testId;
	}
	
	public void updateBillProduct (FactureProduit fp, int id) {
		fpr.save(fp);
	}
	
	public void deleteBillProduct(int id) {
		fpr.deleteById(id);
	}
}
