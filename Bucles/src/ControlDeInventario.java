
/*
Ejercicio 3: Control de inventario
Una tienda necesita revisar el inventario de sus productos y determinar si algún artículo tiene menos de 5 unidades disponibles para realizar un pedido.
Instrucciones:
•	Pide al usuario ingresar el número de productos.
•	Usa un bucle para ingresar la cantidad disponible de cada producto.
•	Si algún producto tiene menos de 5 unidades, muestra un mensaje indicando que es necesario realizar un pedido.
*/



import javax.swing.*;

public class ControlDeInventario {
    public static void main(String[] args) {
        // Pedir el número de productos y convertir a entero en una sola línea
        int numeroProductos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de productos:", "Número de productos", JOptionPane.QUESTION_MESSAGE));

        // Bucle para ingresar cantidades disponibles
        for (int i = 0; i < numeroProductos; i++) {
            // Ingresar y convertir la cantidad disponible en una sola línea
            int cantidadDisponible = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad disponible del producto " + (i + 1) + ":", "Cantidad Disponible", JOptionPane.QUESTION_MESSAGE));

            // Verificar si la cantidad es menor que 5
            if (cantidadDisponible < 5) {
                JOptionPane.showMessageDialog(null, "Es necesario realizar un pedido para el producto " + (i + 1) + ".", "Aviso de Pedido", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}
