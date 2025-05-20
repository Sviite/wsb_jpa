package com.jpacourse.mapper;

import com.jpacourse.dto.PatientTO;
import com.jpacourse.persistance.entity.PatientEntity;

public final class PatientMapper {

    public static PatientTO mapToTO(final PatientEntity patientEntity){
        if(patientEntity == null){
            return null;
        }
        final PatientTO patientTO = new PatientTO();
        patientTO.setId(patientEntity.getId());
        patientTO.setFirstName(patientEntity.getFirstName());
        patientTO.setLastName(patientEntity.getLastName());
        patientTO.setTelephoneNumber(patientEntity.getTelephoneNumber());
        patientTO.setEmail(patientEntity.getEmail());
        patientTO.setPatientNumber(patientEntity.getPatientNumber());
        patientTO.setAge(patientEntity.getAge());
        patientTO.setDateOfBirth(patientEntity.getDateOfBirth());
        patientTO.setVisitTOList(patientEntity.getVisitEntityCollection().stream().map(x -> VisitMapper.mapToTO(x)).toList());
        return patientTO;
    }

    public static PatientEntity mapToEntity(final PatientTO patientTO){
        final PatientEntity patientEntity = new PatientEntity();
        patientEntity.setId(patientTO.getId());
        patientEntity.setFirstName(patientTO.getFirstName());
        patientEntity.setLastName(patientTO.getLastName());
        patientEntity.setTelephoneNumber(patientTO.getTelephoneNumber());
        patientEntity.setEmail(patientTO.getEmail());
        patientEntity.setPatientNumber(patientTO.getPatientNumber());
        patientEntity.setDateOfBirth(patientTO.getDateOfBirth());
        patientEntity.setAge(patientTO.getAge());
        return patientEntity;
    }
}
