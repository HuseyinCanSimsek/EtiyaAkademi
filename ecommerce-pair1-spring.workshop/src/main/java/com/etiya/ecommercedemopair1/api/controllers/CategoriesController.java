package com.etiya.ecommercedemopair1.api.controllers;

import com.etiya.ecommercedemopair1.business.abstracts.CategoryService;
import com.etiya.ecommercedemopair1.business.abstracts.CustomerService;
import com.etiya.ecommercedemopair1.entities.concretes.Category;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoriesController {
    private  CategoryService categoryService;
    @Autowired
    public CategoriesController(CategoryService categoryService) {
        this.categoryService= categoryService;
    }
    @GetMapping("/getAll")
    public List<Category> getAll()
    {
        return categoryService.getAll();
    }
    @GetMapping("/getById/{id}")
    public Category getById(@PathVariable int id)
    {
        return categoryService.getById(id);
    }
    @GetMapping("/getByName")
    List<Category> findAllByName(@RequestParam("name")String name)
    {
        return  categoryService.findAllByName(name);
    }

    @GetMapping("/getByIdDesc")
    public List<Category> getCategoryWithIdDesc()
    {
        return categoryService.getCategoryWithIdDesc();
    }


}
