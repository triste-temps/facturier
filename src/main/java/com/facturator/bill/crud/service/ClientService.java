package com.facturator.bill.crud.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facturator.bill.crud.entity.Client;
import com.facturator.bill.crud.repository.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository cr;
	
	@Transactional
	public Client saveCustomer(Client cli) {
	
		Client newCustomer = cr.save(cli);
		return newCustomer ;
		
	}
	
	public List<Client> allCustomer(){
		
		List<Client> allCustomer = cr.findAll();
		return allCustomer;
	}
	
	public Client findCustomer(int id) {
		Optional<Client> resultatId = cr.findById(id);
		
		Client testId = null;
		
		if (resultatId.isPresent()) {
			testId = resultatId.get();
		} else {
			throw new RuntimeException("Je n'ai pas trouvé cette id : " + id);
		
		}
		
		return testId;
	}
	
	public void updateCustomer (Client cli, int id) {
		cr.save(cli);
	}
	
	public void deleteCustomer(int id) {
		cr.deleteById(id);
	}
}
