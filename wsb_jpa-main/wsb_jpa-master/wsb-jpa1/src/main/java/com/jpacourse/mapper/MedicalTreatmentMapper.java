package com.jpacourse.mapper;

import com.jpacourse.dto.MedicalTreatmentEntityTO;
import com.jpacourse.persistance.entity.MedicalTreatmentEntity;

public final class MedicalTreatmentMapper {
    public static MedicalTreatmentEntityTO mapToTO(final MedicalTreatmentEntity medicalTreatmentEntity){
        if (medicalTreatmentEntity == null)
        {
            return null;
        }
        final MedicalTreatmentEntityTO medicalTreatmentEntityTO = new MedicalTreatmentEntityTO();
        medicalTreatmentEntityTO.setId(medicalTreatmentEntity.getId());
        medicalTreatmentEntityTO.setDescription(medicalTreatmentEntity.getDescription());
        medicalTreatmentEntityTO.setType(medicalTreatmentEntity.getType());
        return medicalTreatmentEntityTO;
    }
    public static MedicalTreatmentEntity mapToTO(final MedicalTreatmentEntityTO medicalTreatmentEntityTO){
        if(medicalTreatmentEntityTO == null){
            return null;
        }
        final MedicalTreatmentEntity medicalTreatmentEntity = new MedicalTreatmentEntity();
        medicalTreatmentEntity.setId(medicalTreatmentEntityTO.getId());
        medicalTreatmentEntity.setDescription(medicalTreatmentEntityTO.getDescription());
        medicalTreatmentEntity.setType(medicalTreatmentEntityTO.getType());
        return medicalTreatmentEntity;
    }
}
