package com.facturator.bill.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.facturator.bill.crud.entity.Facture;

public interface FactureRepository extends JpaRepository<Facture, Integer> {

}
