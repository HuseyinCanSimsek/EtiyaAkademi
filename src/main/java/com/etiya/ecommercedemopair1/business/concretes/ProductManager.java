package com.etiya.ecommercedemopair1.business.concretes;

import com.etiya.ecommercedemopair1.business.abstracts.CategoryService;
import com.etiya.ecommercedemopair1.business.abstracts.ProductService;
import com.etiya.ecommercedemopair1.business.dto.request.category.AddCategoryRequest;
import com.etiya.ecommercedemopair1.business.dto.request.product.AddProductRequest;
import com.etiya.ecommercedemopair1.business.dto.response.address.GetAddressResponse;
import com.etiya.ecommercedemopair1.business.dto.response.category.GetCategoryResponse;
import com.etiya.ecommercedemopair1.business.dto.response.product.GetProductResponse;
import com.etiya.ecommercedemopair1.entities.concretes.Address;
import com.etiya.ecommercedemopair1.entities.concretes.Category;
import com.etiya.ecommercedemopair1.entities.concretes.Product;
import com.etiya.ecommercedemopair1.entities.concretes.ProductCategory;
import com.etiya.ecommercedemopair1.repository.abstracts.CategoryRepository;
import com.etiya.ecommercedemopair1.repository.abstracts.ProductRepository;
import com.etiya.ecommercedemopair1.çore.util.mapping.MapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductManager implements ProductService {
    private final ProductRepository productRepository;
    private final CategoryService categoryService;
    private final MapperService mapperService;

    @Autowired
    public ProductManager(ProductRepository productRepository,CategoryService categoryService,MapperService mapperService) {
        this.productRepository = productRepository;
        this.categoryService=categoryService;
        this.mapperService=mapperService;
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

       /* Product product=new Product();
        Category category = new Category();
        GetCategoryResponse getCategoryResponse=new GetCategoryResponse();
        product.setName(addProductRequest.getName());
        product.setStock(addProductRequest.getStock());
        product.setUnitPrice(addProductRequest.getUnitPrice());
        product.setDiscountRate(addProductRequest.getDiscountRate());
        category.setId(addProductRequest.getCategoryId());
        checkCategoryWithId(addProductRequest.getCategoryId());
        productRepository.save(product);

        GetProductResponse getProductResponse= new GetProductResponse(product.getName(), product.getStock(), product.getUnitPrice(), product.getDiscountRate());*/
        Product product=mapperService.getMapperforRequest().map(addProductRequest,Product.class);
        checkCategoryWithId(addProductRequest.getCategoryId());
        productRepository.save(product);
        GetProductResponse getProductResponse=mapperService.getMapperforResponse().map(product,GetProductResponse.class);
        return getProductResponse;

    }
    public void checkCategoryWithId(int id)
    {
        boolean isExists=categoryService.existsById(id);

            if(!isExists){
                throw new RuntimeException("This category does not exist");
            }




    }
}
