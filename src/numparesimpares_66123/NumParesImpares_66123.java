/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numparesimpares_66123;

/**
 *
 * @author Atomi
 */
public class NumParesImpares_66123 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        int cont=1;
        int pares_suma = 0;
        int impares_suma = 0;
        while (cont<=100){
            if(cont % 2 == 0){
                pares_suma = cont + pares_suma;   
            }
            else{
                impares_suma = cont + impares_suma;
            }
            cont++;
        }
        System.out.println(pares_suma);
          System.out.println(impares_suma);
    }
}
       