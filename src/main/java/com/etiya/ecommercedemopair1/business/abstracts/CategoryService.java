package com.etiya.ecommercedemopair1.business.abstracts;

import com.etiya.ecommercedemopair1.business.dto.request.category.AddCategoryRequest;
import com.etiya.ecommercedemopair1.business.dto.response.category.GetCategoryResponse;
import com.etiya.ecommercedemopair1.entities.concretes.Category;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CategoryService {
    List<Category> getAll();
    Category getById(int id);
    List<Category> findAllByName(String name);
    List<Category> getCategoryWithIdDesc();
    GetCategoryResponse addCategoryWithResponse(AddCategoryRequest addCategoryRequest);
    boolean existsById(int id);



}
