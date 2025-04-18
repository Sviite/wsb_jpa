package com.jpacourse.dto;

import com.jpacourse.persistance.entity.MedicalTreatmentEntity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class VisitEntityTO implements Serializable {
    private Long id;
    private String description;
    private LocalDateTime time;
    private String docFirstName;
    private String docLastName;
    private List<String> treatmentType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getDocFirstName() {
        return docFirstName;
    }

    public void setDocFirstName(String docFirstName) {
        this.docFirstName = docFirstName;
    }

    public String getDocLastName() {
        return docLastName;
    }

    public void setDocLastName(String docLastName) {
        this.docLastName = docLastName;
    }

    public List<String> getTreatmentType() {
        return treatmentType;
    }

    public void setTreatmentType(List<String> treatmentType) {
        this.treatmentType = treatmentType;
    }
}
