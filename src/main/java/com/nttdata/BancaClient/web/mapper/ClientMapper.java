package com.nttdata.BancaClient.web.mapper;

import com.nttdata.BancaClient.domain.Client;
import com.nttdata.BancaClient.web.model.ClientModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    Client modelToEntity (ClientModel model);

    ClientModel entityToModel (Client event);

    @Mapping(target="idClient", ignore = true)
    void update(@MappingTarget Client entity, Client updateEntity);
}
