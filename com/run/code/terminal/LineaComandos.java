package com.run.code.terminal;

public class LineaComandos {
    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("Ingresa un nombre");
            System.exit(-1);
        }
        for (int i = 0;  i< args.length; i++){
            System.out.println("Argumentos "+i+" : "+args[i]);
        }
    }
}   