package edu.poly.shop.repository;

import edu.poly.shop.domain.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository for Category domain
 * Author: Nguyen Ngoc Anh - anhnnst@yahoo.com
 */
@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
    List<Category> findCategoriesByNameContaining(String name);
}
