	/*Tabla Usuarios */
CREATE TABLE usuario (
    id_usuario integer PRIMARY KEY IDENTITY(1,1),
    nombre_usuario varchar(70) not null,
    contrasena varchar(9) NOT NULL,
    id_rol varchar(15) NOT NULL,
	estado int not null,
	nro_intentos int not null
	
	)
	go


		INSERT INTO usuario
           ([nombre_usuario]
           ,[contrasena]
           ,id_rol,
		   estado,
		   nro_intentos)
     VALUES
			('usuario1', 'Bass1', '1',1,0),
           ('usuario2', 'Iass2', '2',1,0),
           ('usuario3', 'pass3', '3',1,0),
		    ('usuario3', 'pass3', '4', 1,0);
GO

	/*Tabla Logs */
CREATE TABLE Logs (
    log_id INT  PRIMARY KEY Identity,
    fecha datetime,
    username VARCHAR(255),
    accion VARCHAR(50),
    ref1 VARCHAR(50),
    ref2 VARCHAR(50),
    detalle TEXT
)
go






select * from usuario
go






/*
Tabla de Creacion de ROLES
*/
create table Rol(

   idrol int primary key identity,
    nombrerol varchar(50),
    estadorol int
)
;
