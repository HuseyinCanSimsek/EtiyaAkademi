package com.etiya.ecommercedemopair1.business.concretes;

import com.etiya.ecommercedemopair1.business.abstracts.ProductService;
import com.etiya.ecommercedemopair1.business.dto.request.product.AddProductRequest;
import com.etiya.ecommercedemopair1.business.dto.response.product.GetProductResponse;
import com.etiya.ecommercedemopair1.entities.concretes.Category;
import com.etiya.ecommercedemopair1.entities.concretes.Product;
import com.etiya.ecommercedemopair1.repository.abstracts.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductManager implements ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductManager(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product getById(int id) {
        return productRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Product> findAllByOrderByNameAsc() {
        return productRepository.findAllByOrderByNameAsc();
    }


    @Override
    public String getName(int id) {
        return productRepository.getProductNameWithId(id);
    }

    @Override
    public GetProductResponse addProduct(AddProductRequest addProductRequest) {
        Product product=new Product();
        product.setName(addProductRequest.getName());
        product.setStock(addProductRequest.getStock());
        product.setUnitPrice(addProductRequest.getUnitPrice());
        product.setDiscountRate(addProductRequest.getDiscountRate());
        productRepository.save(product);
        GetProductResponse getProductResponse= new GetProductResponse(product.getName(), product.getStock(), product.getUnitPrice(), product.getDiscountRate());

        return getProductResponse;

    }
}
