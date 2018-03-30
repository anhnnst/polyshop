package edu.poly.shop.repository;

import edu.poly.shop.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for Product domain
 * Author: Nguyen Ngoc Anh - anhnnst@yahoo.com
 */
@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}
