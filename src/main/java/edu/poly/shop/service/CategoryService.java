package edu.poly.shop.service;

import edu.poly.shop.domain.Category;

import java.util.List;
import java.util.Optional;

/**
 * Category Service Interface
 * Author: Nguyen Ngoc Anh - anhnnst@yahoo.com
 */
public interface CategoryService {
    Category save(Category s);

    Iterable<Category> saveAll(Iterable<Category> iterable);

    Optional<Category> findById(Long aLong);

    boolean existsById(Long aLong);

    Iterable<Category> findAll();

    Iterable<Category> findAllById(Iterable<Long> iterable);

    List<Category> findCategoriesByNameContaining(String name);

    long count();

    void deleteById(Long aLong);

    void delete(Category category);

    void deleteAll(Iterable<? extends Category> iterable);

    void deleteAll();
}
