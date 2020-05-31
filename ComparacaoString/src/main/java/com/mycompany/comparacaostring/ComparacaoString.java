package com.mycompany.comparacaostring;

public class ComparacaoString {

    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        String res;
        res = nome1.equals(nome3) ? "IGUAL" : "DIFERENTE";
        System.out.println(res);
    }
}
