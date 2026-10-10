Ejercicio 1: Reasignación de un Objeto (El mito del paso por referencia)
Este ejercicio demuestra que aunque pases un objeto a un método, si intentas reasignar la variable completa a un nuevo objeto dentro del método, la variable original en el main no cambia.
Ejercicio 2: Inmutabilidad de los String
Las cadenas de texto (String) en Java son inmutables. Este programa muestra cómo intentar modificar un texto dentro de un método no afecta al original porque cualquier operación genera un nuevo objeto en la memoria.
Ejercicio 3: Clases Envolventes (Integer Wrapper)
A diferencia de los tipos primitivos puros, Integer es una clase objeto. Sin embargo, debido a que los objetos Integer son inmutables, intentar cambiar su valor mediante una operación matemática provoca una reasignación automática (autoboxing), fallando al intentar reflejar el cambio fuera del método.
Ejercicio 4: Modificar el saldo de una Cuenta Bancaria
Este programa define una clase CuentaBancaria y un método que incrementa el saldo del objeto recibido. Al regresar al main, el nuevo saldo se mantiene.
Ejercicio 5: Modificar las coordenadas de un Punto en 2D
Este ejercicio utiliza una clase Punto con coordenadas x e y. Un método se encarga de desplazar el punto sumándole valores, modificando permanentemente su posición.
Ejercicio 6: Actualizar el sueldo de un Empleado
Este programa maneja una clase Empleado que contiene su nombre y su sueldo. Un método incrementa el sueldo aplicando una bonificación directamente sobre los atributos del objeto.
Ejercicio 7: Incrementar cada elemento sumando un valor fijo
Este programa recibe un array de números enteros y le suma una cantidad fija a cada uno de sus elementos.
Ejercicio 8: Elevar al cuadrado los elementos de un array
Este ejercicio toma un array de números y reemplaza cada elemento por su valor elevado al cuadrado
Ejercicio 9: Reemplazar números negativos por ceros (0)
Este programa recorre un array de enteros que contiene números positivos y negativos, y limpia el array sustituyendo cualquier valor menor que cero por un 0.
Ejercicio 10: Duplicar un valor numérico mediante retorno
Este programa define un método que duplica el valor recibido por parámetro, mostrando la importancia de reasignar el resultado en el main.
