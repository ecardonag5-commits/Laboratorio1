# Laboratorio1_programacion1

# 📘 Ejercicio en Clase 3 – Modularización en Java
## Curso: Programación 1

---

## 🎯 Objetivo

Aplicar los conceptos de:

- Modularización mediante métodos.
- Uso correcto de variables locales y globales.
- Validación de entradas del usuario.
- Manejo básico de excepciones.
- Mejora de la organización y legibilidad del código.

---

## 📌 Instrucciones Generales

- Trabajar en parejas (**Obligatorio**).
- No utilizar IA para el análisis.
- Se proporcionará un programa base en Java.
- Analizarlo, mejorarlo y documentar el proceso en este archivo `README.md`.

---

# 🧠 Parte 1 – Análisis del Programa Original

En esta sección deben analizar el programa entregado.

## 1️⃣ Identificación de Tareas Repetitivas

Responder:

- ¿Qué partes del código pueden convertirse en métodos?
- Las funciones tales como, agregar estudiantes, ver lista, etc.
  
- ¿Qué bloques de código se repiten?
- if calificaciones.Esmpty y for int i = 0; i < estudiantes.size(); i++.
  
- ¿Qué responsabilidades pueden separarse?
- todo lo que esta en el main, las funciones del menu.

Ejemplos de posibles tareas:

- Agregar estudiante.
- Mostrar estudiantes.
- Calcular promedio.
- Mostrar estudiante con mayor calificación.

Explicar por qué dividir estas tareas mejora el programa.
Es más facil de comprender, se trabaja de una forma mas ordenada,
puedo reutilizar metodos.

---

## 2️⃣ Variables Locales vs Globales

Responder:

- ¿Qué variables deberían declararse como globales (atributos `static` de la clase)?
- static list<String> estudiantes, static list<Double> calificaciones.
  
- ¿Cuáles deberían ser locales dentro de un método?
- double suma, pormedio, maxCalificacion;
- String estudianteMax;
- int opcion;

- ¿Por qué?
- Seria un caos declararlas globales, porque solo se pueden usar dentro de metodos.

Reflexionar sobre:

- Alcance (scope)
- Son muy utiles ya que tenemos variables locales y globales.
  
- Tiempo de vida de la variable
- La variable local muere hasta que acaba el metodo.
- La variable global muere hasta que acaba de ejecutarse el programa.
  
- Riesgos de modificar datos globales accidentalmente
- Cualquier metodo puede manipularlas y provocar errores dificiles de detectar.

---

# 🏗️ Parte 2 – Modularización del Programa

Reestructurar el programa aplicando modularización:

- Crear métodos claros y específicos.
- Cada método debe tener una sola responsabilidad.
- Todos los métodos deben ser llamados desde `main`.
- Mantener el programa completamente funcional.

No es obligatorio usar nombres específicos, pero deben ser descriptivos.

Ejemplo de buenas prácticas:

- Un método = una responsabilidad.
- No mezclar múltiples tareas en un mismo método.
- Mantener el código ordenado e indentado.

---

# 🔐 Parte 3 – Validaciones y Manejo de Excepciones

Implementar mejoras en el programa:

- Validar entradas numéricas.
- Evitar que el programa falle si el usuario ingresa texto en lugar de números.
- Verificar que las calificaciones estén en un rango válido.
- Usar `try-catch` cuando sea necesario.

Explicar en esta sección:

- Qué errores podrían ocurrir.
- EL usuario puede escribir letras en vez de numeros, dejar espacios vacios.
   
- Qué validaciones implementaron.
- numeros enteros, rango, validacion de lista.
   
- Por qué son importantes.
- El sistema se ve mas profesional, se proteje la integridad de los datos, evitamos que el programa se cierre de golpe ante un
- error.

---

# 🧩 Parte 4 – Preguntas de Reflexión

Responder con sus propias palabras.

## 1️⃣ ¿Qué ventajas tiene dividir el código en métodos?

Reflexionar sobre:

- numeros enteros, decimales, 
- Organización:
- Nos permite ubicar mas rapido los posibles error o si deseamos modificar algo lo podemos hubicar mas rapido.
  
- Reutilización:
- Evitamos crear de nuevo las mismas funciones, ahorramos codigo y espacion en memoria.
  
- Mantenimiento:
- Podemos mejorar o adampar nuevo codigo y poder ampliar la vida del programa.
  
- Claridad:
- Utilizar variables o metodos con nombres faciles de entender, el objetivo es que cualquier persona pueda
- entender el codigo.

---

## 2️⃣ ¿Por qué no es recomendable usar muchas variables globales?

Reflexionar sobre:

- Posibilidad de errores inesperados
- Las variables locales podrian manipularlas
  
- Dificultad para depurar
- Tendria que revisar todos los metodos que usen esas variables.

- Dependencia entre métodos
- Si cambio la varibale puedo romper el metodo.

---

## 3️⃣ ¿Cómo mejora la modularización la legibilidad del código?

-Al trabajar los metodos fuera del main se nos es mas facil el modificarlos y localizarlos desde el main,
lo caul ayuda a entender el código de una manera mas facil.

---

# 📦 Entregables

## 1️⃣ Código Java

- Archivo `Main.java`.
- Modularizado correctamente.
- Funcional.
- Con validaciones básicas.
- Ordenado y bien indentado.

---

## 2️⃣ Este archivo `README.md`

Debe contener:

- Análisis del programa original.
- Decisiones de modularización.
- Justificación de variables locales y globales.
- Respuestas a las preguntas guía.
- Explicación de validaciones implementadas.

---

# 📊 Criterios de Evaluación

| Criterio | Puntos |
|----------|--------|
| Programa funciona correctamente | 30 |
| Modularización adecuada | 25 |
| Uso correcto de variables locales y globales | 15 |
| Validaciones implementadas | 15 |
| Calidad del README | 15 |
| **Total** | **100 puntos**
