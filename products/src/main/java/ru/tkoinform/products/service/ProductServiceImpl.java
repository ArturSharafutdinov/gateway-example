package ru.tkoinform.products.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.tkoinform.products.persistence.dao.ProductRepository;
import ru.tkoinform.products.persistence.dto.ProductDto;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductDto> getProducts() {
        return productRepository.findAll().stream().map(product -> {
            ProductDto productDto = new ProductDto();
            productDto.setId(product.getId());
            productDto.setName(product.getName());
            productDto.setDescription(product.getDescription());
            productDto.setPrice(product.getPrice());
            productDto.setRating(product.getRating());

            return productDto;
        }).collect(Collectors.toList());
    }
}
