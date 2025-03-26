insert into address (id, address_line1, address_line2, city, postal_code)
VALUES
(901, 'xx', 'yy', 'city', '60-400');

INSERT INTO DOCTOR (id, firstName, lastName, telephoneNumber, email, doctorNumber, specialization)
VALUES
(1, 'Andrzej', 'Kowalski', '123456789', 'akowalski@gmail.com', 'DN1', 'CARDIOLOGY'),
(2, 'Kamil', 'Zdun', '987654321', 'kzdun@gmail.com', 'DN2', 'ALERGOLOGY');

INSERT INTO PATIENT (id, firstName, lastName, telephoneNumber, email, patientNumber, dateOfBirth)
VALUES
(1, 'Przemo', 'Stankiewicz', '139971233', 'przemo@gmail.com', 'PN1', '1995-04-12'),
(2, 'Ania', 'Nowak', '420213712', 'anian@gmail.com', 'PN2', '1998-08-23');

INSERT INTO VISIT (id, description, time, doctor_id, patient_id)
VALUES
(1, 'Echocardiogram', '2025-04-01 10:00:00', 1, 1),
(2, 'Allergy Skin Testing', '2025-04-02 14:30:00', 2, 2);

INSERT INTO MEDICAL_TREATMENT (id, description, type, visit_id)
VALUES
(1, 'Blood pressure monitoring', 'DIAGNOSTIC', 1),
(2, 'Immunotherapy', 'THERAPY', 2);