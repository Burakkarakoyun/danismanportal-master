package com.gb.DanismanPortal.services;

import com.gb.DanismanPortal.reponse.AddressResponse;
import com.gb.DanismanPortal.request.Address.AdressAddRequest;
import com.gb.DanismanPortal.request.Address.AdressUpdateRequest;

import java.util.List;

public interface AddressService {
    List<AddressResponse> listAll();
    AddressResponse save(AdressAddRequest adressAddRequest);
    AddressResponse update(AdressUpdateRequest adressUpdateRequest);
    void delete(Integer id);
}
