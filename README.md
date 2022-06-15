# LaboratoriosPOO2

Clase 3. Composición 10032022

Herramientas: StarUML y Netbeans
Objetivo: Diseñar el modelo de clases y desarrollar los requerimientos funcionales en JAVA
Enunciado o Problema:
En el concesionario de autos “AUTOYA” se requiere el desarrollo de un módulo informático utilizando sus habilidades para la programación. Como buen programador puedes utilizar cualquier lenguaje, pero por lineamientos del cliente se debe desarrollar la aplicación en JAVA.
La aplicación debe permitir la gestión de la información de los clientes y los automóviles que venden.
De los clientes se tiene su documento de identificación, nombre, apellidos, género y dirección
Los automóviles cuentan con una descripción detallada del motor y de su chasis, así mismo cuentan con una marca, un modelo y un numero de puertas
Del motor es necesario conocer su capacidad y su número de serie.
Del Chasis es necesario conocer el numero y la procedencia
Requerimientos:
RF1: Mostrar el automóvil que compro determinado cliente incluyendo la capacidad del motor y la procedencia del chasis.
RF2: El sistema debe permitir acceder a los atributos de automóvil y actualizar la información
RF3: Se debe conocer cuantos de los clientes del concesionario son de genero femenino y cuantos de género masculino

-----------------------------------------------------------------------------------------------------------------------------------------------------------------
LABORATORIO 24032022

Tema: Variables estáticas
Objetivo: Evaluar la temática de atributos estáticos y reforzar conceptos de herencia.
Enunciado:
En Colombia se desea realizar la sistematización de las elecciones parlamentarias, para lo cual se desea realizar el registro de los candidatos que pueden ser representantes a la cámara o senadores. Del candidato se cuenta con los siguientes datos nombre, número de documento, email, género y teléfono, así como su afinidad o partido político, cada partido político está identificado por un nombre y año de creación. Si el candidato está inscrito para el Senado que es de ámbito nacional tiene un numero por su partido político, que va desde el 1 hasta el 100 y para la cámara de representantes la cual es de ámbito departamental, es decir que un representante a la cámara se inscribe por un departamento, van desde el 101 hasta el 1XX donde XX corresponde al número de curules disponibles para el departamento, es así que en Norte de Santander solo hay 5 curules disponibles, así que los números van desde el 101 hasta el 105, por cada partido político participante.
Se debe poder registrar el total de votos por cada candidato y el total de votos recibidos por cada corporación (senado o cámara).
El sistema debe verificar la validez de un número de candidato ya sea por la cámara o por el senado, es decir que se encuentre dentro de los rangos de números permitidos por cada corporación y en el caso de la cámara por departamento.
El sistema debe retornar para un candidato dado el porcentaje de votos que representa del total de la votación. Se debe imprimir la información del representante a la cámara o del senador como se observa:

1.	Definir el diagrama de clases para el enunciado (Siguiendo la metodología de abstracción de POO) (Valor: 1.0)
2.	Definir los requerimientos funcionales (Valor: 1.0)
3.	Implementar la solución para el problema usando la herramienta BlueJ (Valor: 3.0)
------------------------------------------------------------------------------------------------------------------------------------------------------------------
LABORATORIO 21ABRIL2022

La parroquia “Sagrada Familia” requiere una aplicación que permita llevar el registro de sus feligreses, para lo que necesita guardar los datos como cedula, nombre, dirección, teléfono, estrato y estado. El estado del feligrés puede ser “Deudor” y “Cumplido”. Así mismo se necesita llevar el control de los diezmos, para ello la parroquia tiene definido unos criterios.

●	Si el estrato del feligrés es “1” el valor del diezmo es de $250.000
●	Si el estrato del feligrés está entre 2 y 3; el valor del diezmo es de $500.000
●	Si el estrato del feligrés es superior a 3; el valor del diezmo es de $1.000.000

La aplicación debe permitir guardar, eliminar, actualizar los datos del feligrés; así como buscar un feligrés para revisar su estado actual o conocer datos para realizar notificaciones.
El sistema debe mostrar el valor del diezmo que debe pagar el feligrés y esta consulta la debe hacer por su número de cédula, una vez el feligrés pague el diezmo se debe actualizar el estado del feligrés a “Cumplido”.
Es necesario totalizar el dinero recibido por diezmos.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------
LABORATORIO 21ABRIL2022

La parroquia “Sagrada Familia” requiere una aplicación que permita llevar el registro de sus feligreses, para lo que necesita guardar los datos como cedula, nombre, dirección, teléfono, estrato y estado. El estado del feligrés puede ser “Deudor” y “Cumplido”. Así mismo se necesita llevar el control de los diezmos, para ello la parroquia tiene definido unos criterios.

●	Si el estrato del feligrés es “1” el valor del diezmo es de $250.000
●	Si el estrato del feligrés está entre 2 y 3; el valor del diezmo es de $500.000
●	Si el estrato del feligrés es superior a 3; el valor del diezmo es de $1.000.000

1. La aplicación debe permitir guardar, eliminar, actualizar los datos del feligrés; así como buscar un feligrés para revisar su estado actual o conocer datos para realizar notificaciones.
2. El sistema debe mostrar el valor del diezmo que debe pagar el feligrés y esta consulta la debe hacer por su número de cédula, una vez el feligrés pague el diezmo se debe actualizar el estado del feligrés a “Cumplido”.
3. Es necesario totalizar el dinero recibido por diezmos.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------


