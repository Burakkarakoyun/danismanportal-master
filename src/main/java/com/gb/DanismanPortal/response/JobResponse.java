package com.gb.DanismanPortal.response;

import lombok.Data;
import java.time.LocalDate;

@Data
public class JobResponse {
    private int id;
    private String title;
    private String description;
    private double salary;
    private String sector;
    private String experience;
    private int companyId;
    private int addressId;
    private LocalDate createTime;
    private LocalDate endTime;
}
