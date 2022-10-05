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
public class leccion02 {
    public static void clase02(){
        
        //*****Practica.Programada.1*****
        // Ejercicio1:
        
        int numMes = 1;
        int numEdad = 0;

        String numMesLectura = JOptionPane.showInputDialog("Ingrese el numero de mes: ");
        numMes = Integer.parseInt(numMesLectura);

        if (numMes == 1) {
            System.out.println("Enero, Primer Cuatrimestre");
            JOptionPane.showMessageDialog(null, "Enero, Primer Cuatrimestre");
        }
        if (numMes == 2) {
            System.out.println("Febrero, Primer Cuatrimestre");
            JOptionPane.showMessageDialog(null, "Febrero, Primer Cuatrimestre");
        }
        if (numMes == 3) {
            System.out.println("Marzo, Primer Cuatrimestre");
            JOptionPane.showMessageDialog(null, "Marzo, Primer Cuatrimestre");
        }
        if (numMes == 4) {
            System.out.println("Abril, Primer Cuatrimestre");
            JOptionPane.showMessageDialog(null, "Abril, Primer Cuatrimestre");
        }
        if (numMes == 5) {
            System.out.println("Mayo, Segundo Cuatrimestre");
            JOptionPane.showMessageDialog(null, "Mayo, Segundo Cuatrimestre");
        }
        if (numMes == 6) {
            System.out.println("Junio, Segundo Cuatrimestre");
            JOptionPane.showMessageDialog(null, "Junio, Segundo Cuatrimestre");
        }
        if (numMes == 7) {
            System.out.println("Julio, Segundo Cuatrimestre");
            JOptionPane.showMessageDialog(null, "Julio, Segundo Cuatrimestre");
        }
        if (numMes == 8) {
            System.out.println("Agosto, Segundo Cuatrimestre");
            JOptionPane.showMessageDialog(null, "Agosto, Segundo Cuatrimestre");
        }
        if (numMes == 9) {
            System.out.println("Septiembre, Tercer Cuatrimestre");
            JOptionPane.showMessageDialog(null, "Septiembre, Tercer Cuatrimestre");
        }
        if (numMes == 10) {
            System.out.println("Octubre, Tercer Cuatrimestre");
            JOptionPane.showMessageDialog(null, "Octubre, Tercer Cuatrimestre");
        }
        if (numMes == 11) {
            System.out.println("Noviembre, Tercer Cuatrimestre");
            JOptionPane.showMessageDialog(null, "Noviembre, Tercer Cuatrimestre");
        }
        if (numMes == 12) {
            System.out.println("Diciembre, Tercer Cuatrimestre");
            JOptionPane.showMessageDialog(null, "Diciembre, Tercer Cuatrimestre");
        }
        
        // Ejercicio 2

        String numEdadLectura = JOptionPane.showInputDialog("Ingrese el numero de su edad: ");
        numEdad = Integer.parseInt(numEdadLectura);
        if (numEdad <= 5) {
            System.out.println("Primera Infancia");
            JOptionPane.showMessageDialog(null, "Primera Infancia");
        }
        if ((numEdad > 5) && (numEdad <= 11)) {
            System.out.println("Infancia");
            JOptionPane.showMessageDialog(null, "Infancia");
        }
        if ((numEdad > 11) && (numEdad <= 18)) {
            System.out.println("Adolescencia");
            JOptionPane.showMessageDialog(null, "Adolescencia");
        }
        if ((numEdad > 18) && (numEdad <= 30)) {
            System.out.println("Juventud");
            JOptionPane.showMessageDialog(null, "Juventud");
        }
        if ((numEdad > 30) && (numEdad <= 59)) {
            System.out.println("Adultez");
            JOptionPane.showMessageDialog(null, "Adultez");
        }
        if ((numEdad >= 60)) {
            System.out.println("Persona Mayor");
            JOptionPane.showMessageDialog(null, "Persona Mayor");
        }

    }
    }
    

