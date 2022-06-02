#drop schema `instituto_smdl`;
#drop schema `prueba`;

CREATE SCHEMA `instituto_DB`; 
USE instituto_DB;

USE instituto_DB;

/*
use instituto_smdl
-- Deshabilitar verificación de llaves foráneas
SET FOREIGN_KEY_CHECKS = 0;
-- Truncar las tablas necesarias
TRUNCATE Detalle;
TRUNCATE Maestro;
-- Rehabilitar verificación de llaves foráneas
-- Este paso es importante, no olvidarlo
SET FOREIGN_KEY_CHECKS = 1;
*/


/* Tabla tipo de roles
CREATE TABLE rol (idrol int not null, 
				 rol varchar(50),
                 primary key (idrol)
                 )
*/

/* Tabla tipo de evaluciones
drop table tipoevaluacion
CREATE TABLE tipoevaluacion(idtipo int not null,
						     descripcion varchar(50) not null,
                             primary key(idtipo)                             
                             )						
*/

/* Tabla usuarios
DROP TABLE USUARIO // antes hay que quitar los foreign key

CREATE TABLE `instituto_DB`.`usuario` (
						  `id` INT NOT NULL AUTO_INCREMENT ,
						  `dni` INT NOT NULL,
						  `idrol` INT NOT NULL,
						  `nickname` VARCHAR(50) NOT NULL,
						  `clave` VARCHAR(50) NOT NULL,
						  `nombre` VARCHAR(120) NOT NULL,
						  `nacimiento` DATE NOT NULL,
						  `edad` INT NOT NULL,
						  `email` VARCHAR(120) NOT NULL,
						  `alta` DATE NOT NULL DEFAULT CURRENT_TIMESTAMP,
						  `direccion` VARCHAR(120) NOT NULL,
						  `telefono` VARCHAR(50) NOT NULL,
						  `activo` TINYINT NOT NULL DEFAULT 1,
						  PRIMARY KEY (`id`, `dni`),
						  INDEX `usuario_rol_idx` (`idrol` ASC) VISIBLE,
						  CONSTRAINT `usuario_rol`
							FOREIGN KEY (`idrol`)
							REFERENCES `instituto_smdl`.`rol` (`idrol`)
							ON DELETE NO ACTION
							ON UPDATE NO ACTION);
*/
/*
CREATE TABLE CURSO (idcurso INT NOT NULL,
				 nombrecurso VARCHAR(120) NOT NULL, 
				 cantalumnos INT NOT NULL,
                 cantprofesores INT NOT NULL,                 
				 primary key (idcurso) 
                 )
*/

select * from alumno

/* tabla alumnos
drop table alumno
CREATE TABLE alumno (id INT NOT NULL AUTO_INCREMENT,
					dnialumno INT NOT NULL,
					anioencurso INT NOT NULL,
					idcurso INT NOT NULL,
					PRIMARY KEY (id),                    
				    FOREIGN KEY (dnialumno) REFERENCES usuario(dni),					
					FOREIGN KEY (idcurso) REFERENCES curso(idcurso)
                    )
			
*/

/* tabla profesores
DROP TABLE PROFESOR
CREATE TABLE PROFESOR(dniprofesor int not null, 
				      titulo varchar(120) not null,
					  experiencia int null,
                      primary key (dniprofesor),
                      foreign key (dniprofesor) references USUARIO(dni))
*/

/* TABLA DIRECTIVOS
DROP TABLE DIRECTIVO
CREATE TABLE DIRECTIVO(dnidirectivo INT NOT NULL, 				
						cargo VARCHAR(120) NOT NULL,
						primary key (dnidirectivo),
						foreign key (dnidirectivo) references USUARIO(dni)
                        )
*/

/*
DROP TABLE MATERIA
CREATE TABLE MATERIA(idmateria int not null, 
				     nombremateria varchar (120) not null,
                     urlprograma varchar(250) null,
                     primary key (idmateria)
                     )                    
*/

/* Tabla que contiene evaluacion de los docentes
DROP TABLE profesorevaluacion
CREATE TABLE profesorevaluacion(idevaluacion int not null AUTO_INCREMENT ,
								idtipo int not null,
                                idcurso int not null,
								idmateria int not null,
								dniprofesor int not null,
								urlevaluacioncarga varchar(250) not null,
                                urlevaluaciondescarga varchar(250) not null,
								nombreevaluacion varchar(120) not null,
								primary key(idevaluacion),
								foreign key (idtipo) references tipoEvaluacion(idtipo),
								foreign key (idmateria) references MATERIA(idmateria),
                                foreign key (idcurso) references CURSO(idcurso),
								foreign key (dniprofesor) references PROFESOR(dniprofesor)						
								)
*/

/*
DROP TABLE CursoMateriaProfesor
CREATE TABLE cursomateriaprofesor (id  int not null AUTO_INCREMENT ,
				 idcurso int null,
                 idmateria int not NULL,      
                 dniprofesor int not null, 				 
				 primary key (id),                
				 foreign key (idmateria) references MATERIA(idmateria),
				 foreign key (idcurso) references CURSO(idcurso),
				 foreign key (dniprofesor) references PROFESOR(dniprofesor)	              
                 )
*/

/*
drop table alumnoevaluacion
CREATE TABLE alumnoevaluacion (id int not null AUTO_INCREMENT ,
				 dnialumno int not null, 				 
				 idevaluacion int not null,
				 notaevaluacion int NULL,      
				 primary key (id),                
                 foreign key (dnialumno) references alumno(dnialumno),               
                 foreign key (idevaluacion) references profesorevaluacion(idevaluacion)               
                 )
*/


/*
SHOW ENGINE innodb STATUS;

show index from alumno

truncate table alumno; 
Error Code: 1822. Failed to add the foreign key constraint. Missing index for constraint 'alumno_ibfk_1' in the referenced table 'usuario'

DROP FOREIGN KEY alumno_ibfk_1 in the referenced table 'usuario';
*/