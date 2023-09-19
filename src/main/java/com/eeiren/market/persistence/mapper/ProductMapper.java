package com.eeiren.market.persistence.mapper;

import com.eeiren.market.domain.Product;
import com.eeiren.market.persistence.entity.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;


//Uses hace referencia a: @Mapping(source = "categoria", target = "category") ya que ya existe la referencia y esa debe usar.
@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper {

    @Mappings({
            @Mapping(source = "idProducto", target = "productId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "precioVenta", target = "price"),
            @Mapping(source = "cantidadStock", target = "stock"),
            @Mapping(source = "estado", target = "active"),
            //@Mapping(source = "categoria", target = "category")
    })
    Product toProduct(Producto producto);

    //Para tenerlo de manera Plural, se crea una lista y esta lista ya sabe la manera en la que se debe de comportar con el Mappings
    List<Product> toProducts(List<Producto> productos);

    @InheritInverseConfiguration
    @Mapping(target = "codigoBarras", ignore = true)
    Producto toProducto (Product product);

}
