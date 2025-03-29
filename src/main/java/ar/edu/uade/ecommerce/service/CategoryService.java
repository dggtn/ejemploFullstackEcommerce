package ar.edu.uade.ecommerce.service;

import ar.edu.uade.ecommerce.entity.Category;

import ar.edu.uade.ecommerce.exceptions.CategoryDuplicateException;
import ar.edu.uade.ecommerce.repository.IcategoryRepository;
import ar.edu.uade.ecommerce.service.Interfaces.IcategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


@Service
public class CategoryService implements IcategoryService {
    @Autowired
    private IcategoryRepository categoryRepository;

    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

    public Optional<Category> getCategoryById(Long categoryId) {
        return categoryRepository.findById(categoryId);
    }

    public Category createCategory( String description) throws CategoryDuplicateException {
        List<Category> categories = categoryRepository.findAll();
        if (categories.stream().anyMatch(
                category -> category.getDescription().equals(description)))
            throw new CategoryDuplicateException();
        return categoryRepository.save(new Category(description));
    }
}
