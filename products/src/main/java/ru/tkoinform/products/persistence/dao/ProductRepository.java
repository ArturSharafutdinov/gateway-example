package ru.tkoinform.products.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.tkoinform.products.persistence.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
