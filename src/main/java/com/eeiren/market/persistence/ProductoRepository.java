package com.eeiren.market.persistence;

import com.eeiren.market.persistence.crud.ProductoCrudRepository;
import com.eeiren.market.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    //Metodo para recuperar todos los elementos que hay en la base de datos
    public List<Producto> tomaTodos(){
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
