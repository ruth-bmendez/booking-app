package com.hoteles.hoteles.Service.impl;

import com.hoteles.hoteles.Entities.Category;
import com.hoteles.hoteles.Repository.ICategoryRepository;
import com.hoteles.hoteles.Service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private ICategoryRepository categoryRepository;

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }
    @Override
    public Category getCategoryById(Long idCategory) {
        return categoryRepository.findById(idCategory).get();
    }
    @Override
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }
    @Override
    public Category updateCategory(Category category) {
        return categoryRepository.save(category);
    }
    @Override
    public void deleteCategory(Long idCategory) {
        categoryRepository.deleteById(idCategory);
    }
}
