# furnace-DIP-kata

Ejercicio SOLID del capítulo 11 "The Dependency-Inversion Principle (DIP)" del libro "Agile Principles, Patterns, and Practices in C#" de Martin C. Robert, Martin Micah.

## ¿De qué trata este proyecto?

Este proyecto es una implementación práctica del Principio de Inversión de Dependencias (DIP) dentro del contexto de un sistema de control de un horno. El objetivo es demostrar cómo aplicar este principio para desacoplar las dependencias de alto nivel de las de bajo nivel, permitiendo un diseño más flexible y mantenible.

El sistema simula un horno que mantiene una temperatura específica. Utiliza una interfaz para abstraer el comportamiento del sensor de temperatura y el controlador del horno, lo que permite cambiar las implementaciones concretas sin afectar el código de alto nivel.

## ¿Cómo ejecutar el proyecto?

El proyecto incluye un archivo `.jar` que puedes ejecutar para probar la funcionalidad del sistema. Sigue estos pasos:

1. Asegúrate de tener instalado Java en tu sistema. Puedes verificarlo ejecutando:

   ```bash
   java -version
   ```

2. Navega al directorio donde se encuentra el archivo `.jar` del proyecto.

3. Ejecuta el archivo `.jar` con el siguiente comando:
   ```bash
    java -jar furnace-1.0.0.jar
   ```

## ¿Qué es el "default" de la interfaz?

En este proyecto, las interfaces definen los contratos que las implementaciones deben cumplir. El "default" de una interfaz se refiere a una implementación por defecto que puede ser utilizada si no se proporciona una implementación específica. Esto es útil para proporcionar un comportamiento básico o de prueba sin necesidad de definir una clase concreta.

Por ejemplo, si la interfaz del sensor de temperatura tiene un método `getTemperature()`, el "default" podría devolver una temperatura fija o simulada para pruebas, mientras que una implementación concreta podría leer la temperatura de un sensor físico.

Este enfoque permite probar y desarrollar el sistema sin depender de hardware específico o implementaciones complejas desde el inicio
