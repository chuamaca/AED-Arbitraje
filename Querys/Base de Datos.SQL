-- AEDArbitraje.dbo.Anexo definition

-- Drop table

-- DROP TABLE AEDArbitraje.dbo.Anexo;

CREATE TABLE AEDArbitraje.dbo.Anexo (
	IdAnexo int IDENTITY(1,1) NOT NULL,
	NroExpediente varchar(10) COLLATE Modern_Spanish_CI_AS NULL,
	TipoDocumento varchar(10) COLLATE Modern_Spanish_CI_AS NULL,
	NombreDocumento varchar(50) COLLATE Modern_Spanish_CI_AS NULL,
	Formato varchar(50) COLLATE Modern_Spanish_CI_AS NULL,
	FechaCarga date NULL,
	EstadoCarga int NULL,
	Usuario varchar(50) COLLATE Modern_Spanish_CI_AS NULL,
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
	CONSTRAINT PK__usuario__4E3E04AD0D05ECD6 PRIMARY KEY (id_usuario)
);