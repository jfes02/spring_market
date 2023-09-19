package com.eeiren.market.domain.service;

import com.eeiren.market.domain.Product;
import com.eeiren.market.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll(){
        return productRepository.getAll();
    }

    public Optional<Product> getProduct(int productId){
        return productRepository.getProduct(productId);
    }

    public Optional <List<Product>> getByCategory(int categoryId){
        return productRepository.getByCategory(categoryId);
    }

    public Product save (Product product){
        return productRepository.save(product);
    }

    //Nos ayudamos con el MAP del opcional para que en el caso de que el productId exista retorne un True y si no un False
    public boolean delete (int productId){
        return getProduct(productId).map(product ->{
            productRepository.delete(productId);
            return true;
        }).orElse(false);
    }

}
