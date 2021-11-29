package com.gb.DanismanPortal.reponse;

import lombok.Data;
import java.time.LocalDate;

@Data
public class AddressResponse {
    private int id;
    private String description;
    private String country;
    private String state;
    private String city;
    private String district;
    private String neighborhood;
    private String zipCode;
    private LocalDate create_time;
    private LocalDate endTime;
}
