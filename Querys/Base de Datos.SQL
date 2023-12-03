-- AEDArbitraje.dbo.Anexo definition

-- Drop table

-- DROP TABLE AEDArbitraje.dbo.Anexo;

CREATE TABLE AEDArbitraje.dbo.Anexo (
	IdAnexo int IDENTITY(1,1) NOT NULL,
	NroExpediente varchar(10) COLLATE Modern_Spanish_CI_AS NULL,
	TipoDocumento varchar(10) COLLATE Modern_Spanish_CI_AS NULL,
	NombreDocumento varchar(max) COLLATE Modern_Spanish_CI_AS NULL,
	Formato varchar(50) COLLATE Modern_Spanish_CI_AS NULL,
	FechaCarga date NULL,
	EstadoCarga int NULL,
	Usuario varchar(50) COLLATE Modern_Spanish_CI_AS NULL,
	archivopdf varbinary(MAX) NULL,
	CONSTRAINT PK__Anexo__8C1FE271260D7C57 PRIMARY KEY (IdAnexo)
);

-- AEDArbitraje.dbo.Arbitros definition

-- Drop table

-- DROP TABLE AEDArbitraje.dbo.Arbitros;

CREATE TABLE AEDArbitraje.dbo.Arbitros (
	IdUsuario int NOT NULL,
	NroExpediente varchar(20) COLLATE Modern_Spanish_CI_AS NOT NULL,
	FechaAsignacion date NULL,
	CONSTRAINT PK__Arbitros__5B65BF978F57550A PRIMARY KEY (IdUsuario)
);


-- AEDArbitraje.dbo.Demanda definition

-- Drop table

-- DROP TABLE AEDArbitraje.dbo.Demanda;

CREATE TABLE AEDArbitraje.dbo.Demanda (
	iddemanda int IDENTITY(1,1) NOT NULL,
	NroExpediente varchar(50),
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



Create table RechazarDemanda(
	idRechazo int IDENTITY(1,1) NOT NULL,
	NroExpediente varchar(10),
	Motivo varchar(50),
	Fecha varchar(16),
	Arbitro varchar(50) ,
	instancia varchar(50) ,
	CONSTRAINT idRechazo PRIMARY KEY (idRechazo)
);

-- AEDArbitraje.dbo.Logs definition

-- Drop table

-- DROP TABLE AEDArbitraje.dbo.Logs;

CREATE TABLE AEDArbitraje.dbo.Logs (
	log_id int IDENTITY(1,1) NOT NULL,
	fecha datetime NULL,
	username varchar(255) COLLATE Modern_Spanish_CI_AS NULL,
	accion varchar(50) COLLATE Modern_Spanish_CI_AS NULL,
	ref1 varchar(50) COLLATE Modern_Spanish_CI_AS NULL,
	ref2 varchar(50) COLLATE Modern_Spanish_CI_AS NULL,
	detalle text COLLATE Modern_Spanish_CI_AS NULL,
	CONSTRAINT PK__Logs__9E2397E0CAF43516 PRIMARY KEY (log_id)
);


-- AEDArbitraje.dbo.Notificacion definition

-- Drop table

-- DROP TABLE AEDArbitraje.dbo.Notificacion;

CREATE TABLE AEDArbitraje.dbo.Notificacion (
	IdNotificacion int NOT NULL,
	NroExpediente int NULL,
	EstadoNotificacion varchar(20) COLLATE Modern_Spanish_CI_AS NULL,
	FechaNotificacion date NULL,
	FechaVisualizacion date NULL,
	ColorEstado varchar(20) COLLATE Modern_Spanish_CI_AS NULL,
	Observaciones text COLLATE Modern_Spanish_CI_AS NULL,
	Leida int NULL,
	idUsuario varchar(11) COLLATE Modern_Spanish_CI_AS NULL,
	CONSTRAINT PK__Notifica__F6CA0A8593D0A05D PRIMARY KEY (IdNotificacion)
);


-- AEDArbitraje.dbo.Rol definition

-- Drop table

-- DROP TABLE AEDArbitraje.dbo.Rol;

CREATE TABLE AEDArbitraje.dbo.Rol (
	idrol int IDENTITY(1,1) NOT NULL,
	nombrerol varchar(50) COLLATE Modern_Spanish_CI_AS NULL,
	estadorol int NULL,
	CONSTRAINT PK__Rol__24C6BB206CF332B5 PRIMARY KEY (idrol)
);


-- AEDArbitraje.dbo.poldat definition

-- Drop table

-- DROP TABLE AEDArbitraje.dbo.poldat;

CREATE TABLE AEDArbitraje.dbo.poldat (
	polcod varchar(50) COLLATE Modern_Spanish_CI_AS NOT NULL,
	polvar varchar(50) COLLATE Modern_Spanish_CI_AS NULL,
	polval varchar(50) COLLATE Modern_Spanish_CI_AS NULL,
	rtstr1 varchar(50) COLLATE Modern_Spanish_CI_AS NULL,
	rtstr2 varchar(50) COLLATE Modern_Spanish_CI_AS NULL,
	rtrnum int NULL
);


-- AEDArbitraje.dbo.usuario definition

-- Drop table

-- DROP TABLE AEDArbitraje.dbo.usuario;

CREATE TABLE AEDArbitraje.dbo.usuario (
	id_usuario int IDENTITY(1,1) NOT NULL,
	nombre_usuario varchar(70) COLLATE Modern_Spanish_CI_AS NOT NULL,
	contrasena varchar(9) COLLATE Modern_Spanish_CI_AS NOT NULL,
	id_rol varchar(15) COLLATE Modern_Spanish_CI_AS NOT NULL,
	estado int NOT NULL,
	nro_intentos int NOT NULL,
	fecha_caducidad varchar(50) COLLATE Modern_Spanish_CI_AS NULL,
	CONSTRAINT PK__usuario__4E3E04AD0D05ECD6 PRIMARY KEY (id_usuario)
);



-----------------------------------------

CREATE TABLE AEDArbitraje.dbo.Audiencia (
    IdAudiencia INT,
    NumerodeExpediente VARCHAR(10),
    FechadeRegistro VARCHAR(20),
    LugardeAudiencia VARCHAR(70),
    Arbitro VARCHAR(70),
    EstadoExpediente VARCHAR(20),
    Fechadeprogramacion VARCHAR(20),
    InformacionAdicional VARCHAR(255),
	EstadoAudiencia VARCHAR(20),
	ResultadoAudiencia VARCHAR(20),
	FechaAudiencia VARCHAR(10)
);




CREATE TABLE [dbo].[Caceptacion](
	[id_cuestionario] int IDENTITY(1,1) NOT NULL,
	[pregunta] VARCHAR(150) NOT NULL,
	[descripcion] VARCHAR(255) NOT NULL,
	[respuesta] VARCHAR(10) NOT NULL,
	[criterio] VARCHAR(10) NOT NULL,
	[estado] VARCHAR(10) NOT NULL
	CONSTRAINT id_cuestionario PRIMARY KEY (id_cuestionario)
)
;




CREATE TABLE AEDArbitraje.dbo.Anular (
  NroExpediente VARCHAR(20),
  Fecha VARCHAR(20),
  Motivo VARCHAR(255),
  Justificacion VARCHAR(255)
);


USE [AEDArbitraje]
;

USE [AEDArbitraje]
;

/****** Object:  Sequence [dbo].[SEC_EXPEDIENTE]    Script Date: 16/11/2023 03:18:38 ******/
CREATE SEQUENCE [dbo].[SEC_EXPEDIENTE] 
 AS [bigint]
 START WITH 10000
 INCREMENT BY 1
 MINVALUE 10000
 MAXVALUE 9223372036854775807
 CYCLE 
 CACHE 
;

		INSERT INTO usuario
           ([nombre_usuario]
           ,[contrasena]
           ,id_rol,
		   estado,
		   nro_intentos)
     VALUES
			('admin', 'admin', '1',1,0,'2023'),
           ('usuario2', 'Iass2', '2',1,0,'2023'),
           ('usuario3', 'pass3', '3',1,0,'2023'),
		    ('usuario3', 'pass3', '4', 1,0,'2023');
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

create table USR_UBIGEO
(
  ubigeo       VARCHAR(10) not null,
  ctry_name    VARCHAR(60) not null,
  adrstc       VARCHAR(40) not null,
  adrcty       VARCHAR(70) not null,
  adrpsz       VARCHAR(20) not null,
  adr_district VARCHAR(30) not null
);


INSERT INTO AEDArbitraje.dbo.USR_UBIGEO
(ubigeo, ctry_name, adrstc, adrcty, adrpsz, adr_district)
VALUES('040513', 'PER', 'AREQUIPA', 'CAYLLOMA', '040513', 'MADRIGAL');
INSERT INTO AEDArbitraje.dbo.USR_UBIGEO
(ubigeo, ctry_name, adrstc, adrcty, adrpsz, adr_district)
VALUES('040514', 'PER', 'AREQUIPA', 'CAYLLOMA', '040514', 'SAN ANTONIO DE CHUCA');
INSERT INTO AEDArbitraje.dbo.USR_UBIGEO
(ubigeo, ctry_name, adrstc, adrcty, adrpsz, adr_district)
VALUES('040515', 'PER', 'AREQUIPA', 'CAYLLOMA', '040515', 'SIBAYO');
INSERT INTO AEDArbitraje.dbo.USR_UBIGEO
(ubigeo, ctry_name, adrstc, adrcty, adrpsz, adr_district)
VALUES('040516', 'PER', 'AREQUIPA', 'CAYLLOMA', '040516', 'TAPAY');
INSERT INTO AEDArbitraje.dbo.USR_UBIGEO
(ubigeo, ctry_name, adrstc, adrcty, adrpsz, adr_district)
VALUES('040517', 'PER', 'AREQUIPA', 'CAYLLOMA', '040517', 'TISCO');



create table RegPartes(
idPartes char(8) PRIMARY KEY,
RegistroA varchar(20),
TipoP varchar(20),
Nombres varchar(40),
Apellidos varchar(40),
TipoD varchar(20),
NumDoc int,
NombreEmp varchar(40),
Correo varchar (50),
Fecha_Nacimiento char(8),
Fecha_Creacion char(8),
Nacionalidad varchar(30),
OrigenEmp varchar(40),
Telefono int,
Direccion varchar(50),
);