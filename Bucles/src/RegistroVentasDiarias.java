/*
Ejercicio 4: Registro de ventas diarias
Una tienda desea registrar las ventas realizadas cada día durante una semana. El programa debe calcular el total de ventas al final de la semana.
Instrucciones:
•	Usa un bucle para registrar las ventas diarias durante 7 días.
•	Al final del bucle, muestra el total de ventas de la semana.
 */



import javax.swing.*;

public class RegistroVentasDiarias {
    public static void main(String[] args) {
        // Arreglo que contiene los días de la semana
        String[] semana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        // Variable para almacenar el total de ventas
        int totalVentas = 0;

        // Bucle para registrar las ventas diarias durante 7 días
        for (int i = 0; i < 7; i++) {
            // Pedir la cantidad de ventas del día correspondiente
            int ventas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de ventas para " + semana[i] + ":", "Ventas", JOptionPane.QUESTION_MESSAGE));
            totalVentas += ventas; // Sumar las ventas al total
        }

        // Mostrar el total de ventas de la semana
        JOptionPane.showMessageDialog(null, "El total de ventas de la semana es de: " + totalVentas, "Total Ventas", JOptionPane.INFORMATION_MESSAGE);
    }
}
