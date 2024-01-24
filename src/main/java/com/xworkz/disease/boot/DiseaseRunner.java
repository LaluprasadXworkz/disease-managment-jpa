package com.xworkz.disease.boot;

import com.xworkz.disease.entity.DiseaseEntity;
import com.xworkz.disease.repository.DiseaseRepository;
import com.xworkz.disease.repository.impl.DiseaseRepositoryImpl;

import java.time.LocalDate;

public class DiseaseRunner {
    public static void main(String[] args) {
//        d_id, disease_Name, symptoms, FoundDate, Found_Place, Tablets
        DiseaseEntity disease=new DiseaseEntity(1,"Covid-19","High fever",LocalDate.of(2019,12,19),"China","Dolo-650");

        DiseaseRepository diseaseRepository=new DiseaseRepositoryImpl();
        diseaseRepository.save(disease);
    }
}
