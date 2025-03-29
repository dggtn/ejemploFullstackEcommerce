package ar.edu.uade.ecommerce.repository;


import ar.edu.uade.ecommerce.entity.Category;
import ar.edu.uade.ecommerce.exceptions.CategoryDuplicateException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;


@Repository
public interface IcategoryRepository extends JpaRepository<Category, Long> {
    public ArrayList<Category>getCategories();
    public Optional<Category> geyCategoryById(Long categoryId);
    public Category createCategory(String description)throws CategoryDuplicateException;





}
