
package grafos.clases;

public class Grafo {
    
    // Caminos minimos //
    
    // Método para determinar todos los caminos
    public String algFloyd(long[][] mAdy) {
        
        int vertices = mAdy.length;
        
        long[][] matrizAdyacencia = mAdy;
        
        String[][] caminos = new String [vertices][vertices];
        String[][] caminosAux = new String [vertices][vertices];
        
        String caminoRecorrido = "";
        String cadena = "";
        String caminitos = "";
        
        
        
        float temp1;
        float temp2;
        float temp3;
        float temp4;
        float minimo;
        
        // Inicializando las matrices caminos y caminosAux
        
        for (int i = 0; i < vertices; i++) {
            
            for (int j = 0; j < vertices; j++) {
                
                caminos[i][j] = "";
                
                caminosAux[i][j] = "";
                
            }
            
        }
        
        for (int i = 0; i < vertices; i++) {//k
            
            for (int j = 0; j < vertices; j++) {//i
                
                for (int k = 0; k < vertices; k++) {//j
                    
                    temp1 = matrizAdyacencia[j][k];
                    
                    temp2 = matrizAdyacencia[j][i];
                    
                    temp3 = matrizAdyacencia[i][k];
                    
                    temp4 = temp2 + temp3;
                    
                    // Encontrando el camino minimo
                    
                    minimo = Math.min(temp1, temp4);
                    
                    if (temp1 != temp4) {
                        
                        if (minimo == temp4) {
                            
                            caminoRecorrido = "";
                            
                            caminosAux[j][k] = i + "";
                            
                            caminos[j][k] = caminosR(j, i, caminosAux, caminoRecorrido) + (i+1);
                            
                        }
                        
                    }
                    
                    matrizAdyacencia[j][k] = (long) minimo;
                    
                }
                
            }
            
        }
        
        // Agregando el camino a cadena
        
        for (int i = 0; i < vertices; i++) {
            
            for (int j = 0; j < vertices; j++) {
                
                cadena += "[" + matrizAdyacencia[i][j] + "]";
                
            }
            
            cadena += "\n";
            
        }
        
        //-----------------//
        
        for (int i = 0; i < vertices; i++) {
            
            for (int j = 0; j < vertices; j++) {
                
                if (matrizAdyacencia[i][j] != Long.MAX_VALUE) {
                    
                    if (i != j) {
                        
                        if (caminos[i][j].equals(""))
                            caminitos += "De (" + (i+1) + " ---> " + (j+1) + ") "
                                    + "Irse por...(" + (i+1) + ", " + (j+1) + ")\n";
                        else
                            caminitos += "De (" + (i+1) + " ---> " + (j+1) + ") "
                                    + "Irse por...(" + (i+1) + ", " + caminos[i][j] + ", " + (j+1) + ")\n";
                        
                    }
                    
                }
                
            }
            
        }
        
        return """
               La Matriz de Caminos m\u00e1s cortos entre los diferentes v\u00e9rtices es:
                """ + cadena + "\nLos diferentes caminos más cortos entre"
                + " vértices son:\n" + caminitos;
        
    }
    
    public String caminosR(int j, int i, String[][] caminosAux, String caminoRecorrido) {
        
        if (caminosAux[j][i].equals("")) {
            return "";
        } else {
            
            caminoRecorrido += caminosR(j, Integer.parseInt(caminosAux[j][i]),
                    caminosAux, caminoRecorrido) + (Integer.parseInt(caminosAux[j][i]) + 1) + ", ";
            
            return caminoRecorrido;
            
        }
        
    }
    
}
