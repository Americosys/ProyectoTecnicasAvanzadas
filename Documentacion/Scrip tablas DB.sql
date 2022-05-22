CREATE SCHEMA `instituto_smdl`; 
use instituto_smdl

/* Tabla tipo de roles
CREATE TABLE rol (idRol int not null, 
				 rol varchar(50),
                 primary key (idRol)
                 )
*/

/* Tabla tipo de evaluciones
CREATE TABLE tipoEvaluacion(idTipo int not null,
						     descripcion varchar(50) not null,
                             primary key(idTipo)                             
                             )						
*/

/* Tabla usuarios
DROP TABLE USUARIO
CREATE TABLE USUARIO(dni INT NOT NULL, 
					 idRol INT NOT NULL,
					 nickname VARCHAR(50) NOT NULL,
					 password VARCHAR(50) NOT NULL, 
					 nombre VARCHAR(120) NOT NULL,
                     fechaNacimiento DATE NOT NULL,
                     edad INT NOT NULL,
                     email VARCHAR(120),
                     fechaAlta TIMESTAMP, 
                     direccion VARCHAR(120),
                     telefono VARCHAR(50),
                     activo BOOLEAN,                     
                     primary key(dni),
					 foreign key (idRol) references ROL(idRol)                     
					)
*/
/*
DROP TABLE CURSO
CREATE TABLE CURSO (idCurso INT NOT NULL,
				 nombreCurso VARCHAR(120) NOT NULL, 
				 cantAlumnos INT NOT NULL,
                 cantProfesores INT NOT NULL,                 
				 primary key (idCurso) 
                 )
*/

/* tabla alumnos
DROP TABLE ALUMNO
CREATE TABLE ALUMNO(dniAlumno INT NOT NULL, 
					anioEnCurso INT NOT NULL,
                    idCurso INT NOT NULL,
					primary key(dniAlumno),
					foreign key (dniAlumno) references USUARIO(dni), 
                    foreign key (idCurso) references CURSO(idCurso)                     
					)
*/

/* tabla profesores
DROP TABLE PROFESOR
CREATE TABLE PROFESOR(dniProfesor int not null, 
				      titulo varchar(120) not null,
					  experiencia int null,
                      primary key (dniProfesor),
                      foreign key (dniProfesor) references USUARIO(dni))
*/

/* TABLA DIRECTIVOS
DROP TABLE DIRECTIVO
CREATE TABLE DIRECTIVO(dniDirectivo INT NOT NULL, 				
						cargo VARCHAR(120) NOT NULL,
						primary key (dniDirectivo),
						foreign key (dniDirectivo) references USUARIO(dni)
                        )
*/

/*
DROP TABLE MATERIA
CREATE TABLE MATERIA(idMateria int not null, 
				     nombreMateria varchar (120) not null,
                     urlPrograma varchar(250) null,
                     primary key (idMateria)
                     )                    
*/

/* Tabla que contiene evaluacion de los docentes
DROP TABLE profesorEvaluacion
CREATE TABLE profesorEvaluacion(idEvaluacion int not null,
								idTipo int not null,
                                idCurso int not null,
								idMateria int not null,
								dniProfesor int not null,
								urlEvaluacionCarga varchar(250) not null,
                                urlEvaluacionDescarga varchar(250) not null,
								nombreEvaluacion varchar(120) not null,
								primary key(idEvaluacion),
								foreign key (idTipo) references tipoEvaluacion(idTipo),
								foreign key (idMateria) references MATERIA(idMateria),
                                foreign key (idCurso) references CURSO(idCurso),
								foreign key (dniProfesor) references PROFESOR(dniProfesor)						
								)
*/

/*
DROP TABLE CursoMateriaProfesor
CREATE TABLE cursoMateriaProfesor (id  int not null,
				 idCurso int null,
                 idMateria int not NULL,      
                 dniProfesor int not null, 				 
				 primary key (id),                
				 foreign key (idMateria) references MATERIA(idMateria),
				 foreign key (idCurso) references CURSO(idCurso),
				 foreign key (dniProfesor) references PROFESOR(dniProfesor)	              
                 )
*/

/*
drop table alumnoevaluacion
CREATE TABLE alumnoEvaluacion (idAlumnoEvaluacion  int not null,
				 dniAlumno int not null, 				 
				 idEvaluacion int not null,
				 notaEvaluacion int NULL,      
				 primary key (idAlumnoEvaluacion),                
                 foreign key (dniAlumno) references alumno(dniAlumno),               
                 foreign key (idEvaluacion) references profesorEvaluacion(idEvaluacion)               
                 )
*/






