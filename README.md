
## Proyecto ejemplo Spring Boot

Este es un proyecto que será la base para construir un microservicio basado en **Spring Boot**.

La estructura del proyecto es:

 - **/controller:** Paquete donde se almacenarán las clases que representan la API-REST del microservicio
 - **/service:** Declaración de la capa de Servicio que será invocada desde la capa API (Controller)
 - **/service/impl:**  Implementación de la capa de servicios. En estas clases se deberá implementar la capa de negocio de nuestros microservicios
 - **/resources/static:** Contenido del HTML, JS y CSS de nuestro portal Web

## Instrucciones de uso

Limpiar dependencias
> mvn clean

Empaquetar microservicio (Jar file)

> mvn package

Ejecutar microservicio en una terminal

> mvn spring-boot-run


## Operaciones disponibles

> Añadir formularios a la base de datos mediante la sentencia: /addNewForm/nombre={nombre}/email={email}/mensaje={mensaje}

**Ejemplo:** http://localhost:8888/api/addNewForm/nombre=miguel torres/email=miguel@gmail.com/mensaje=Mensaje para la practica 5 de PAT

![image](https://user-images.githubusercontent.com/97603106/235356972-ada0ce84-a287-4ef7-b8d2-1abaf07ecbcf.png)

> Obtener todos los formularios guardados en la base de datos: /getForms

**Ejemplo:** http://localhost:8888/api/getForms

![image](https://user-images.githubusercontent.com/97603106/235357214-808d51ae-4b3c-4a0c-886e-5ebb52c656eb.png)

> Eliminar un formulario de la base de datos: /deleteForm/param={parametro}

**Ejemplo:** http://localhost:8888/api/deleteForm/param=1 elimina el formulario con identificador 1

Además, también se comprueba que los datos introducidos sean correctos. En caso que no lo sean se mostrará una alerta por el navegador


