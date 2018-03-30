package edu.poly.shop.service.impl;

import edu.poly.shop.domain.Category;
import edu.poly.shop.repository.CategoryRepository;
import edu.poly.shop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Category Service Implementation
 * Author: Nguyen Ngoc Anh - anhnnst@yahoo.com
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category save(Category s) {
        return categoryRepository.save(s);
    }

    @Override
    public Iterable<Category> saveAll(Iterable<Category> iterable) {
        return categoryRepository.saveAll(iterable);
    }

    @Override
    public Optional<Category> findById(Long aLong) {
        return categoryRepository.findById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return categoryRepository.existsById(aLong);
    }

    @Override
    public Iterable<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Iterable<Category> findAllById(Iterable<Long> iterable) {
        return categoryRepository.findAllById(iterable);
    }

    @Override
    public List<Category> findCategoriesByNameContaining(String name) {
        return categoryRepository.findCategoriesByNameContaining(name);
    }

    @Override
    public long count() {
        return categoryRepository.count();
    }

    @Override
    public void deleteById(Long aLong) {
        categoryRepository.deleteById(aLong);
    }

    @Override
    public void delete(Category category) {
        categoryRepository.delete(category);
    }

    @Override
    public void deleteAll(Iterable<? extends Category> iterable) {
        categoryRepository.deleteAll(iterable);
    }

    @Override
    public void deleteAll() {
        categoryRepository.deleteAll();
    }
}
