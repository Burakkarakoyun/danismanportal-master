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
@Table(name = "job")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "salary")
    private double salary;

    @Column(name = "sector")
    private String sector;

    @Column(name = "experience")
    private String experience;

    @Column(name = "company_id")
    private String companyId;

    @Column(name = "address_id")
    private int addressId;

    @Column(name = "create_time")
    private LocalDate createTime = LocalDate.now();

    @Column(name = "end_time")
    private LocalDate endTime;

}
