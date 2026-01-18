# 🧩 URL Shortener en Java

Un acortador de URLs ligero, rápido y multiplataforma desarrollado en **Java**, compatible con **Windows** y **Linux**. Ideal para proyectos personales, despliegues en servidores pequeños o como base para sistemas más complejos.

---

## 🚀 Características principales

- ✨ Acorta URLs largas generando identificadores únicos  
- 🔁 Redirección automática al acceder al enlace corto  
- 🗂️ Persistencia opcional (archivo local o base de datos)  
- 🧪 API REST sencilla (si tu implementación la incluye)  
- 🖥️ Funciona en Windows y Linux sin cambios  
- 📦 Empaquetado en `.jar` para ejecución directa  
- 🔧 Configuración mínima mediante `.properties` o variables de entorno  

---

## 📦 Requisitos

- **Java 17 o superior**  
- (Opcional) **Maven** o **Gradle**  
- (Opcional) **Git**

---

## 🛠️ Instalación

### 1. Clonar el repositorio

```bash
git clone https://github.com/tuusuario/urlshortener-java.git
cd urlshortener-java
```

### 2. Compilar el proyecto

Con Maven:
```
mvn clean package
```

Con Gradle:
```
gradle build
```

El archivo ejecutable quedará en:
```
/target/urlshortener.jar
```
o
```
/build/libs/urlshortener.jar
```

## En Windows
```
java -jar urlshortener.jar
```
## En Linux
```
java -jar urlshortener.jar &
```
### ⚙️ Configuración

Archivo config.properties:
```
server.port=8080
storage.type=file
storage.path=data/urls.db
base.url=http://localhost:8080/
```

Variables de entorno:
```
export SERVER_PORT=8080
export BASE_URL=https://tudominio.com/
```

### 📚 Uso
Crear una URL corta (API REST)
```
POST /shorten
Content-Type: application/json

{
  "url": "https://www.ejemplo.com/articulo/largo"
}
```

Respuesta:
```
{
  "shortUrl": "http://localhost:8080/abc123"
}
```

Acceder a la URL corta
```
GET /abc123
```
Redirige automáticamente a la URL original.

### 🧪 Tests
```
mvn test
```
o
```
gradle test
```

### 📁 Estructura del proyecto
```
src/
 ├── main/
 │   ├── java/
 │   │   └── com.example.urlshortener/
 │   │       ├── controller/
 │   │       ├── service/
 │   │       ├── repository/
 │   │       └── UrlShortenerApplication.java
 │   └── resources/
 │       └── application.properties
 └── test/
```


###🛡️ Licencia
Este proyecto está bajo la licencia MIT. Puedes usarlo libremente en proyectos personales o comerciales.
```
Si quieres, puedo añadir **badges**, una **sección de contribución**, un **diagrama de arquitectura**, o adaptarlo exactamente a tu código real. ¿Quieres que lo personalice más?
```







