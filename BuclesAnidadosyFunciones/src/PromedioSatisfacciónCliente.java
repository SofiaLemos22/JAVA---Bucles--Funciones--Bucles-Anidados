
/*
 Ejercicio 5: Promedio de satisfacción del cliente
Una empresa desea conocer el promedio de satisfacción de sus clientes basado en encuestas de calificación de 1 a 5.

**Instrucciones**:
- Crea un arreglo `calificaciones` con las puntuaciones de satisfacción de los clientes.
- Escribe una función `calcularPromedioSatisfaccion` que recorra el arreglo y calcule el promedio de satisfacción.
*/




import javax.swing.*;

public class PromedioSatisfacciónCliente {
    public static void main(String[] args) {
        // Arreglo con las puntuaciones de satisfacción de los clientes
        int[] calificaciones = {1, 3, 4, 5, 2};

        // Llamar a la función que calcula el promedio de satisfacción
        calcularPromedioSatisfacción(calificaciones);
    }

    public static void calcularPromedioSatisfacción(int[] calificaciones) {
        // Variable para almacenar la suma total de las calificaciones
        double suma = 0;

        // Recorrer el arreglo de calificaciones
        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i];  // Sumar cada calificación
        }

        // Calcular el promedio dividiendo la suma total por la cantidad de calificaciones
        double promedio = suma / calificaciones.length;

        // Mostrar el promedio de satisfacción en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "El promedio de satisfacción del cliente es: " + promedio);
    }
}
