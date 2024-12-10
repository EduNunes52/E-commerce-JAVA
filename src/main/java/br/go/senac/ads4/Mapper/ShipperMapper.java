package br.go.senac.ads4.Mapper;


import br.go.senac.ads4.dto.ShipperDto;
import br.go.senac.ads4.model.ShipperModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ShipperMapper {

    ShipperMapper INSTANCE = Mappers.getMapper(ShipperMapper.class);

    //converte entidade para DTO
    ShipperDto toDto(ShipperModel entity);

    //conter DTO para entidade
    ShipperModel toModel(ShipperDto dto);

    //converte a lista de entidades para DTOs
    List<ShipperDto> toDtoList(List<ShipperModel> entities);

    //converte a lista de DTOs para entidades
    List<ShipperModel> toModelList(List<ShipperDto> dto);
}
