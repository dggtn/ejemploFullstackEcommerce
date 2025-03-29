package ar.edu.uade.ecommerce.service.Interfaces;

import ar.edu.uade.ecommerce.entity.Category;
import ar.edu.uade.ecommerce.exceptions.CategoryDuplicateException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface IcategoryService {
    public List<Category> getCategories();

    public Optional<Category> getCategoryById(Long categoryId);

    Category createCategory(String description) throws CategoryDuplicateException;

//    public Category createCategory(int newCategoryId, String description)throws CategoryDuplicateException;
}

