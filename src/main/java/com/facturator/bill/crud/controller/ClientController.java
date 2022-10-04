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
import com.facturator.bill.crud.service.ClientService;

@RestController
@RequestMapping("/facturation")
public class ClientController {
	
	@Autowired
	private ClientService cs;
	
	@PostMapping("/client")
	public Client saveCustomer(@RequestBody Client cli) {
		Client newCustomer = cs.saveCustomer(cli);
		return newCustomer;
	}
	
	@GetMapping("/listeclient")
	public List<Client> allCustomer(){
		List<Client> listAllCustomer = cs.allCustomer();
		return listAllCustomer;
	}
	
	@GetMapping("/listeclient(cNumero)")
	public Client findCustomer(@PathVariable int cNumero) {
		Client newCustomer = cs.findCustomer(cNumero);
		return newCustomer;
	}
	
	@PutMapping("/listeclient")
	public Client updateCustomer(@RequestBody Client cli) {
		cs.saveCustomer(cli);
		return cli;
	}
	
	 @DeleteMapping("/listecustomer/{cNumero}")
	 public void deleteCustomer(@PathVariable("cNumero") int id) {
		cs.deleteCustomer(id);
	 }

}
