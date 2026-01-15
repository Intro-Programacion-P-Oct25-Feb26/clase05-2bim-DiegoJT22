/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

/**
 *
 * @author daigo
 */
public class Reporte {
    public static void obtenerReporte(String nom, String ape, String ciu, 
            double[] not, double prom, String nomem, String nomdiem) {

        String notas = "";

        for (int i = 0; i < not.length; i++) {
            notas = String.format("%s %s \n", notas, not[i]);
        }

        System.out.printf("Los datos ingresados son:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Ciudad: %s\n"
                + "Nota: \n%s"
                + "Promedio: %.2f\n"
                + "Nombre Empresa: %s\n"
                + "Direccion Empresa: %s\n",
                nom,
                ape,
                ciu, notas,
                prom,
                nomem,
                nomdiem);

    }
}
