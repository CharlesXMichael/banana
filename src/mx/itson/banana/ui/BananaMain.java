/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.banana.ui;

import java.util.Scanner;

/**
 *
 * @author alumnog
 */
public class BananaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Escriba los nombres de los alumnos");

Scanner entrada = new Scanner(System.in);
String oracion = entrada.nextLine();

String[] alumnos = oracion.split(",");

for(String a : alumnos){
//System.out.println(a);
String[] alumno = a.split(" ");
String id = alumno [0];
String primerNombre = alumno [3];
String primerApellido = alumno [1];


System.out.println("ID: " +id + " - " + primerNombre + " " + primerApellido);

}
    }
    }

