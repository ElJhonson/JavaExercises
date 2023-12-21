package com.system;

import java.io.FileInputStream;
import java.util.Properties;

public class SetPropertiesSystem {
    public static void main(String[] args) {

        //Todas estas clases nos solicitan estar dentro de un try catch
        try {
            //Con esta clase guardamos nuestro archivo de configuraciones y lo tenemos que agregar a un objeto properties
            FileInputStream archivo = new FileInputStream("C:\\Users\\angel\\OneDrive\\Escritorio\\devDreams\\Ejercicios\\src\\com\\ejercicios\\system\\Config.properties");
            //Cargamos las configuraciones del sistem
            Properties properties = new Properties(System.getProperties());
            //Cargamos las configuraciones que ya tenemos en nuestro archivo
            properties.load(archivo);
            //Con esto ya cargamos nuestras propiedades personalizadas
            System.setProperties(properties);
            //Con esto las podemos ver


            //Ver propiedades por separado
            System.out.println(System.getProperty("config.autor.email"));

            System.getProperties().list(System.out);
        } catch (Exception e) {
            //Nos sirve para imprimir errores
            System.err.println("No existe el archivo = " + e);
            System.exit(1);

        }

        System.out.println("hola");

    }
}
