package ar.edu.uade.ecommerce.repository;


import ar.edu.uade.ecommerce.entity.Category;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;



public class CategoryRepository {
    private ArrayList<Category> categories;

    public CategoryRepository() {
        categories = new ArrayList<Category>(
                Arrays.asList(Category.builder().description("Frutas Secas").id(1).build(),
                        Category.builder().description("Lacteos").id(2).build(),
                        Category.builder().description("Bebidas").id(3).build()));
    }

    public ArrayList<Category> getCategories() {
        return this.categories;
    }

    public Optional<Category> getCategoryById(int categoryId) {
        return this.categories.stream().filter(m -> m.getId() == categoryId).findAny();
    }

    public Category createCategory(int newCategoryId, String description) {
        Category newCategory = Category.builder()
                .description(description)
                .id(newCategoryId).build();
        this.categories.add(newCategory);
        return newCategory;
    }
}
