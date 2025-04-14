package com.jpacourse.mapper;

import com.jpacourse.dto.PatientEntityTO;
import com.jpacourse.persistance.entity.PatientEntity;

public final class PatientEntityMapper {

    public static PatientEntityTO mapToTO(final PatientEntity patientEntity){
        if(patientEntity == null){
            return null;
        }
        final PatientEntityTO patientEntityTO = new PatientEntityTO();
        patientEntityTO.setId(patientEntity.getId());
        patientEntityTO.setFirstName(patientEntity.getFirstName());
        patientEntityTO.setLastName(patientEntity.getLastName());
        patientEntityTO.setTelephoneNumber(patientEntityTO.getTelephoneNumber());
        patientEntityTO.setEmail(patientEntity.getEmail());
        patientEntityTO.setPatientNumber(patientEntity.getPatientNumber());
        patientEntityTO.setDateOfBirth(patientEntity.getDateOfBirth());
        return patientEntityTO;
    }

    public static PatientEntity mapToTO(final PatientEntityTO patientEntityTO){
        final PatientEntity patientEntity = new PatientEntity();
        patientEntity.setId(patientEntityTO.getId());
        patientEntity.setFirstName(patientEntityTO.getFirstName());
        patientEntity.setLastName(patientEntityTO.getLastName());
        patientEntity.setTelephoneNumber(patientEntityTO.getTelephoneNumber());
        patientEntity.setEmail(patientEntityTO.getEmail());
        patientEntity.setPatientNumber(patientEntityTO.getPatientNumber());
        patientEntity.setDateOfBirth(patientEntityTO.getDateOfBirth());
        return patientEntity;
    }
}
