package com.gb.DanismanPortal.mapper;

import com.gb.DanismanPortal.entity.Address;
import com.gb.DanismanPortal.reponse.AddressResponse;
import com.gb.DanismanPortal.request.Address.AdressAddRequest;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AddressMapper {
    List<AddressResponse> toAdressResponseList (List<Address> addresses);
    AddressResponse toAdressResponse (Address address);
    Address toAdress (AdressAddRequest adressAddRequest);
}
