/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author nsfge
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2) / 2;
        System.out.println("A média é igual a " + m);
        */
        
        /*
        int numero =10;
        int valor = 4 + numero--;
        System.out.println(valor);
        System.out.println(numero);
        */
        
        /*
        float v = 8.4f;
        int ar = (int)Math.round(v);
        System.out.println(ar);
        */
        
        double aleatorio = Math.random();
        int num = (int) (0 + aleatorio * (100 - 0));
        System.out.println(aleatorio);
        System.out.println(num);
    }   
    
}
