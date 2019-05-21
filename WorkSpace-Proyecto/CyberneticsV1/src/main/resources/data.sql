INSERT INTO USUARIO (id, nomUser, pass, email, nombre, apellidos, fechaNac, ciudad, pais, dni, direccion, codigoPostal, telefono, isAdmin, cuentaCaducada, cuentaBloqueada, credencialesCaducadas) VALUES (NEXTVAL('hibernate_sequence'), '1234', '$2y$12$90BbqcDnczwwUAHOwkJt1.sDbB9fIc5cUnmu6cMEOU9HkWEwwr30O', 'usuario@usuario.com', 'Usuario', 'Usuario', '1998-06-10', 'Sevilla', 'España', '41561365Z', 'Alcosa', '41019', '954421531', FALSE, FALSE, FALSE, FALSE);



/*ESTE ES EL INSERT QUE DA FALLO (CORREGIRLO)
﻿INSERT INTO USUARIO (id, nomUser, pass, email, nombre, apellidos, fechaNac, ciudad, pais, dni, direccion, codigoPostal, telefono, isAdmin, cuentaCaducada, cuentaBloqueada, credencialesCaducadas) VALUES (NEXTVAL('hibernate_sequence'), 'admin', '$2y$12$vCp.9btEQjm8RC19uEFNCun9hAeLioioDd6ZEgLmAL5kGB7QiNdta', 'admin@admin.com', 'Administrador', 'Administrador', '1999-05-29', 'Sevilla', 'España', '85613488C', 'Nervión', '41010', '954858319', TRUE, FALSE, FALSE, FALSE);*/
