package com.system;

import java.util.Properties;

public class PropertiesSystem {
    public static void main(String[] args) {
        //Con esto pudes ver las propiedades de tu sistema, como su nombre lo indica, uno por uno
        String username = System.getProperty("user.name");
        System.out.println(username);

        String home = System.getProperty("user.home");
        System.out.println(home);

        String workspace = System.getProperty("user.dir");
        System.out.println(workspace);

        String javaVersion = System.getProperty("java.version");
        System.out.println(javaVersion);

        String lineSperator = System.getProperty("line.separator");
        System.out.println(lineSperator + "Hola");

        //Por medio de esta clase puedes ver la lista con todas las propiedades de tu sistema
        Properties properties = System.getProperties();
        properties.list(System.out);
    }
}