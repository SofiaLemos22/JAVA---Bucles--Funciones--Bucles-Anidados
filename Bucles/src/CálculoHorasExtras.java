
/*
Ejercicio 5: Cálculo de horas extras
Una empresa desea calcular las horas extras trabajadas por sus empleados. Si un empleado trabaja más de 40 horas en la semana, las horas adicionales se consideran horas extras.
Instrucciones:
•Pide al usuario ingresar el número de empleados.
•Usa un bucle para ingresar las horas trabajadas por cada empleado.
•Si un empleado trabajó más de 40 horas, calcula y muestra las horas extras.

*/

import javax.swing.*;

public class CálculoHorasExtras {
    public static void main(String[] args) {

        // Pedir al usuario la cantidad de empleados
        int cantidadEmpleados = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de empleados:", "Empleados", JOptionPane.QUESTION_MESSAGE));

        // Bucle para ingresar las horas trabajadas por cada empleado
        for (int i = 0; i < cantidadEmpleados; i++) {
            // Pedir las horas trabajadas del empleado actual
            int horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de horas trabajadas del empleado " + (i + 1) + " en la semana:", "Horas de Trabajo", JOptionPane.QUESTION_MESSAGE));

            // Verificar si se trabajaron más de 40 horas
            if (horasTrabajadas > 40) {
                // Calcular horas extras
                int horasExtras = horasTrabajadas - 40;
                // Mostrar un mensaje con la cantidad de horas extras
                JOptionPane.showMessageDialog(null, "El empleado " + (i + 1) + " trabajó un total de " + horasExtras + " horas extras.", "Horas Extras", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Opción adicional: informar que no hubo horas extras
                JOptionPane.showMessageDialog(null, "El empleado " + (i + 1) + " no trabajó horas extras.", "Horas Extras", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
