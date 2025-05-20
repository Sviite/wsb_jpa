insert into address (id, address_line1, address_line2, city, postal_code)
VALUES
(1, 'xx', 'yy', 'city', '60-400'),
(2, 'Nadodrzanska', '4', 'Wielun', '98-300'),
(3, 'Legnicka', '48', 'Wroclaw', '50-312'),
(4, 'Lazienkowska', '3', 'Warszawa', '00-086');

INSERT INTO doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id)
VALUES
(1, 'Andrzej', 'Kowalski', '123456789', 'akowalski@gmail.com', 'DN1', 'SURGEON', 1),
(2, 'Michal', 'Glus', '123456789', 'mglus@gmail.com', 'DN2', 'GP', 4),
(3, 'Radoslaw', 'Rumian', '123456789', 'rrumian@gmail.com', 'DN3', 'DERMATOLOGIST', 3),
(4, 'Boguslaw', 'Lecina', '123456789', 'blecina@gmail.com', 'DN4', 'OCULIST', 2);

INSERT INTO patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, age, address_id)
VALUES
(1, 'Przemo', 'Stankiewicz', '139971233', 'przemo@gmail.com', 'PN1', '1995-04-12',24, 1),
(2, 'Marcin', 'Bak', '139971233', 'przemo@gmail.com', 'PN2', '1995-04-12',30, 3),
(3, 'Patryk', 'Sulej', '139971233', 'przemo@gmail.com', 'PN3', '1995-04-12',40, 4),
(4, 'Maciej', 'Gonda', '139971233', 'przemo@gmail.com', 'PN4', '1995-04-12',25, 2);

INSERT INTO visit (id, description, time, doctor_id, patient_id)
VALUES
(1, 'Echocardiogram', '2025-04-01 10:00:00', 4, 2),
(2, 'Echocardiogram', '2025-04-02 10:00:00', 3, 4),
(3, 'Echocardiogram', '2025-04-03 10:00:00', 1, 3),
(4, 'Echocardiogram', '2025-04-04 10:00:00', 2, 1),
(5, 'Echocardiogram', '2025-04-05 10:00:00', 3, 4);

INSERT INTO medical_treatment (id, description, type, visit_id)
VALUES
(1, 'Electrocardiogram', 'EKG', 1),
(2, 'Ultrasonogram', 'USG', 4),
(3, 'Electroencephalograph', 'EEG', 3),
(4, 'Roentgen', 'RTG', 2);