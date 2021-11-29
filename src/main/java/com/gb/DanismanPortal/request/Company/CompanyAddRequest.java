package com.gb.DanismanPortal.request.Company;

import lombok.Data;
import java.time.LocalDate;

@Data
public class CompanyAddRequest {
    private String name;
    private String sector;
    private String description;
    private String phoneNumber;
    private String email;
    private String password;
    private String adressId;
    private String linkedinUsername;
    private String companyEmail;
    private LocalDate createTime;
    private LocalDate endTime;
}
