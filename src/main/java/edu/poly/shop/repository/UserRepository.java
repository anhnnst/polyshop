package edu.poly.shop.repository;

import edu.poly.shop.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for User domain
 * Author: Nguyen Ngoc Anh - anhnnst@yahoo.com
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
