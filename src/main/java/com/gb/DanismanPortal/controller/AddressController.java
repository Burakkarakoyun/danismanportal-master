package com.gb.DanismanPortal.controller;

import com.gb.DanismanPortal.request.Address.AddressAddRequest;
import com.gb.DanismanPortal.response.AddressResponse;
import com.gb.DanismanPortal.response.HttpResponseMessage;
import com.gb.DanismanPortal.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/address")
public class AddressController {
    private final AddressService addressService;

    @GetMapping
    public ResponseEntity<?> getAll(){
        List<AddressResponse> addressResponses = addressService.listAll();
        HttpResponseMessage message = new HttpResponseMessage.HttpResponseMessageBuilder()
                .success(true)
                .items(addressResponses)
                .build();
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody AddressAddRequest addressAddRequest){
        AddressResponse addressResponse = addressService.save(addressAddRequest);
        HttpResponseMessage message = new HttpResponseMessage.HttpResponseMessageBuilder()
                .success(true)
                .item(addressResponse)
                .build();
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
