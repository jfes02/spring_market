package com.eeiren.market.persistence.crud;

import com.eeiren.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    //De manera nativa seria de la siguiente manera (aunque no se usara por que ya se usa Query Methods):
    //@Query(value= "SELECT * FROM DUAL WHERE id_categoria = ?", nativeQuery = true);

    //Query Method:
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

}
