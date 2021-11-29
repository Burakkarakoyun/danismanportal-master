package com.gb.DanismanPortal.request.Job;

import lombok.Data;

import java.time.LocalDate;

@Data
public class JobUpdateRequest {
    private int id;
    private String name;
    private String description;
    private double maxSalary;
    private double minSalary;
    private String sector;
    private String companyId;
    private String adressId;
    private LocalDate createTime;
    private LocalDate endTime;
}
