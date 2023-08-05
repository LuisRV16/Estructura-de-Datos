# Recursividad

## ¿Qué es la recursividad?

Recurrencia = Recursión

Método que se llama a si mismo. |
Procedimiento para resolver un problema complejo reduciendolo en uno o más subproblemas.

### Características de la Recursividad

- Misma estructura que el Problema Original.
- Más simple de resolver que el problema original.
- Cada subproblema se divide, usando el mismo procedimiento, en subproblemas aún más simples.
- Los subproblemas llegarán a ser tan simples que no hará falta dividirlos para resolverlos.

---

### Ejemplo Recursivo:

#### Recorrer un trayecto de un Origen a un Destino.

- Dar un paso desde el origen hacia el destino.
- Dar (n-1) pasos hacia el destino desde el nuevo origen.

#### Subir una Escalera.

- Subir un escalón.
- Subir los (n-1) escalones restantes.

---

### Estructura general de un Algoritmo Recursivo.

#### Problema:

- Caso Base: Respuesta Explicita.
- Dominio: (Problema - 1).

### Factorial de un número con Recursividad.

n! = 1 * 2 * 3 * 4 * ... * (n-1) * n

4! = 1 * 2 * 3 * 4

4! = 24

### Código Java.

    public int factorial(int n){
        if(n == 0){
            return 1;  //Caso Base.
        } else {
            return n * factorial(n-1); //Dominio.
        }
    }
