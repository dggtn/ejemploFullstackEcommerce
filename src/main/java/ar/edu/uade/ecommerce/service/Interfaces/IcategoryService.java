package ar.edu.uade.ecommerce.service;

import ar.edu.uade.ecommerce.entity.Category;
import ar.edu.uade.ecommerce.exceptions.CategoryDuplicateException;

import java.util.ArrayList;
import java.util.Optional;

public interface IcategoryService {
    public ArrayList<Category> getCategories();

    public Optional<Category> getCategoryById(int categoryId);

    public Category createCategory(int newCategoryId, String description)throws CategoryDuplicateException;
}

