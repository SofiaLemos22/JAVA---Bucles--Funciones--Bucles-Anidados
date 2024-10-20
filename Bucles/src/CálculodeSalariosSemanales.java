
/*
Ejercicio 2: Cálculo de salarios semanales
Una empresa desea calcular el salario semanal de sus empleados basándose en las horas trabajadas y una tarifa fija por hora.
Instrucciones:
•	Pide al usuario ingresar la cantidad de empleados.
•	Para cada empleado, pide ingresar las horas trabajadas.
•	Usa un bucle para calcular el salario de cada empleado (suponiendo una tarifa fija de $15 por hora).
*/


import javax.swing.JOptionPane;
public class CálculodeSalariosSemanales {
    public static void main(String[] args) {
        // Pedir la cantidad de empleados al usuario
        int cantidadEmpleados = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de empleados:", "Empleados", JOptionPane.QUESTION_MESSAGE));

        // Definir la tarifa fija por hora
        int tarifaFija = 15;

        // Crear un arreglo para almacenar las horas trabajadas de cada empleado
        int[] horasTrabajadas = new int[cantidadEmpleados];

        // Bucle para pedir las horas trabajadas de cada empleado
        for (int i = 0; i < cantidadEmpleados; i++) {
            String inputHoras = JOptionPane.showInputDialog(null, "Ingrese las horas trabajadas por el empleado " + (i + 1) + ":", "Horas de Trabajo", JOptionPane.QUESTION_MESSAGE);
            horasTrabajadas[i] = Integer.parseInt(inputHoras);
        }

        // Bucle para calcular y mostrar el salario de cada empleado
        for (int i = 0; i < cantidadEmpleados; i++) {
            int salario = horasTrabajadas[i] * tarifaFija;
            JOptionPane.showMessageDialog(null, "El salario del empleado " + (i + 1) + " es: $" + salario, "Salario Semanal", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
