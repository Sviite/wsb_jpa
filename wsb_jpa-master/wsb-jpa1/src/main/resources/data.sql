insert into address (id, address_line1, address_line2, city, postal_code)
VALUES
(901, 'xx', 'yy', 'city', '60-400');

INSERT INTO doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id)
VALUES
(1, 'Andrzej', 'Kowalski', '123456789', 'akowalski@gmail.com', 'DN1', 'SURGEON', 901);

INSERT INTO patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, address_id)
VALUES
(1, 'Przemo', 'Stankiewicz', '139971233', 'przemo@gmail.com', 'PN1', '1995-04-12', 901);

INSERT INTO visit (id, description, time, doctor_id, patient_id)
VALUES
(1, 'Echocardiogram', '2025-04-01 10:00:00', 1, 1);

INSERT INTO medical_treatment (id, description, type, visit_id)
VALUES
(1, 'Electrocardiogram', 'EKG', 1);