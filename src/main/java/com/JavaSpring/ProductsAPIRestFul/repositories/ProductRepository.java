package com.JavaSpring.ProductsAPIRestFul.repositories;

import com.JavaSpring.ProductsAPIRestFul.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * Repository
 */
@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID> {

}
