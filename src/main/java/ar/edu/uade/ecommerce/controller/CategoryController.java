package ar.edu.uade.ecommerce.controller;

import ar.edu.uade.ecommerce.entity.Category;
import ar.edu.uade.ecommerce.entity.dto.CategoryRequest;
import ar.edu.uade.ecommerce.exceptions.CategoryDuplicateException;
import ar.edu.uade.ecommerce.service.Interfaces.IcategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping("categories")
public class CategoryController  {
    @Autowired
    private IcategoryService categoryService ;


    @GetMapping
    public ResponseEntity<List<Category>> getCategories() {
        return ResponseEntity.ok(categoryService.getCategories());
    }

    @GetMapping("/{categoryId}")
    public ResponseEntity<Category> getCategoryById(@PathVariable Long categoryId) {
        Optional<Category> result = categoryService.getCategoryById(categoryId);
        if (result.isPresent())
            return ResponseEntity.ok(result.get());

        return ResponseEntity.noContent().build();
    }

    @PostMapping
    public ResponseEntity<Object> createCategory(@RequestBody CategoryRequest categoryRequest)
            throws CategoryDuplicateException {
        Category result = categoryService.createCategory( categoryRequest.getDescription());
        return ResponseEntity.created(URI.create("/categories/" + result.getId())).body(result);
    }
}
