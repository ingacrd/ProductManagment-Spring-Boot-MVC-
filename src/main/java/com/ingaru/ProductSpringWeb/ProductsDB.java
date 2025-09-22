package com.ingaru.ProductSpringWeb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsDB extends JpaRepository<Product, Integer> {


}
