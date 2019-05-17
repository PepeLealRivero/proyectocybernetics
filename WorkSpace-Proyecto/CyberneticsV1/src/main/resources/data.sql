INSERT INTO USUARIO ('id', 'nomUser', 'pass', 'email', 'nombre', 'apellidos', 'fechaNacimiento', 'ciudad', 'pais', 'dni', 'direccion', 'codigoPostal', 'telefono', 'isAdmin')
            VALUES (NEXTVAL('hibernate_sequence'), 'admin', 'admin', 'admin0@admin.com', 'Administrador', 'Administrador', to_date('1999/05/29', 'yyyy/MM/dd'), 'Sevilla', 'España', '85613488C', 'Triana', 41010, 954858319, 'TRUE');


INSERT INTO USUARIO ('id', 'nomUser', 'pass', 'email', 'nombre', 'apellidos', 'fechaNacimiento', 'ciudad', 'pais', 'dni', 'direccion', 'codigoPostal', 'telefono', 'isAdmin')
            VALUES (NEXTVAL('hibernate_sequence'), 'usuario', '1234', 'usuario@usuario.com', 'Usuario', 'Usuario', to_date('1998/06/10', 'yyyy/MM/dd'), 'Sevilla', 'España', '74183658V', 'Los Remedios', 41020, 98233666, 'FALSE');
            