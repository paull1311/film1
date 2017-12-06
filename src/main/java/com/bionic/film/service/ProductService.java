package com.bionic.film.service;



import com.bionic.film.model.Product;

import java.util.List;

/**
 * Created by leo on 16.04.2016.
 */
public interface ProductService {
     void addProduct(Product product);
     List<Product> getProducts();

}
