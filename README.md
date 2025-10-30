# CALCULADORA WEB - SPRING BOOT

## Descripción del Proyecto

Calculadora web desarrollada con Spring Boot que permite realizar operaciones matemáticas básicas (suma, resta, multiplicación y división) a través de una interfaz web moderna y responsive.

**Proyecto desarrollado con Metodología Scrum**

## Equipo de Desarrollo

- **Abel Méndez** - Product Owner & Developer
- **Ana Torres** - Scrum Master & Developer  
- **Luis Ramírez** - Developer

## Tecnologías Utilizadas

- **Backend:**
  - Java 17
  - Spring Boot 3.1.5
  - Maven 3.8+
  
- **Frontend:**
  - HTML5
  - CSS3
  - JavaScript (ES6)
  - Bootstrap 5.3
  - Font Awesome 6.4

## Estructura del Proyecto

calculadora-spring/
  src/
    main/
        java/com/calculadora/
              CalculadoraApplication.java
              controller/
              service/
              model/
              exception/
        resources/
              static/
              templates/
              application.properties
        test/
    pom.xml

## Requisitos Previos

- JDK 17 o superior
- Maven 3.8 o superior
- Navegador web moderno (Chrome, Firefox, Edge, Safari)

## Instalación y Ejecución

### 1 Clonar o descargar el proyecto

git clone https://github.com/abe03112133/CalculadoraWeb.git
cd calculadora-spring

### 2 Compilar el proyecto

mvn clean install


### 3 Ejecutar la aplicación

**Opción A: Con Maven**

mvn spring-boot:run


**Opción B: Con JAR ejecutable**

java -jar target/calculadora-spring-0.0.1-SNAPSHOT.jar


### 4 Acceder a la aplicación

Abrir navegador en: `http://localhost:8080`

## API REST Endpoints

| Método | Endpoint | Descripción |
|--------|----------|-------------|
| GET | `/` | Página principal |
| POST | `/api/sumar` | Suma dos números |
| POST | `/api/restar` | Resta dos números |
| POST | `/api/multiplicar` | Multiplica dos números |
| POST | `/api/dividir` | Divide dos números |

### Formato de Petición (JSON)

{
  "numero1": 10.0,
  "numero2": 5.0
}


### Formato de Respuesta Exitosa (JSON)

{
  "resultado": 15.0,
  "operacion": "suma",
  "exito": true,
  "mensaje": "Operación realizada exitosamente"
}


### Formato de Respuesta con Error (JSON)

{
  "exito": false,
  "mensaje": "Error: No se puede dividir por cero"
}


## Pruebas

### Pruebas Manuales

1. Acceder a `http://localhost:8080`
2. Ingresar dos números
3. Hacer clic en el botón de la operación deseada
4. Verificar el resultado

### Casos de Prueba

-  Suma: 5 + 3 = 8
-  Resta: 10 - 4 = 6
-  Multiplicación: 6 × 7 = 42
-  División: 20 ÷ 4 = 5
-  División por cero: 10 ÷ 0 (debe mostrar error)
-  Entrada inválida: campos vacíos (debe mostrar alerta)

##  Características

-  Interfaz moderna y responsive
-  Validación de división por cero
-  Compatible con dispositivos móviles
-  Alertas visuales de éxito y error
-  Soporte para tecla Enter
-  Diseño con gradientes y animaciones
-  Actualización dinámica sin recargar página

##  Metodología Scrum

Este proyecto fue desarrollado siguiendo la metodología Scrum:

-  Product Backlog con 6 historias de usuario
-  Sprint de 1 semana
-  Daily Scrums diarios
-  Sprint Review y Retrospective
-  Documentación completa del proceso

## Solución de Problemas

### La aplicación no inicia

- Verificar que el puerto 8080 esté disponible
- Verificar que Java 17 esté instalado: `java -version`
- Limpiar y recompilar: `mvn clean install`

### Error al compilar

- Verificar Maven: `mvn -version`
- Eliminar carpeta `target/` y volver a compilar

### La interfaz no carga

- Verificar que la aplicación esté ejecutándose
- Limpiar caché del navegador
- Verificar consola del navegador (F12) para errores

##  Licencia

Proyecto educativo desarrollado para demostración de metodología Scrum.

**Desarrollado usando Spring Boot y metodología Scrum**  
© 2024 - Todos los derechos reservados
