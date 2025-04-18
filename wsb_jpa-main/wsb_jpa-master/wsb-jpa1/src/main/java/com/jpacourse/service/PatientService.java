package com.jpacourse.service;

import com.jpacourse.dto.PatientEntityTO;

public interface PatientService {
    PatientEntityTO findById(final Long id);


}
