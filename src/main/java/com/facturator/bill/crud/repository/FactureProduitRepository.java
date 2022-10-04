package com.facturator.bill.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.facturator.bill.crud.entity.FactureProduit;

public interface FactureProduitRepository extends JpaRepository<FactureProduit, Integer> {

}
