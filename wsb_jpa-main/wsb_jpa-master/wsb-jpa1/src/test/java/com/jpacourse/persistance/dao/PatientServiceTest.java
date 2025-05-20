package com.jpacourse.persistance.dao;


import com.jpacourse.dto.PatientTO;
import com.jpacourse.service.PatientService;
import com.jpacourse.service.impl.PatientServiceImpl;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest
public class PatientServiceTest {

    @Autowired
    private PatientDao patientDao;

    @Autowired
    private PatientService patientService;

    @Transactional
    @Test
    public void testIfPatinetDeletes(){
        assertThat(patientDao.findOne(2L)).isNotNull();
        patientService.deletePatient(2L);
        assertThat(patientDao.findOne(2L)).isNull();
    }

    @Transactional
    @Test
    public void testIfPatientIsCorrect(){
        patientService.findById(4L);
        PatientTO patient = patientService.findById(4L);
        assertThat(patient.getFirstName()).isEqualTo("Maciej");
        assertThat(patient.getLastName()).isEqualTo("Gonda");
        assertThat(patient.getAge()).isEqualTo(25);
        assertThat(patient.getPatientNumber()).isEqualTo("PN4");
        assertThat(patient.getEmail()).isEqualTo("przemo@gmail.com");
    }

}
