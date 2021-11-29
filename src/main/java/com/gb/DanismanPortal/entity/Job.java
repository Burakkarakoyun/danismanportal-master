package com.gb.DanismanPortal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "adress")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "max_salary")
    private double maxSalary;

    @Column(name = "min_salary")
    private double minSalary;

    @Column(name = "sector")
    private String sector;

    @Column(name = "company_id")
    private String companyId;

    @Column(name = "adress_id")
    private String adressId;

    @Column(name = "create_time")
    private LocalDate createTime;

    @Column(name = "end_time")
    private LocalDate endDate;

}
