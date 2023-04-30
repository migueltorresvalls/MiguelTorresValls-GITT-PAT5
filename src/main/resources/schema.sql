-- Crear tabla DEMO
/*DROP TABLE IF EXISTS DEMO;
CREATE TABLE DEMO (
    ID INT NOT NULL AUTO_INCREMENT,
    KEY_NAME VARCHAR(50) NOT NULL,
    FIRST_NAME VARCHAR(255) NOT NULL,
    LAST_NAME VARCHAR(255) NOT NULL,
    EMAIL VARCHAR(255) NOT NULL,
    PRIMARY KEY (ID)
);
*/

-- Crear tabla formularios
DROP TABLE IF EXISTS formularios;
CREATE TABLE formularios (
    ID INT NOT NULL,
    NOMBRE VARCHAR(255) NOT NULL,
    EMAIL VARCHAR(255) NOT NULL,
    MENSAJE VARCHAR(255) NOT NULL
);