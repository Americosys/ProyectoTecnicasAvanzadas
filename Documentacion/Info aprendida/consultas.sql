SELECT * FROM USUARIO;
SELECT * FROM DIRECTIVO;
SELECT * FROM ALUMNO;
SELECT * FROM PROFESOR;

use instituto_smdl

/* aca cargue los tres roles               
CALL spInsertUsuario(888, 1, 'nickname1', 'clave1234', 'Emilio','1977-05-14', 45, 'emilio1@gmail.com', 'Lauraro 1234', '1234-1111', 'Director', 0, '', 0);  
CALL spInsertUsuario(25772955, 2, 'nickname2', 'clave1234', 'Pepe','1977-05-15', 45, 'Pepe@gmail.com', 'Directorio 1232', '1234-2222', '', 0, 'Lic. Matematica', 5);  
CALL spInsertUsuario(25772956, 3, 'nickname3', 'clave1234', 'Roberto','1977-05-16', 45, 'Roberto@gmail.com', 'Acoyte 1233', '1234-3333', '', 2, '', 0);  
CALL spGetAllUsuario(); 
*/;

SELECT * FROM DIRECTIVO;
SELECT * FROM ALUMNO;
SELECT * FROM PROFESOR;
SELECT * FROM usuario;

DELETE FROM DIRECTIVO WHERE dniDirectivo in (666,25444564,99,57,55,252,26,27,987);
DELETE FROM PROFESOR WHERE dniProfesor in (666,25444564,99,57,55,252,26,27,987);
DELETE FROM ALUMNO WHERE dnialumno in (666,25444564,99,57,55,252,26,27,987);
DELETE FROM USUARIO WHERE dni in (666,25444564,99,57,55,252,26,27,987);

truncate table USUARIO;

SELECT * FROM CURSO;
delete from curso where idcurso in (1,2,3,4,5);

select * from usuario;

call spGetUsuario(57);

SELECT * FROM materia;


delete FROM PROFESOR where dniProfesor = 25772955;

delete FROM ALUMNO where dnialumno=25772956;

ALTER TABLE `instituto_smdl`.`usuario` 
CHANGE COLUMN `alta` `alta` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ;


Call spDeleteUsuario (2577295);
Call spDeleteUsuario (25772955);
Call spDeleteUsuario (2577297);
Call spDeleteUsuario (25772972);

# alta logica de un usuario
Call spActivarUsuario (25772953);

#idMateria, nombreMateria urlprograma



set @po_idrol = 0;
set @msj = '0';
call instituto_smdl.spLogin(1, '1234', @po_idrol, @msj);
select @po_idrol, @msj;


# id, idcurso,idmateria,dniProfesor
Select * from cursomateriaprofesor;
call spAlumnosCurso(1);

delete from cursomateriaprofesor where dniprofesor = 3 AND idcurso=1;
SELECT * FROM CURSO where idcurso = 2;

update curso
set cantmate=0,
	cantprofe = 0
    where idcurso=1;

call spGetAlumnosCurso (2);

call spincrementarProfeMateria (1);
call spdecrementarProfeMateria (2);

select * from curso where idcurso=2;
select * from USUARIO where idrol = 3;
select * from cursomateriaprofesor;
CALL spDeleteCursoMateriaProfesor(60);



call spdecrementarAlumnoCurso(1);
call spincrementarAlumnoCurso(1);
call spGetIdCursoRegistro(61);

# id, dnialumno, idcurso
select * from alumno;

#id,dni,idrol,nicname,clave,nombre,nacimiento,edad,email,alta,direccion,telefono,activo,cargo,idcurso,titulo,experiencia
select * from usuario;

SELECT * FROM MATERIA;
SELECT * FROM PROFESOR;
call spGetCurso(1);
