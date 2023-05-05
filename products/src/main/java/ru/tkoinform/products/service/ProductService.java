package ru.tkoinform.products.service;

import ru.tkoinform.products.persistence.dto.ProductDto;

import java.util.List;

public interface ProductService {

    List<ProductDto> getProducts();

}
