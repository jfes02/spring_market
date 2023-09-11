package com.eeiren.market.persistence;

import com.eeiren.market.persistence.crud.ProductoCrudRepository;
import com.eeiren.market.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    //Metodo para recuperar todos los elementos que hay en la base de datos
    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }

    public Long tomaTodo(){return productoCrudRepository.count();}

    public List<Producto> getByCategoria(int idCategoria){
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }

    public Optional<List<Producto>> getEscasos(int cantidad){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad,true);
    }

}
