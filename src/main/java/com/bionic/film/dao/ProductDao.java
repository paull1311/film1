package com.bionic.film.dao;


import com.bionic.film.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by leo on 16.04.2016.
 */
public interface ProductDao extends JpaRepository<Product,Integer> {
}
