
/*
 Ejercicio 1: Cálculo de ingresos mensuales
Una pequeña tienda registra sus ventas diarias en un arreglo. Se necesita escribir una función que use un bucle para calcular los ingresos totales mensuales.

**Instrucciones**:
- Crea un arreglo `ventas` que almacene las ventas diarias de una tienda durante 30 días.
- Escribe una función `calcularIngresosMensuales` que recorra el arreglo y sume las ventas.
- Imprime el total de ingresos mensuales.

*/

import javax.swing.*;

public class CálculoIngresosMensuales {
    public static void main(String[] args) {
        // Crear un arreglo para almacenar las ventas diarias durante 30 días
        double[] ventas = new double[30];

        // Recoger las ventas diarias del usuario
        for (int i = 0; i < ventas.length; i++) {
            ventas[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese las ventas del día " + (i + 1) + ":", "Ventas Diarias", JOptionPane.QUESTION_MESSAGE));
        }

        // Calcular los ingresos mensuales
        double totalIngresos = calcularIngresosMensuales(ventas);

        // Imprimir el total de ingresos mensuales
        JOptionPane.showMessageDialog(null, "El total de ingresos mensuales es: " + totalIngresos, "Total Ingresos", JOptionPane.INFORMATION_MESSAGE);
    }

    // Función para calcular los ingresos mensuales
    public static double calcularIngresosMensuales(double[] ventas) {
        double total = 0;

        // Recorrer el arreglo y sumar las ventas
        for (double venta : ventas) {
            total += venta;
        }

        return total;
    }
}

