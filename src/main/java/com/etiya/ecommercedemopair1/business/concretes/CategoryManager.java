package com.etiya.ecommercedemopair1.business.concretes;

import com.etiya.ecommercedemopair1.business.abstracts.CategoryService;
import com.etiya.ecommercedemopair1.business.dto.request.category.AddCategoryRequest;
import com.etiya.ecommercedemopair1.business.dto.response.category.GetCategoryResponse;
import com.etiya.ecommercedemopair1.entities.concretes.Category;
import com.etiya.ecommercedemopair1.repository.abstracts.CategoryRepository;
import com.etiya.ecommercedemopair1.çore.util.mapping.MapperService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class CategoryManager implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    private MapperService modelMapperService;

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getById(int id) {
        return categoryRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Category> findAllByName(String name) {
        return categoryRepository.findAllByName(name);
    }

    @Override
    public List<Category> getCategoryWithIdDesc() {
        return categoryRepository.getCategoryWithIdDesc();
    }




    @Override
    public GetCategoryResponse addCategoryWithResponse(AddCategoryRequest addCategoryRequest) {
        /*Category category=new Category();
        category.setName(addCategoryRequest.getName());
        checkCategoryNameExists(category);

       Category category1= categoryRepository.save(category);
       GetCategoryResponse getCategoryResponse=new GetCategoryResponse();
       getCategoryResponse.setId(category1.getId());
       getCategoryResponse.setName(category1.getName());*/
        Category category = modelMapperService.getMapperforRequest().map(addCategoryRequest,Category.class);
        checkCategoryNameExists(category);
        Category savedCategory = this.categoryRepository.save(category);
        GetCategoryResponse response = modelMapperService.getMapperforResponse().map(category, GetCategoryResponse.class);
        return response;

    }

    @Override
    public boolean existsById(int id) {
        return categoryRepository.existsById(id);
    }

    private void checkCategoryNameExists(Category category){
        List<Category> categories = categoryRepository.findAll();
        for (Category categoryItem :categories) {
            if (categoryItem.getName().equals(category.getName())){
                throw new RuntimeException("This category already exists");
            }
        }

    }
}
