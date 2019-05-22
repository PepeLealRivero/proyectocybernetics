INSERT INTO USUARIO (id, nomUser, pass, email, nombre, apellidos, fechaNac, ciudad, pais, dni, direccion, codigoPostal, telefono, isAdmin, cuentaCaducada, cuentaBloqueada, credencialesCaducadas) VALUES (NEXTVAL('hibernate_sequence'), 'usuario', '$2y$12$90BbqcDnczwwUAHOwkJt1.sDbB9fIc5cUnmu6cMEOU9HkWEwwr30O', 'usuario@usuario.com', 'Usuario', 'Usuario', '1998-06-10', 'Sevilla', 'España', '41561365Z', 'Alcosa', '41019', '954421531', FALSE, FALSE, FALSE, FALSE);
INSERT INTO USUARIO (id, nomUser, pass, email, nombre, apellidos, fechaNac, ciudad, pais, dni, direccion, codigoPostal, telefono, isAdmin, cuentaCaducada, cuentaBloqueada, credencialesCaducadas) VALUES (NEXTVAL('hibernate_sequence'), 'admin', '$2y$12$vCp.9btEQjm8RC19uEFNCun9hAeLioioDd6ZEgLmAL5kGB7QiNdta', 'admin@admin.com', 'Administrador', 'Administrador', '1999-05-29', 'Sevilla', 'España', '85613488C', 'Nervión', '41010', '954858319', TRUE, FALSE, FALSE, FALSE);


/*LA DURACION DE LOS CURSOS ESTA REPRESENTADA POR SEMANAS*/
INSERT INTO CURSO (id, nombre, fechaInicio, duracion, descripcion, precio, image, categoria_id) VALUES (NEXTVAL('hibernate_sequence'), 'TÉCNICO AVANZADO EN CIBERINTELIGENCIA E INTELIGENCIA EN SOCIAL MEDIA (SOCMINT)', '2019-06-29', 4, 'Este programa incluye los principios, las técnicas y los procedimientos que el alumno necesita para la adquisición de información en el ciberespacio.', 313.50, null, 5);
INSERT INTO CURSO (id, nombre, fechaInicio, duracion, descripcion, precio, image, categoria_id) VALUES (NEXTVAL('hibernate_sequence'), 'Técnico Avanzado en Obtención de Información en Fuentes Abiertas (OSINT)', '2020-02-28', 6, 'Cualquiera de los diferentes tipos de Inteligencia (Militar, Económica, Competitiva, etc.) necesitan de una correcta y cuidadosa recolección de información.', 313.50, null, 5);
INSERT INTO CURSO (id, nombre, fechaInicio, duracion, descripcion, precio, image, categoria_id) VALUES (NEXTVAL('hibernate_sequence'), 'Fundamentos de Inteligencia y Contrainteligencia', '2018-06-19', 6, 'Este curso está diseñado para aquellos alumnos que necesitan familiarizarse, conocer, comprender y utilizar los conceptos fundamentales relacionados con la Inteligencia, la Contrainteligencia y la Seguridad. Es un curso esencial para avanzar en el estudio de la Inteligencia.', 313.50, null, 5);
INSERT INTO CURSO (id, nombre, fechaInicio, duracion, descripcion, precio, image, categoria_id) VALUES (NEXTVAL('hibernate_sequence'), 'Técnico Avanzado en Inteligencia Corporativa', '2019-06-29', 4, 'Este Curso integra aspectos teóricos y prácticos sobre la disciplina de la Inteligencia Corporativa, donde prima la perspectiva empresarial, constituida por el intrínseco ánimo de lucro del negocio y de los intereses específicamente concretados en los objetivos corporativos, a nivel estratégico, operacional y táctico', 210, null, 5);



INSERT INTO CATEGORIA (id, nombre, tipoformacion_id) VALUES (NEXTVAL('hibernate_sequence'), 'Inteligencia e Información', 19);
INSERT INTO CATEGORIA (id, nombre, tipoformacion_id) VALUES (NEXTVAL('hibernate_sequence'), 'Amenaza Yihadista', 19);
INSERT INTO CATEGORIA (id, nombre, tipoformacion_id) VALUES (NEXTVAL('hibernate_sequence'), 'Terrorismo y Crimen Organizado', 19);
INSERT INTO CATEGORIA (id, nombre, tipoformacion_id) VALUES (NEXTVAL('hibernate_sequence'), 'Seguridad y Defensa', 19);
INSERT INTO CATEGORIA (id, nombre, tipoformacion_id) VALUES (NEXTVAL('hibernate_sequence'), 'Tecnología Militar', 19);
INSERT INTO CATEGORIA (id, nombre, tipoformacion_id) VALUES (NEXTVAL('hibernate_sequence'), 'Estudios Estratégicos', 19);
INSERT INTO CATEGORIA (id, nombre, tipoformacion_id) VALUES (NEXTVAL('hibernate_sequence'), 'Historia Militar', 19);
INSERT INTO CATEGORIA (id, nombre, tipoformacion_id) VALUES (NEXTVAL('hibernate_sequence'), 'Táctico-Sanitaria Y PRL', 19);
INSERT INTO CATEGORIA (id, nombre, tipoformacion_id) VALUES (NEXTVAL('hibernate_sequence'), 'Gestión Ambiental', 19);
INSERT INTO CATEGORIA (id, nombre, tipoformacion_id) VALUES (NEXTVAL('hibernate_sequence'), 'Supervivencia, Rescate y Prevención', 19);


INSERT INTO TIPOFORMACION (id, nombre) VALUES	(NEXTVAL('hibernate_sequence'), 'MÁSTERES CON ACREDITACIÓN UNIVERSITARIA');
INSERT INTO TIPOFORMACION (id, nombre) VALUES	(NEXTVAL('hibernate_sequence'), 'DIRECCIÓN DE SEGURIDAD - HOMOLOGADO POR Mº INTERIOR');
INSERT INTO TIPOFORMACION (id, nombre) VALUES	(NEXTVAL('hibernate_sequence'), 'EXPERTOS');
INSERT INTO TIPOFORMACION (id, nombre) VALUES	(NEXTVAL('hibernate_sequence'), 'GRUPOS DE INVESTIGACIÓN ACADÉMICA');
INSERT INTO TIPOFORMACION (id, nombre) VALUES	(NEXTVAL('hibernate_sequence'), 'PROGRAMAS SUPERIORES');
INSERT INTO TIPOFORMACION (id, nombre) VALUES	(NEXTVAL('hibernate_sequence'), 'ESPECIALIZACIÓN PROFESIONAL');
INSERT INTO TIPOFORMACION (id, nombre) VALUES	(NEXTVAL('hibernate_sequence'), 'FORMACIÓN POLICIAL');
INSERT INTO TIPOFORMACION (id, nombre) VALUES	(NEXTVAL('hibernate_sequence'), 'SEGURIDAD PRIVADA');
INSERT INTO TIPOFORMACION (id, nombre) VALUES	(NEXTVAL('hibernate_sequence'), 'INTERNATIONAL COURSES');
INSERT INTO TIPOFORMACION (id, nombre) VALUES	(NEXTVAL('hibernate_sequence'), 'PLANTILLAS');
INSERT INTO TIPOFORMACION (id, nombre) VALUES	(NEXTVAL('hibernate_sequence'), 'VENTANILLAS DE PAGO CON DESCUENTO PARA INSTITUCIONES CONCERTADAS');















