## Loggers

### Introducción

El logging como herramienta es esencial para el monitoreo, la depuración y el mantenimiento de aplicaciones. Pueden
tener múltiples formas y funcionalidades, y en este ejercicio, exploramos diferentes variantes. Diseñaremos, empleando
UML y los principios de la programación Orientada a Objetos, una estructura de clases que nos permita implementar
diferentes loggers.

### Objetivos

Dado su diseño de UML, los principios de la POO y las buenas prácticas de programación, deberan implementar al menos 3
loggers diferentes de los presentes en la consigna. Por lo menos deben implementarse loggers que permitan la
funcionalidad del "Severity filter Logger", "Context Logger" con fecha, y "Multi Logger".

### A tener en cuenta

1. Incluir en el repositorio los diagramas UML que diseñaron (Clases y secuencia).
   Pueden hacerlo en formato plantuml o en formato imagen.

2. Aparte de la implementacion de los loggers deben incluir una serie de tests para probarlos. A mode de ejemplo, y como
   requerimiento minimo, se agregar 3 clases de `Tests` que incluyen unos seudo tests. Aparte deberan tener al menos un
   85% de cobertura de tests.
3. Este proyecto incluye una serie de herramientas para garantizar la calidad del codigo, aparte de la cobertura de
   tests. Las mismas ejecutan sus respectivas tareas como parte de la tarea `build` de `Gradle`. Intellij Idea cuenta
   con plugins para las mimas que pueden facilitar su uso.
    1. La herramienta `checkstyle` ejecuta validaciones sobre el codigo para encontrar potenciales errores o imponer
       stadares, este caso [Google Java Style](https://checkstyle.org/google_style.html).
    2. La herramienta `spotless` permite dar determinado formato al codigo, en este caso
       nuevamente [Google Java Style](https://google.github.io/styleguide/javaguide.html), y validar que ser respeta
       dicho formato. Para ejecutar la tarea de dar formato se puede usar el plugin del Idea o el comando
       de `Gradle` `./gradlew spotlessApply`
    