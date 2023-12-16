package com.ejercicios;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Menu {
    public static void main(String[] args) {
        int opcionIndice = 0;

        Map<String, Integer> opciones = new HashMap<>();
        opciones.put("Actualizar", 1);
        opciones.put("Eliminar", 2);
        opciones.put("Agregar", 3);
        opciones.put("Listar", 4);
        opciones.put("Salir", 5);

        Object[] opArreglo = opciones.keySet().toArray();


        do {
            Object opcion = JOptionPane.showInputDialog(null,
                    "Seleccione un Opción",
                    "Mantenedor de Productos",
                    JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
            } else {
                opcionIndice = opciones.get(opcion.toString());

                if (opcion.equals("Actualizar")) {
                    JOptionPane.showMessageDialog(null,"Actualizado correctamente");
                }else if (opcion.equals("Eliminar")){
                    JOptionPane.showMessageDialog(null,"Eliminado Exitosamente");
                } else if (opcion.equals("Agregar")) {
                    JOptionPane.showMessageDialog(null,"Agregado Exitosamente");
                } else if (opcion.equals("Listar")) {
                    JOptionPane.showMessageDialog(null,"Listado correctamente");
                } else if (opcion.equals("Salir")) {
                    JOptionPane.showMessageDialog(null,"Saliendo...");
                    System.exit(0);
                }
            }
        }while (true);
    }
}
