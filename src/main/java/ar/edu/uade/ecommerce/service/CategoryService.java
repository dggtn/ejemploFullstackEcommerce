package ar.edu.uade.ecommerce.service;

import ar.edu.uade.ecommerce.entity.Category;
import ar.edu.uade.ecommerce.exceptions.CategoryDuplicateException;
import ar.edu.uade.ecommerce.repository.CategoryRepository;

import java.util.ArrayList;
import java.util.Optional;



public class CategoryService {
    private CategoryRepository categoryRepository;

    public CategoryService() {
        categoryRepository = new CategoryRepository();
    }

    public ArrayList<Category> getCategories() {
        return categoryRepository.getCategories();
    }

    public Optional<Category> getCategoryById(int categoryId) {
        return categoryRepository.getCategoryById(categoryId);
    }

    public Category createCategory(int newCategoryId, String description) throws CategoryDuplicateException {
        ArrayList<Category> categories = categoryRepository.getCategories();
        if (categories.stream().anyMatch(
                category -> category.getId() == newCategoryId && category.getDescription().equals(description)))
            throw new CategoryDuplicateException();
        return categoryRepository.createCategory(newCategoryId, description);
    }
}
