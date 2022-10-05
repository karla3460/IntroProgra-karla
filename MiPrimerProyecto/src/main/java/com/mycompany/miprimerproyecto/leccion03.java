/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miprimerproyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author KARLA
 */
public class leccion03 {

    public static void clase03() {

        //ciclo for con incremento
        /*for (int i = 1; i <= 5; i++) {
            System.out.println("El valor de i es: " + i);
        }

        //ciclo for con decremento
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.err.println("Feliz año!!!");
        System.err.println("");
        System.err.println("");

        //ciclo while
        int i = 1;
        int suma = 0;
        while (i <= 10) {
            //suma+=i;
            suma = suma + i;
            System.out.println(i);
            ++i;
        }
        System.out.println("La sumatoria es: " + suma);
        System.err.println("");
        System.err.println("");

        //Ejercicio
        for (int j = 0; j < 5; j++) {
            System.out.println("@@@@@@@@@@");
        }
        System.out.println("");

        //ciclo do while
        int j = 0;

        do {
            System.out.println("El valor de j es: " + j);
            ++j;
        } while (j < 5);

        //Ejercicio
        int numero;
        String numeroLectura = JOptionPane.showInputDialog("Ingrese el numero a multiplicar: ");
        numero = Integer.parseInt(numeroLectura);
        for (int a = 1; a <= 10; a++) {
            int resultado = numero * a;
            System.out.println("El resultado es: " + resultado);
        }

        //Ejercicio 3
        for (int k = 0; k < 5; k++) {
            for (int l = 0; l <= k; l++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        //Ejercicio 5
        int cantidadEstudiantes;
        String cantidadEstudiantesLec = JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes: ");
        cantidadEstudiantes = Integer.parseInt(cantidadEstudiantesLec);
        int mayor = 0;
        int menor = 0;
        int promedio = 0;
        int cantidadAprobados = 0;

        for (int k = 1; k <= cantidadEstudiantes; k++) {
            String notaLectura = JOptionPane.showInputDialog("Ingrese la nota: ");
            int nota = Integer.parseInt(notaLectura);
            
            promedio = promedio + nota;
            
            if (k == 1) {
                menor = nota;
            } else if (nota < menor) {
                menor = nota;
            }

            if (nota > mayor) {
                mayor = nota;
            }
            
            if (nota>70){
                cantidadAprobados = cantidadAprobados+1;
            }
            
            
        }

        System.out.println("La nota Mayor es: " + mayor);
        System.out.println("La nota Menor es: " + menor);
        System.out.println("El promedio de las notas fue: "+promedio/cantidadEstudiantes);
        System.out.println("La cantidad de aprobados fue: "+cantidadAprobados);*/
        
        
        // 🌷🌷🌷 PRACTICA PROGRAMADA 2 🌷🌷🌷//
        
        
        //Ejercicio 1
        System.out.println("****Ejercicio 1****\n");
        double tiempoPV = 0; //PV = Por Vuelva
        double tiempoPP = 0; // PP = Pit por Vuelta
        double tiempoTV = 0; // TV = Total de Vueltas
        double tiempoTP = 0; // TP = Total de Pits
        double promedioVuelta = 0;
        double promedioPits = 0;
        double porcentajePitsV = 0; // V = Vuelta

        for (int n = 0; n <= 10; n++) {
            tiempoPV = (Math.random() * 200) + 100;
            tiempoPP = (Math.random() * 50) + 10;
            tiempoTV = tiempoTV + tiempoPV;
            tiempoTP = tiempoTP + tiempoPP;
            porcentajePitsV = tiempoPV - tiempoPP;
            porcentajePitsV = Math.round((100 / tiempoTV) * porcentajePitsV); // Promedio con regla de 3
            System.out.println("Promedio de tiempo en pits en la vuelta " + n + ": " + porcentajePitsV + " %");
        }
        promedioVuelta = tiempoTV / 10;
        promedioPits = tiempoTP / 10;
        System.out.println("El tiempo promedio por vuelta es de: " + Math.round(promedioVuelta * 100.0) / 100.0 + " s");
        System.out.println("El tiempo promedio en pits es de: " + Math.round(promedioPits * 100.0) / 100.0 + " s");

        System.out.println("\n");
     
        
        
        //Ejercicio 2
        System.out.println("****Ejercicio 2****\n");
        int numEstudiantes = 0;
        String estudiantes = JOptionPane.showInputDialog("Digite el número de estudiantes: ");
        numEstudiantes = Integer.parseInt(estudiantes);
        int total100 = 0;
        int num100_120 = 0;
        int num121_130 = 0;
        int num131_140 = 0;
        int num140 = 0;
        int numEstatura = 0;
        int totalEstatura = 0;
        double promedioEstatura = 0;
        for (int i = 1; i <= numEstudiantes; i++) {
            String estatura = JOptionPane.showInputDialog("Digite la altura del estudiante: ");
            numEstatura = Integer.parseInt(estatura);
            if (numEstatura <= 100) {
                total100 = total100 + 1;
            } else if (numEstatura > 100 && numEstatura <= 120) {
                num100_120 = num100_120 + 1;
            } else if (numEstatura >= 121 && numEstatura <= 130) {
                num121_130 = num121_130 + 1;
            } else if (numEstatura >= 131 && numEstatura <= 140) {
                num131_140 = num131_140 + 1;
            } else {
                num140 = num140 + 1;
            }
            totalEstatura = totalEstatura + numEstatura;
        }
        promedioEstatura = totalEstatura / numEstudiantes;

        //Math.round = redondeo a dos decimales del promedioEstatura
        System.out.println("El promedio de la estatura es de: " + Math.round(promedioEstatura * 100.0) / 100.0);
        System.out.println("El numero de estudiantes con estatura menor a 100 es de: " + total100);
        System.out.println("El numero de estudiantes con estatura entre 100 y 120 es de: " + num100_120);
        System.out.println("El numero de estudiantes con estatura entre 121 y 130 es de: " + num121_130);
        System.out.println("El numero de estudiantes con estatura entre 131 y 140 es de: " + num131_140);
        System.out.println("El numero de estudiantes con estatura mayor a 140 es de: " + num140);
    }

}
