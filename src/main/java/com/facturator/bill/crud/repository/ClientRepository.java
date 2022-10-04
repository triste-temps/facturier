package com.facturator.bill.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.facturator.bill.crud.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
