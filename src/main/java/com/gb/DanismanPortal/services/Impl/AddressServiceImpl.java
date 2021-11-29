package com.gb.DanismanPortal.services.Impl;

import com.gb.DanismanPortal.entity.Address;
import com.gb.DanismanPortal.exception.ObjectNotFoundException;
import com.gb.DanismanPortal.mapper.AddressMapper;
import com.gb.DanismanPortal.reponse.AddressResponse;
import com.gb.DanismanPortal.repository.AddressRepository;
import com.gb.DanismanPortal.request.Address.AdressAddRequest;
import com.gb.DanismanPortal.request.Address.AdressUpdateRequest;
import com.gb.DanismanPortal.services.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class AddressServiceImpl implements AddressService {
    private final AddressRepository addressRepository;
    private final AddressMapper addressMapper;

    @Override
    public List<AddressResponse> listAll(){
        List<Address> addresses = addressRepository.findAll();
        List<AddressResponse> addressRespons = addressMapper.toAdressResponseList(addresses);
        return addressRespons;
    }

    @Override
    public AddressResponse save(AdressAddRequest adressAddRequest) {
        Address address = addressMapper.toAdress(adressAddRequest);
        Address saved = addressRepository.save(address);
        return addressMapper.toAdressResponse(saved);
    }

    @Override
    public AddressResponse update (AdressUpdateRequest adressUpdateRequest){
        Optional<Address> adress = addressRepository.findById(adressUpdateRequest.getId());
        if(adress.isPresent()){
            BeanUtils.copyProperties(adressUpdateRequest, adress.get());
            Address savedAddress = addressRepository.save(adress.get());
            return addressMapper.toAdressResponse(savedAddress);
        }
        else{
            throw new ObjectNotFoundException("Adress Bulunamadı!");
        }
    }

    @Override
    public void delete(Integer id){
        Optional<Address> address = addressRepository.findById(id);
        if(address.isPresent()){
            address.get().setEndTime(LocalDate.now());
            addressRepository.save(address.get());
        }
    }

}
