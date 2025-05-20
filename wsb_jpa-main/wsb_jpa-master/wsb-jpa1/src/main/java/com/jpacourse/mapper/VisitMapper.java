package com.jpacourse.mapper;

import com.jpacourse.dto.VisitTO;
import com.jpacourse.persistance.entity.VisitEntity;

public final class VisitMapper {

    public static VisitTO mapToTO(final VisitEntity visitEntity){
        if(visitEntity == null){
            return null;
        }
        final VisitTO visitTO = new VisitTO();
        visitTO.setId(visitEntity.getId());
        visitTO.setDescription(visitEntity.getDescription());
        visitTO.setTime(visitEntity.getTime());
        visitTO.setDoctorName(visitEntity.getDoctor().getLastName());
        visitTO.setPatientName(visitEntity.getPatient().getLastName());
        visitTO.setTreatmentType(visitEntity.getMedicalTreatment().stream().map(x -> x.getType().name()).toList());
        return visitTO;
    }

}
