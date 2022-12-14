package com.etiya.ecommercedemopair1.business.abstracts;

import com.etiya.ecommercedemopair1.business.dto.request.product.AddProductRequest;
import com.etiya.ecommercedemopair1.business.dto.response.product.GetProductResponse;
import com.etiya.ecommercedemopair1.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
    Product getById(int id);
    List<Product> findAllByOrderByNameAsc();
    String getName(int id);
     GetProductResponse addProduct(AddProductRequest addProductRequest);
}
