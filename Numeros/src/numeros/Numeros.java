package numeros;

import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) {
        int n = 0;
        int s = 0;
        Scanner teclado = new Scanner(System.in);
        String resp;
        do {
            System.out.print("Digite um número: ");
            n = teclado.nextInt();
            s += n;
            System.out.print("Quer continuar? [S/N] ");
            resp = teclado.next();
        } while(resp.equals("s"));
        System.out.println("A soma de todos os valores é " + s);
        
        teclado.close();
    }  
}
