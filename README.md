# Tragamonedas en Java (MVC + Concurrencia)

## Descripción
Este es un proyecto de una máquina tragamonedas implementada en Java, siguiendo el **Patrón MVC (Modelo-Vista-Controlador)** y utilizando **concurrencia** para manejar la animación del giro de los rodillos. La interfaz gráfica está creada con **Swing**.

## Características
- **Modelo MVC**: Separación clara entre Modelo, Vista y Controlador.
- **Interfaz gráfica amigable**: Uso de `JFrame`, `JLabel` y `JButton`.
- **Animación del giro**: Implementada con hilos para mayor realismo.
- **Símbolos y diseño personalizados**: Los rodillos son rojos y los símbolos son dorados.

## Tecnologías Utilizadas
- **Java SE** (versión 8 o superior)
- **Swing** (para la interfaz gráfica)
- **Multithreading** (uso de hilos para la animación)

## Instalación y Ejecución
### 1. Clonar el repositorio
```bash
git clone https://github.com/tu-usuario/tragamonedas-java.git
cd tragamonedas-java
```

### 2. Compilar el código
```bash
javac -d bin src/*.java
```

### 3. Ejecutar la aplicación
```bash
java -cp bin SlotMachineApp
```

## Estructura del Proyecto
```
tragamonedas-java/
│── src/
│   │── SlotMachine.java        # Modelo (lógica del juego)
│   │── SlotMachineView.java    # Vista (interfaz gráfica)
│   │── SlotMachineController.java # Controlador (maneja eventos)
│   │── SlotMachineApp.java     # Clase principal
│
│── bin/  # Archivos compilados
│── README.md  # Documentación del proyecto
│── .gitignore  # Archivos a ignorar en Git
```

## Uso
1. Ejecuta el programa.
2. Presiona el botón "Spin" para girar los rodillos.
3. Si los tres símbolos coinciden, ¡ganaste!
4. Si no, intenta nuevamente.

## Capturas de Pantalla
*Inserta aquí imágenes del juego en ejecución.*

## Contribución
Si deseas mejorar el proyecto:
1. Haz un fork del repositorio.
2. Crea una nueva rama (`git checkout -b mi-mejora`).
3. Realiza tus cambios y haz un commit (`git commit -m "Mejora en UI"`).
4. Sube los cambios (`git push origin mi-mejora`).
5. Abre un Pull Request.

## Autor
Carrillo Viveros Juan Carlos-217o002237
Luna Zamora Marlleli-217o00552

## Licencia
Este proyecto está bajo la licencia MIT.
