package com.eeiren.market.persistence.mapper;

import com.eeiren.market.domain.Category;
import com.eeiren.market.persistence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    //Category es lo que vamos a obtener del Mapper toCategory(parametros), es decir, vamos a convertir una categoria  en category
    //es importante que le dejemos el nombre de toCategory
    @Mappings({
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "descripcion", target = "category"),
            @Mapping(source = "estado", target = "active")
    })
    Category toCategory(Categoria categoria);

    //Conversion Inversa con el @InheritInverseConfiguration le decimos que queremos lo inverso que esta
    //Inmediatamente arriba por lo cual no hay que definir mappings.
    //Como hay una variable que no mapearemos le damos que lo ignore.
    @InheritInverseConfiguration
    @Mapping(target = "producto", ignore = true)
    Categoria toCategoria(Category category);




}
