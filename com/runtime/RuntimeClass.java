package com.runtime;

import java.io.IOException;

public class RuntimeClass {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        Process process;


            try {
                //Sé comprueba sí tenemos windows por medio de las propiedades del sistema.
                if (System.getProperty("os.name").startsWith("Windows")) {
                    //Si asi lo es, se crea el comando notepad, que abre el block de notas
                    process = runtime.exec("notepad");
                } else {
                    process = runtime.exec("gedit");
                }
                //Con esto esperamos hasta que lo cerremos
                process.waitFor();

                /*Runtime se utiliza para obtener información sobre el entorno de ejecución y
                ejecutar comandos del sistema operativo, mientras que Process representa el proceso resultante de la ejecución
                de esos comandos, y waitFor() asegura que el programa espere hasta que el proceso haya terminado.*/

            }catch (Exception e) {
                System.err.println("El comando es desconocido "+ e.getMessage());
                System.exit(1);
            }

            System.out.println("Se ha cerrado el Editor");
            System.exit(0);
    }
}
