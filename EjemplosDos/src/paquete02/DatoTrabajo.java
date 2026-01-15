/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class DatoTrabajo {

    // método que permita preguntar al usuario el nombre de la empresa
    public static String nombreNombreEmpresa() {
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Ingrese el nombre de la empresa\n");
        String nombre = entrada.nextLine();

        return nombre;
    }

    // método que permita preguntar al usuario la dirección de la empresa
    public static String nombreDireccionEmpresa() {
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Ingrese la direccion de la empresa\n");
        String direccion = entrada.nextLine();

        return direccion;
    }
}
