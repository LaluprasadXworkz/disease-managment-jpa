package com.xworkz.disease.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name = "disease_info")
public class DiseaseEntity {
//    d_id, disease_Name, symptoms, FoundDate, Found_Place, Tablets
    @Id
    @Column(name = "d_id")
    private int id;

    @Column(name = "disease_Name")
    private String diseaseName;

    @Column(name = "symptoms")
    private String symptoms;

    @Column(name = "FoundDate")
    private LocalDate foundDate;

    @Column(name = "Found_Place")
    private String foundPlace;

    @Column(name = "Tablets")
    private String tablets;


}
