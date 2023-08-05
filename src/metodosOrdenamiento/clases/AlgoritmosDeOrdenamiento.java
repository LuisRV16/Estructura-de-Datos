package metodosOrdenamiento.clases;

public class AlgoritmosDeOrdenamiento {

    private int aux;

    public AlgoritmosDeOrdenamiento() {
        aux = 0;
    }

    // Versión 1
    public int[] bubbleV1(int[] numeros) {

        for (int i = 0; i < numeros.length; i++) {

            for (int j = i + 1; j < numeros.length; j++) {

                if (numeros[i] > numeros[j]) {

                    aux = numeros[i];

                    numeros[i] = numeros[j];

                    numeros[j] = aux;

                }

            }

        }

        return numeros;

    }

    // Versión 2
    public int[] bubbleV2(int[] numeros) {

        for (int i = 1; i < numeros.length; i++) {

            for (int j = 0; j < numeros.length - 1; j++) {

                if (numeros[j] > numeros[j + 1]) {

                    aux = numeros[j];

                    numeros[j] = numeros[j + 1];

                    numeros[j + 1] = aux;

                }

            }

        }

        return numeros;

    }

    // Método Radix
    public int[] radix(int[] numeros) {

        int x, i, j;

        for (x = Integer.SIZE - 1; x >= 0; x--) {

            int aux[] = new int[numeros.length];

            j = 0;

            for (i = 0; i < numeros.length; i++) {

                boolean band = numeros[i] << x >= 0;

                if (x == 0 ? !band : band) {

                    aux[j] = numeros[i];

                    j++;

                } else {
                    numeros[i - j] = numeros[i];
                }

            }

            for (i = j; i < aux.length; i++) {
                aux[i] = numeros[i - j];
            }

            numeros = aux;

        }

        return numeros;

    }

    // Método Quick Sort
    public int[] quick(int[] numeros, int primero, int ultimo) {

        int i, j, pivote;

        i = primero;
        j = ultimo;
        pivote = numeros[(primero + ultimo) / 2];

        do {

            while (numeros[i] < pivote) {
                i++;
            }

            while (numeros[j] > pivote) {
                j--;
            }

            // Se realiza el intercambio
            if (i <= j) {

                intercambio(numeros, i, j);

                i++;

            }

        } while (i <= j);

        if (primero < j) {
            quick(numeros, primero, j);
        }

        if (i < ultimo) {
            quick(numeros, i, ultimo);
        }

        return numeros;

    }

    // En este método se realiza el intercambio necesario en el método Quick Sort y Shell Sort
    private void intercambio(int[] numeros, int i, int j) {

        aux = numeros[i];

        numeros[i] = numeros[j];

        numeros[j] = aux;

    }

    // Método de Inserción
    public int[] insercion(int[] numeros, int n) {

        int i, j;

        for (i = 1; i < n; i++) {

            aux = numeros[i];

            j = i - 1;

            while (j >= 0 && numeros[j] > aux) {

                numeros[j + 1] = numeros[j];

                j--;

            }

            numeros[j + 1] = aux;

        }

        return numeros;

    }

    public int[] shell(int[] numeros) {

        int salto, i, j, k;

        salto = numeros.length / 2;

        while (salto > 0) {

            for (i = salto; i < numeros.length; i++) {

                j = i - salto;

                while (j >= 0) {

                    k = j + salto;

                    if (numeros[j] <= numeros[k]) {
                        break;
                    } else {

                        intercambio(numeros, j, k);

                        j -= salto;

                    }

                }

            }

            salto /= 2;

        }

        return numeros;

    }

    public int[] intercalacion(int[] numeros1, int[] numeros2) {

        int[] numerosOrdenados = new int[numeros1.length + numeros2.length];
        int i, j, k;

        // Repetir mientras los arreglos 1 y 2 tengan elementos que comparar
        for (i = j = k = 0; i < numeros1.length && j < numeros2.length; k++) {

            if (numeros1[i] < numeros2[j]) {

                numerosOrdenados[k] = numeros1[i];

                i++;

            } else {

                numerosOrdenados[k] = numeros2[j];

                j++;

            }

        }

        // Para añadir al arreglo numerosOrdenados los elementos del arreglo 1 sobrantes en caso de haberlos
        for (; i < numeros1.length; i++, k++) {
            numerosOrdenados[k] = numeros1[i];
        }

        // Para añadir al arreglo numerosOrdenados los elementos del arreglo 2 sobrantes en caso de haberlos
        for (; j < numeros2.length; j++, k++) {
            numerosOrdenados[k] = numeros1[j];
        }

        return numerosOrdenados;

    }

    public int[] mezclaDirecta(int[] numeros) {

        int i, j, k;

        if (numeros.length > 1) {

            int nElementosIzq = numeros.length / 2;

            int nElementosDer = numeros.length - nElementosIzq;

            int numIzq[] = new int[nElementosIzq];

            int numDer[] = new int[nElementosDer];

            // Copiando los elementos de la primera mitad al arreglo Izquierdo
            for (i = 0; i < nElementosIzq; i++) {
                numIzq[i] = numeros[i];
            }

            // Copiando los elementos de la segunda mitad al arreglo Izquierdo
            for (i = nElementosIzq; i < nElementosIzq + nElementosDer; i++) {
                numDer[i - nElementosIzq] = numeros[i];
            }

            // Recursividad
            numIzq = mezclaDirecta(numIzq);

            numDer = mezclaDirecta(numDer);

            i = j = k = 0;
            
            while (numIzq.length != j && numDer.length != k) {                
                
                if (numIzq[j] < numDer[k]) {
                    
                    numeros[i] = numIzq[j];
                    
                    i++;
                    
                    j++;
                    
                } else {
                    
                    numeros[i] = numDer[k];
                    
                    i++;
                    
                    k++;
                    
                }
                
            }
            // Arreglo Final
            while (numIzq.length != j) {
                
                numeros[i] = numIzq[j];
                
                i++;
                
                j++;
                
            }
            
            while (numDer.length != k) {
                
                numeros[i] = numDer[k];
                
                i++;
                
                k++;
                
            }
            
        } // Fin del condicional

        return numeros;

    }
    
    public int[] mezclaNatural(int[] numeros) {
        
        int izquierda = 0;
        int izq = 0;
        int derecha = numeros.length - 1;
        int der = derecha;
        boolean ordenado = false;
        
        do {
            
            ordenado = true;
            
            izquierda = 0;
            
            while (izquierda < derecha) {                
                
                izq = izquierda;
                
                while (izq < derecha && numeros[izq] <= numeros[izq + 1]) {                    
                    izq++;
                }
                
                der = izq + 1;
                
                while (der == derecha - 1 || der < derecha && numeros[der] <= numeros[der + 1]) {                    
                    der++;
                }
                
                if (der <= derecha) {
                    
                    mezclaDirecta(numeros);
                    
                    ordenado = false;
                    
                }
                
                izquierda = izq;
                
            }
            
        } while (!ordenado);
        
        return numeros;
        
    }

}
