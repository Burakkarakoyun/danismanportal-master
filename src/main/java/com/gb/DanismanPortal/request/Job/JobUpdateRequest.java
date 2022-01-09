package com.gb.DanismanPortal.request.Job;

import lombok.Data;

import java.time.LocalDate;

@Data
public class JobUpdateRequest {
    private int id;
    private String title;
    private String description;
    private double salary;
    private String sector;
    private String experience;
    private String companyId;
    private int addressId;
    private LocalDate createTime;
    private LocalDate endTime;
}
