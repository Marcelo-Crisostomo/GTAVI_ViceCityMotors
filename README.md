# 🌴 Vice City Motors · GTA VI

**Evaluación Parcial 3 · DSY1102 Desarrollo Orientado a Objetos · Forma GTA VI**

Aplicación de escritorio en **Java 21 + JavaFX + Maven + MySQL** para registrar los vehículos de una automotora de Vice City (Leonida). Vas a construir la conexión a la base de datos, el DAO y el Controller de una ventana que ya viene armada.

🎮 **Guía interactiva:** https://marcelo-crisostomo.github.io/GTAVI_ViceCityMotors/

---

## 📦 Contenido del repositorio

| Archivo / carpeta | Descripción |
|---|---|
| `Prueba_GTAVI_ViceCityMotors.html` | Guía interactiva (misiones). Ábrela con doble clic o desde el enlace de arriba. |
| `ViceCityMotors_Base.zip` | Proyecto base para IntelliJ IDEA (Maven + `.idea` con botón ▶ listo). |
| `ViceCityMotors_Base/` | El mismo proyecto base, descomprimido. |
| `Guia_GTAVI_ViceCityMotors.pdf` | Guía de la Parte 1 para descargar o imprimir. |
| `DSY1102_EP3_Instrucciones_Alumno_Forma_GTAVI.docx` | Enunciado oficial de la evaluación. |

## 🛠️ Requisitos

- **JDK 21**
- **IntelliJ IDEA** (Maven viene integrado)
- **MySQL / MariaDB** con XAMPP o Laragon, en el puerto `3306`

## 🚀 Cómo empezar

1. Descarga `ViceCityMotors_Base.zip` y descomprímelo.
2. En phpMyAdmin o HeidiSQL ejecuta **todo** el archivo `scripts/vicecity.sql`. Crea la base `vicecity` y la tabla `vehiculos`.
3. En IntelliJ: **File › Open** › carpeta `ViceCityMotors_Base` › **Trust Project**.
   Si te pide SDK: **File › Project Structure › Project SDK = JDK 21**.
4. Ejecuta con el botón ▶ **"Vice City Motors (javafx:run)"**, o con `mvn clean javafx:run`.

> Mientras no exista `VehiculoController` vas a ver un `ClassNotFoundException`. Es normal.

## ✅ Lo que ya viene hecho (no modificar)

- `App.java`: inicio de JavaFX y estilo neón.
- `model/Vehiculo.java`: clase padre abstracta.
  - `VehiculoTerrestre`: precio final = base **+ $10.000**.
  - `VehiculoAcuatico`: precio final = base **− 20 %**.
- `main-view.fxml`: la ventana completa.
  - `fx:id`: `tipo`, `codigo`, `nombre`, `precio`, `lista`, `mensaje`
  - eventos: `#guardar`, `#eliminar`, `#limpiar`, `#seleccionar`
- `vicecity.css` y `scripts/vicecity.sql`.

## 🧩 Lo que debes construir

1. **`pom.xml`**: agrega la dependencia `mysql-connector-j` donde indica el comentario `EP3`.
2. **`config/Conexion.java`**: datos de conexión y método `abrir()`.
3. **`dao/VehiculoMySQLDAO.java`**: `listar()`, `guardar(Vehiculo)` y `eliminar(int)`.
4. **`controller/VehiculoController.java`**: eventos de la ventana, **sin SQL**. Debe usar los `fx:id` y eventos del FXML.

Como referencia puedes usar el proyecto **PuertoGames** visto en clases.

## 🗄️ Tabla `vehiculos`

| Columna | Tipo |
|---|---|
| `id` | `INT AUTO_INCREMENT PRIMARY KEY` |
| `codigo` | `VARCHAR(20) UNIQUE` |
| `nombre` | `VARCHAR(100)` |
| `precio_base` | `INT` (> 0) |
| `tipo` | `ENUM('TERRESTRE','ACUATICO')` |

## 🧯 Errores frecuentes

| Error | Causa probable |
|---|---|
| `Communications link failure` | MySQL apagado o puerto distinto de 3306. |
| `Access denied` | Usuario o contraseña incorrectos en `Conexion.java`. |
| `Unknown database 'vicecity'` | No ejecutaste `scripts/vicecity.sql`. |
| `No suitable driver` | Falta `mysql-connector-j` o no recargaste Maven. |
| `Duplicate entry` | Ya existe un vehículo con ese código. |
| `Location is not set` | Moviste o renombraste `main-view.fxml` (va en `resources/cl/duoc/vicecity`). |
| `ClassNotFoundException` del controller | Revisa `fx:controller` en el FXML. |

---

<sub>Material con fines educativos · DuocUC · DSY1102. Logo, personajes y arte de GTA VI © Rockstar Games / Take-Two Interactive.</sub>
