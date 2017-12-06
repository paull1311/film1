package com.bionic.film.dao;


import com.bionic.film.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Paul.
 */
public interface ProductDao extends JpaRepository<Product,Integer> {
}
