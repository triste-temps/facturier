package com.facturator.bill.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.facturator.bill.crud.entity.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Integer> {

}
