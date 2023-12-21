package com.system;

import java.util.Map;

public class VarEnviroment {
    public static void main(String[] args) {

        //Creamos un Map para ver nuestras variables de entorno utilizando el metodo getenv()
        Map<String, String> varEnv = System.getenv();
        System.out.println("Variables de ambiente del sistema = " + varEnv);

        for (String key:
             varEnv.keySet()) {
            System.out.println(key + " => " + varEnv.get(key));
        }

        //También las podemos ver una por una, de esta manera
        String userName = System.getenv("USERNAME");
        System.out.println("userName = " + userName);

        String hello = System.getenv("HELLO");
        System.out.println("hello = " + hello);

        //setx para crear tus propias variables de entorno desde la terminal



    }
}
