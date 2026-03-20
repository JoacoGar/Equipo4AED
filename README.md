# Equipo4AED
Integrantes:
- Mateo Cimassi
- Joaquin Garcia
- Naireth Barrios
- Guadalupe Piva

Objetivo: Unidad Tematica 0 - Transición a JAVA

### Ejercicio 1:

### Resumen JDK 
Es el conjunto de programas y librerías que permiten desarrollar, compilar, ejecutar y debuggear programas en Java.

### Resumen JVM
Es la "máquina hipotética o virtual" donde se ejecuta el código compilado para convertirlo a código particular del chip o CPU utilizado.

### Resumen JRE 
El Java Runtime Environment es el conjunto de componentes que se precisan para correr aplicaciones Java, incluye a la JVM y las bibliotecas estándar.

### Tipos primitivos y de referencia utilizados

| Tipo de dato | primitivo | de referencia |
|--------------|----------|---------------|
| int          | x        |               |
| boolean      | x        |               |
| double       | x        |               |
| char         | x        |               |
| String       |          | x             |

### Ejercicio 9:

### Glosario

**Clase:** molde para crear objetos que define atributos y métodos.

**Objeto:** instancia de una clase con estado y comportamiento propio.

**Atributo:** dato interno de una clase que representa su estado.

**Método:** acción o comportamiento que puede realizar una clase.

**Instancia:** objeto concreto creado a partir de una clase.

**Herencia:** mecanismo por el cual una clase puede reutilizar atributos y métodos de otra.

**Polimorfismo:** capacidad de una referencia de tomar distintas formas y comportarse diferente según el objeto.

**Encapsulamiento:** técnica para proteger los datos internos de una clase mediante modificadores de acceso.

**Abstracción:** proceso de mostrar solo lo esencial y ocultar la complejidad interna.

### Explicación de las clases

En este ejercicio se definió una interfaz llamada **ProcesadorTexto**, que establece el método para contar palabras.

Luego se implementa la clase **ContadorPalabras**, que contiene la lógica principal para realizar el conteo.

Se crea también la clase **ContadorPalabrasUnicas**, que hereda de ContadorPalabras y modifica el comportamiento para contar solo palabras sin repetir.

Por último, la clase **ResultadoAnalisis** se utiliza para representar el resultado del conteo de palabras de forma más organizada.

### Ejemplo (Diferencia entre sobrecarga y sobreescritura)

**Sobrecarga:**
Se da cuando un método tiene el mismo nombre pero distintos parámetros.
**Ejemplo:** contarPalabras(String texto) y contarPalabras(String texto1, String texto2)

**Sobrescritura:**
Se da cuando una clase hija redefine un método heredado.
**Ejemplo:** ContadorPalabrasUnicas sobrescribe contarPalabras de ContadorPalabras.