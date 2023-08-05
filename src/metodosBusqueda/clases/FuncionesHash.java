package metodosBusqueda.clases;

import java.util.Arrays;

public class FuncionesHash {

    private String[] arreglo;
    private int tamanio;
    private int cont;

    public FuncionesHash(int tamanio) {

        this.tamanio = tamanio;

        arreglo = new String[tamanio];

        Arrays.fill(arreglo, "-1");

    }

    public void funcionHash(String[] cadenaArreglo, String[] arreglo) {

        int i;

        for (i = 0; i < cadenaArreglo.length; i++) {

            String elemento = cadenaArreglo[i];

            int indiceArreglo = Integer.parseInt(elemento) % (cadenaArreglo.length - 1);

            System.out.println("El índice es " + indiceArreglo
                    + " para el elemento o valor " + elemento);

            // Tratando las colisiones
            while (!"-1".equals(arreglo[indiceArreglo])) {

                indiceArreglo++;

                System.out.println("Ocurrió una colisión en el índice " + (indiceArreglo - 1) + " Cambiar al índice " + indiceArreglo);

                indiceArreglo %= tamanio;

            }

            arreglo[indiceArreglo] = elemento;

        }

    }

    // Método para mostrar la tabla
    public void mostrar() {

        int incremento = 0;
        int i;
        int j;

        for (i = 0; i < 1; i++) {

            incremento += 8;

            for (j = 0; j < 71; j++) {
                System.out.print("-");
            }

            System.out.println();

            for (j = incremento - 8; j < incremento; j++) {
                System.out.format("| %3s " + " ", j);
            }

            System.out.println("|");

            for (int n = 0; n < 71; n++) {
                System.out.print("-");
            }

            System.out.println();

            for (j = incremento - 8; j < incremento; j++) {

                if (arreglo[j].equals("-1")) {
                    System.out.print("|    ");
                } else {
                    System.out.print(String.format("| %3s " + " ", arreglo[j]));
                }

            }

            System.out.println("|");

            for (int n = 0; n < 71; n++) {
                System.out.print("-");
            }

            System.out.println();

        }

    }

    public String buscarClave(String elemento) {

        int indiceArreglo = Integer.parseInt(elemento) % 7;

        while (!arreglo[indiceArreglo].equals("-1")) {

            if (arreglo[indiceArreglo].equals(elemento)) {

                System.out.println("El elemento " + elemento + " fue encontrado en el índice " + indiceArreglo);

                return arreglo[indiceArreglo];

            }

            indiceArreglo++;

            indiceArreglo %= tamanio;

            cont++;

            if (cont > 7) {
                break;
            }

        }
        
        return null;

    }

    public String[] getArreglo() {
        return arreglo;
    }

}
