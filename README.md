# ================================
# URL Shortener - Java
# ================================

# Proyecto: Acortador de URLs en Java
# Compatible con Windows y Linux

# -------------------------------
# 1️⃣ Requisitos
# -------------------------------
# Asegúrate de tener:
# - Java 17+
# - Maven o Gradle
# - curl o navegador para probar endpoints

# -------------------------------
# 2️⃣ Clonar el repositorio
# -------------------------------
git clone https://github.com/tuusuario/urlshortener-java.git
cd urlshortener-java

# -------------------------------
# 3️⃣ Construir el proyecto
# -------------------------------
# Con Maven:
mvn clean install
# Con Gradle:
# ./gradlew build

# -------------------------------
# 4️⃣ Ejecutar la aplicación
# -------------------------------
# En Linux, si da problemas de permisos:
# chmod +x target/urlshortener-1.0.jar
java -jar target/urlshortener-1.0.jar

# La app estará disponible en: http://localhost:8080

# -------------------------------
# 5️⃣ Usar la API
# -------------------------------

# a) Crear una URL corta
curl -X POST http://localhost:8080/shorten \
-H "Content-Type: application/json" \
-d '{"url":"https://www.ejemplo.com/mi-url-larga"}'

# b) Redirigir a la URL original
curl -I http://localhost:8080/abc123

# c) Listar todas las URLs (opcional)
curl http://localhost:8080/urls

# -------------------------------
# 6️⃣ Contribuir al proyecto
# -------------------------------
git checkout -b feature/nueva-funcionalidad
# Haz tus cambios...
git add .
git commit -m "Agrega nueva funcionalidad"
git push origin feature/nueva-funcionalidad

# -------------------------------
# 7️⃣ Licencia
# -------------------------------
# MIT License © 2026
