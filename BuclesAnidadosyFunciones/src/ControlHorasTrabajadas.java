
/*
 Ejercicio 8: Control de horas trabajadas
Una empresa de servicios necesita llevar el control de las horas trabajadas por sus empleados durante una semana.

**Instrucciones**:
- Crea un arreglo `empleados` con los nombres de los empleados y otro arreglo `horasTrabajadas` con las horas trabajadas en la semana.
- Escribe una función `calcularPagoSemanal` que calcule el pago semanal (a razón de $15 por hora trabajada).

*/



import javax.swing.*;

public class ControlHorasTrabajadas {
    public static void main(String[] args) {
        // Arreglo con los nombres de los empleados
        String[] empleados = {"Mauricio Macri", "Alberto Gomez", "Maria Doune", "Sofia Lemos"};
        // Arreglo con las horas trabajadas por cada empleado en la semana
        int[] horasTrabajadas = {22, 33, 2, 10};

        // Llamar a la función que calcula el pago semanal
        calcularPagoSemanal(empleados, horasTrabajadas);
    }

    public static void calcularPagoSemanal(String[] empleados, int[] horasTrabajadas) {
        // Recorrer el arreglo de empleados
        for (int i = 0; i < empleados.length; i++) {
            // Calcular el pago semanal (a razón de $15 por hora trabajada)
            double pagoSemanal = horasTrabajadas[i] * 15;
            // Mostrar el pago semanal en un cuadro de diálogo
            JOptionPane.showMessageDialog(null, empleados[i] + " tiene un pago semanal de: $" + pagoSemanal);
        }
    }
}
