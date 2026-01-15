/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete02.DatoPersonal;
import paquete03.DatosUbicacion;
import paquete04.DatoAcademico;
import paquete05.DatoFinal;
import paquete02.DatoPersonal;
import paquete02.DatoTrabajo;
import paquete06.Reporte;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        String nombre;
        String ciudad;
        String apellidoRetornado;
        String empresa;
        String direccionEmpresa;
        
        double[] misNotas;
        double promedio;
        
        nombre = DatoPersonal.obtenerNombre();
        apellidoRetornado = DatoPersonal.obtenerApellido();
        ciudad = DatosUbicacion.obtenerCiudad();
        misNotas = DatoAcademico.obtenerNotas(4);
        promedio = DatoFinal.obtenerPromedio(misNotas);
        empresa = DatoTrabajo.nombreNombreEmpresa();
        direccionEmpresa = DatoTrabajo.nombreDireccionEmpresa();
        Reporte.obtenerReporte(nombre,apellidoRetornado,ciudad,misNotas,promedio,empresa,direccionEmpresa);
        
 
    }
    
}
/*
El programa genera una solucion para obtener el promedio de notas con 5 funciones 
las cuales se deben importar de diferentes paquetes
en las cuales se piden ingresar datos del usuario por teclado para obtener 
sus datos personales y sus notas ademas se presentan los datos personales del usuario
junto con el promedio.

El formato de la presentacion debe ser separando los datos unos de otros con su 
respecta descripcion de dato
*/
