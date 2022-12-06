package com.etiya.ecommercedemopair1.api.controllers;

import com.etiya.ecommercedemopair1.business.abstracts.ProductService;
import com.etiya.ecommercedemopair1.business.dto.request.product.AddProductRequest;
import com.etiya.ecommercedemopair1.business.dto.response.product.GetProductResponse;
import com.etiya.ecommercedemopair1.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
    private final ProductService productService;

    @Autowired
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getAll")
    public List<Product> getAll(){
        return productService.getAll();
    }

    @GetMapping("/getById/{id}")
    public  Product getById(@PathVariable int id){
        return productService.getById(id);
    }
    @GetMapping("/getName/{id}")
    public String getName(@PathVariable int id)
    {
        return productService.getName(id);
    }
    @GetMapping("/getAlphabeticProduct")
    public List<Product> findAllByOrderByNameAsc()
    {
        return productService.findAllByOrderByNameAsc();
    }
    @PostMapping("/add")
    public GetProductResponse addProduct(@RequestBody AddProductRequest p)
    {
        return productService.addProduct(p);
    }
    @PostMapping("/addone")
    public ResponseEntity<GetProductResponse> addProductOne(@RequestBody AddProductRequest p)
    {
        return new ResponseEntity<GetProductResponse>(HttpStatus.CREATED);
    }

}
