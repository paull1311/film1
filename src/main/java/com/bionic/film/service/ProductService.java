package com.bionic.film.service;



import com.bionic.film.model.Product;

import java.util.List;

/**
 * Created by Paul.
 */
public interface ProductService {
     void addProduct(Product product);
     List<Product> getProducts();

}
