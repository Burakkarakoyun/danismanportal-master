package com.gb.DanismanPortal.request.Job;

import lombok.Data;

import java.time.LocalDate;

@Data
public class JobAddRequest {
    private String title;
    private String description;
    private double salary;
    private String sector;
    private String experience;
    private int companyId;
    private int addressId;
    private LocalDate createTime = LocalDate.now();
    private LocalDate endTime;
}
