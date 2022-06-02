SELECT * FROM USUARIO;
SELECT * FROM DIRECTIVO;
SELECT * FROM ALUMNO;
SELECT * FROM PROFESOR;



/* aca cargue los tres roles               
CALL spInsertUsuario(25772954, 1, 'nickname1', 'clave1234', 'Emilio','1977-05-14', 45, 'emilio1@gmail.com', 'Lauraro 1234', '1234-1111', 'Director', 0, 0, '', 0);  
CALL spInsertUsuario(25772955, 2, 'nickname2', 'clave1234', 'Pepe','1977-05-15', 45, 'Pepe@gmail.com', 'Directorio 1232', '1234-2222', '', 0, 0, 'Lic. Matematica', 5);  
CALL spInsertUsuario(25772956, 3, 'nickname3', 'clave1234', 'Roberto','1977-05-16', 45, 'Roberto@gmail.com', 'Acoyte 1233', '1234-3333', '', 1, 2, '', 0);  
*/
SELECT * FROM DIRECTIVO;
SELECT * FROM ALUMNO;
SELECT * FROM PROFESOR;
SELECT * FROM usuario;

DELETE FROM DIRECTIVO WHERE dniDirectivo in (25772955,25772954,25772956);
DELETE FROM PROFESOR WHERE dniProfesor in (25772955,25772954,25772956);
DELETE FROM ALUMNO WHERE dnialumno in (25772955,25772954,25772956);
DELETE FROM USUARIO WHERE dni in (25772955,25772954,25772956);

SELECT * FROM CURSO;


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