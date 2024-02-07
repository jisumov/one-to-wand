package com.onetowand.onetowand.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import com.onetowand.onetowand.domain.Category;
import com.onetowand.onetowand.persistence.entity.Categoria;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source="idCategoria",target="categoryId"),
            @Mapping(source="descripcion",target="category"),
            @Mapping(source="estado",target="active")
    })
    Category toCategory(Categoria categoria);

    @InheritInverseConfiguration
    @Mapping(target="productos", ignore = true)
    Categoria toCategoria(Category category);

}
