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
			('admin', 'admin', '1',1,0),
           ('usuario2', 'Iass2', '2',1,0),
           ('usuario3', 'pass3', '3',1,0),
		    ('usuario3', 'pass3', '4', 1,0);
;

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
;






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

/*CHUAMANIC 20231710 Tabla para anexo de archivos relacionados a cada demanda*/
CREATE TABLE Anexo (
	IdAnexo  INTEGER PRIMARY KEY identity,
    NroExpediente VARCHAR(10),
    TipoDocumento VARCHAR(10),
    NombreDocumento  VARCHAR(50),
	Formato  VARCHAR(50),
	FechaCarga DATE,
	EstadoCarga int,
	Usuario  VARCHAR(50)
);

/*CHUAMANIC 20231710 Tabla para Notificaciones*/
CREATE TABLE [dbo].[Notificacion](
	[IdNotificacion] [int] int primary key identity,
	[NroExpediente] [int] NULL,
	[EstadoNotificacion] [varchar](20) NULL,
	[FechaNotificacion] [date] NULL,
	[FechaVisualizacion] [date] NULL,
	[ColorEstado] [varchar](20) NULL,
	[Observaciones] [text] NULL,
	[Leida] [int] NULL,
	[idUsuario] [varchar](11) NULL
	);

/*CHUAMANIC 20231710 Tabla para Demanda*/
CREATE TABLE AEDArbitraje.dbo.Demanda (
	NroExpediente int IDENTITY(1,1) NOT NULL,
	FechaDemanda date NULL,
	DemandanteID int NULL,
	DemandadoID int NULL,
	Ubigeo varchar(50) COLLATE Modern_Spanish_CI_AS NOT NULL,
	Especialidad varchar(50) COLLATE Modern_Spanish_CI_AS NOT NULL,
	Cuantia decimal(10,2) NULL,
	IdAnexo int NULL,
	ResumenControversia text COLLATE Modern_Spanish_CI_AS NULL,
	ResumenPeticiones text COLLATE Modern_Spanish_CI_AS NULL,
	DesignacionArbitro varchar(100) COLLATE Modern_Spanish_CI_AS NULL,
	DeclaracionesCompromiso text COLLATE Modern_Spanish_CI_AS NULL,
	Estado varchar(20) COLLATE Modern_Spanish_CI_AS NOT NULL,
	Decision_Final text COLLATE Modern_Spanish_CI_AS NULL,
	MotivoAnulacion text COLLATE Modern_Spanish_CI_AS NULL,
	SustentoAnulacion text COLLATE Modern_Spanish_CI_AS NULL,
	FechaAprobacion date NULL,
	UsuarioAprobador int NULL,
	usuario varchar(20) COLLATE Modern_Spanish_CI_AS NULL,
	CONSTRAINT PK__Demanda__4343075D12F73B21 PRIMARY KEY (NroExpediente)
);



ALTER TABLE Demanda
ADD usuario varchar(20)


INSERT INTO Demanda ( FechaDemanda, DemandanteID, DemandadoID, Ubigeo, Especialidad, Cuantia, IdAnexo, ResumenControversia, ResumenPeticiones, DesignacionArbitro, DeclaracionesCompromiso, Estado, Decision_Final, MotivoAnulacion, SustentoAnulacion, FechaAprobacion, UsuarioAprobador)
VALUES
('2023-01-15', 1001, 2001, 'Lima', 'Civil', 15000.00, 101, 'Resumen de Controversia 1', 'Resumen de Peticiones 1', 'Arbitro 1', 'Declaraciones 1', 'En Proceso', 'Decisión 1', NULL, NULL, '2023-02-01', 3001),
('2023-02-20', 1002, 2002, 'Arequipa', 'Familia', 20000.00, 102, 'Resumen de Controversia 2', 'Resumen de Peticiones 2', 'Arbitro 2', 'Declaraciones 2', 'En Proceso', 'Decisión 2', NULL, NULL, '2023-02-10', 3002),
('2023-03-10', 1003, 2003, 'Cusco', 'Laboral', 12000.00, 103, 'Resumen de Controversia 3', 'Resumen de Peticiones 3', 'Arbitro 3', 'Declaraciones 3', 'Concluido', 'Decisión 3', NULL, NULL, '2023-03-15', 3003),
('2023-04-05', 1004, 2004, 'Arequipa', 'Penal', 18000.00, 104, 'Resumen de Controversia 4', 'Resumen de Peticiones 4', 'Arbitro 4', 'Declaraciones 4', 'En Proceso', 'Decisión 4', NULL, NULL, '2023-04-20', 3004),
('2023-05-15', 1005, 2005, 'Lima', 'Civil', 25000.00, 105, 'Resumen de Controversia 5', 'Resumen de Peticiones 5', 'Arbitro 5', 'Declaraciones 5', 'Concluido', 'Decisión 5', NULL, NULL, '2023-05-30', 3005),
('2023-06-20', 1006, 2006, 'Trujillo', 'Familia', 22000.00, 106, 'Resumen de Controversia 6', 'Resumen de Peticiones 6', 'Arbitro 6', 'Declaraciones 6', 'En Proceso', 'Decisión 6', NULL, NULL, '2023-06-25', 3006),
('2023-07-10', 1007, 2007, 'Arequipa', 'Civil', 30000.00, 107, 'Resumen de Controversia 7', 'Resumen de Peticiones 7', 'Arbitro 7', 'Declaraciones 7', 'En Proceso', 'Decisión 7', NULL, NULL, '2023-07-15', 3007),
('2023-08-05', 1008, 2008, 'Lima', 'Laboral', 16000.00, 108, 'Resumen de Controversia 8', 'Resumen de Peticiones 8', 'Arbitro 8', 'Declaraciones 8', 'Concluido', 'Decisión 8', NULL, NULL, '2023-08-20', 3008),
('2023-09-15', 1009, 2009, 'Cusco', 'Penal', 28000.00, 109, 'Resumen de Controversia 9', 'Resumen de Peticiones 9', 'Arbitro 9', 'Declaraciones 9', 'En Proceso', 'Decisión 9', NULL, NULL, '2023-09-30', 3009),
( '2023-10-20', 1010, 2010, 'Arequipa', 'Civil', 19000.00, 110, 'Resumen de Controversia 10', 'Resumen de Peticiones 10', 'Arbitro 10', 'Declaraciones 10', 'Concluido', 'Decisión 10', NULL, NULL, '2023-10-25', 3010),
( '2023-11-10', 1011, 2011, 'Lima', 'Familia', 17000.00, 111, 'Resumen de Controversia 11', 'Resumen de Peticiones 11', 'Arbitro 11', 'Declaraciones 11', 'En Proceso', 'Decisión 11', NULL, NULL, '2023-11-15', 3011),
( '2023-12-05', 1012, 2012, 'Trujillo', 'Laboral', 24000.00, 112, 'Resumen de Controversia 12', 'Resumen de Peticiones 12', 'Arbitro 12', 'Declaraciones 12', 'En Proceso', 'Decisión 12', NULL, NULL, '2023-12-20', 3012),
( '2024-01-15', 1013, 2013, 'Arequipa', 'Penal', 21000.00, 113, 'Resumen de Controversia 13', 'Resumen de Peticiones 13', 'Arbitro 13', 'Declaraciones 13', 'Concluido', 'Decisión 13', NULL, NULL, '2024-02-01', 3013),
( '2024-02-20', 1014, 2014, 'Lima', 'Civil', 27000.00, 114, 'Resumen de Controversia 14', 'Resumen de Peticiones 14', 'Arbitro 14', 'Declaraciones 14', 'En Proceso', 'Decisión 14', NULL, NULL, '2024-02-10', 3014),
( '2024-03-10', 1015, 2015, 'Cusco', 'Familia', 23000.00, 115, 'Resumen de Controversia 15', 'Resumen de Peticiones 15', 'Arbitro 15', 'Declaraciones 15', 'Concluido', 'Decisión 15', NULL, NULL, '2024-03-15', 3015),
( '2024-04-05', 1016, 2016, 'Arequipa', 'Civil', 31000.00, 116, 'Resumen de Controversia 16', 'Resumen de Peticiones 16', 'Arbitro 16', 'Declaraciones 16', 'En Proceso', 'Decisión 16', NULL, NULL, '2024-04-20', 3016),
( '2024-05-15', 1017, 2017, 'Lima', 'Penal', 20000.00, 117, 'Resumen de Controversia 17', 'Resumen de Peticiones 17', 'Arbitro 17', 'Declaraciones 17', 'En Proceso', 'Decisión 17', NULL, NULL, '2024-05-30', 3017),
( '2024-06-20', 1018, 2018, 'Trujillo', 'Familia', 25000.00, 118, 'Resumen de Controversia 18', 'Resumen de Peticiones 18', 'Arbitro 18', 'Declaraciones 18', 'Concluido', 'Decisión 18', NULL, NULL, '2024-06-25', 3018),
( '2024-07-10', 1019, 2019, 'Arequipa', 'Laboral', 19000.00, 119, 'Resumen de Controversia 19', 'Resumen de Peticiones 19', 'Arbitro 19', 'Declaraciones 19', 'En Proceso', 'Decisión 19', NULL, NULL, '2024-07-15', 3019),
( '2024-08-05', 1020, 2020, 'Lima', 'Civil', 22000.00, 120, 'Resumen de Controversia 20', 'Resumen de Peticiones 20', 'Arbitro 20', 'Declaraciones 20', 'Concluido', 'Decisión 20', NULL, NULL, '2024-08-20', 3020);



SELECT d.NroExpediente, n.EstadoNotificacion,d.SustentoAnulacion, n.Observaciones  FROM Demanda d  left join Notificacion n
on n.NroExpediente = d.NroExpediente
where d.NroExpediente = ?
order by n.IdNotificacion, D.NroExpediente  DESC
;


/*CHUAMANIC 20231710 Tabla para Arbitros Aignados a  UNA DEMANDA*/
CREATE TABLE Arbitros (
    IdUsuario INT PRIMARY KEY,
    NroExpediente VARCHAR(20) NOT NULL,
    FechaAsignacion DATE
);
