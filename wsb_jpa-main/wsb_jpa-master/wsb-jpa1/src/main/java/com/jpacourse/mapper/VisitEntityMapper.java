package com.jpacourse.mapper;

import com.jpacourse.dto.VisitEntityTO;
import com.jpacourse.persistance.entity.VisitEntity;

public final class VisitEntityMapper {

    public static VisitEntityTO mapToTO(final VisitEntity visitEntity){
        if(visitEntity == null){
            return null;
        }
        final VisitEntityTO visitEntityTO = new VisitEntityTO();
        visitEntityTO.setId(visitEntityTO.getId());
        visitEntityTO.setDescription(visitEntityTO.getDescription());
        visitEntityTO.setTime(visitEntityTO.getTime());
        return visitEntityTO;
    }

    public static VisitEntity mapToTO(final VisitEntityTO visitEntityTO){
        if(visitEntityTO == null){
            return null;
        }
        final VisitEntity visitEntity = new VisitEntity();
        visitEntity.setId(visitEntityTO.getId());
        visitEntity.setDescription(visitEntityTO.getDescription());
        visitEntity.setTime(visitEntityTO.getTime());
        return visitEntity;
    }
}
