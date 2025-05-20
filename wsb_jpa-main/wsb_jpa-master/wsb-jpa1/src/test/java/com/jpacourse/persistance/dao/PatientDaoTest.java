package com.jpacourse.persistance.dao;

import com.jpacourse.persistance.entity.PatientEntity;
import com.jpacourse.persistance.entity.VisitEntity;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
public class PatientDaoTest {

    @Autowired
    private PatientDao patientDao;

    @Test
    @Transactional
    public void shouldCreateVisit(){
        int sizeBefore = patientDao.findOne(1L).getVisitEntityCollection().size();
        //przypisanie wyniku metody do zmiennej (samo var znika)
        patientDao.addVisitToPatient(1L,2L, LocalDateTime.now(),"desc");
        int sizeAfter = patientDao.findOne(1L).getVisitEntityCollection().size();
        assertThat(sizeBefore).isEqualTo(sizeAfter-1);
    }

    @Test
    @Transactional
    public void shouldFindByLastName(){
        String lastname = "Stankiewicz";
        List<PatientEntity> patientEntities = patientDao.findbyLastName(lastname);
        assertThat(patientEntities).isNotNull();
        assertThat(patientEntities).hasSize(1);
        assertThat(patientEntities.get(0).getLastName()).isEqualTo(lastname);
    }
@Test
@Transactional
    public void shouldFindPatientById(){
        Long id = 4L;
        List<VisitEntity> patiment = patientDao.findPatientbyId(id);
        assertThat(patiment).isNotNull();
        assertThat(patiment).hasSize(4);
        assertThat(patiment.get(0).getPatient().getFirstName()).isEqualTo("Maciej");

    }

    @Test
    @Transactional
    public void shouldFindPatientIfHigherAge(){
        Long age = 25L;
        List<PatientEntity> patientEntities = patientDao.findByOlderThan(age);
        assertThat(patientEntities).isNotNull();
        assertThat(patientEntities).hasSize(2);

    }
}
