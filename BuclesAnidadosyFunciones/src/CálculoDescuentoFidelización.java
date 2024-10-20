
/*Cálculo de descuentos para fidelización
Una empresa ofrece descuentos a sus clientes dependiendo de la cantidad de compras que han realizado. Si han comprado más de 10 veces, reciben un 10% de descuento.

**Instrucciones**:
- Crea un arreglo `clientes` y otro `compras` que almacene la cantidad de compras de cada cliente.
- Escribe una función `calcularDescuentos` que recorra el arreglo y aplique el descuento a los clientes que califiquen.
 */


import javax.swing.*;

public class CálculoDescuentoFidelización {
    public static void main(String[] args) {
        // Arreglos que almacenan los nombres de los clientes y la cantidad de compras realizadas
        String[] clientes = {"Martin", "Rocío", "Juan", "Gabriela"};
        int[] compras = {14, 10, 11, 9};

        // Llamar a la función para calcular los descuentos
        calcularDescuentos(clientes, compras);
    }

    // Función que calcula y muestra los descuentos para los clientes que califican
    public static void calcularDescuentos(String[] clientes, int[] compras) {
        // Recorrer el arreglo de clientes
        for (int i = 0; i < clientes.length; i++) {
            // Verificar si el cliente ha realizado más de 10 compras
            if (compras[i] > 10) {
                // Calcular el descuento (10% del número de compras)
                double descuento = compras[i] * 0.10;
                // Mostrar mensaje con el descuento y el total
                JOptionPane.showMessageDialog(null,
                        clientes[i] + " tiene un descuento de $" + descuento +
                                ". El total de su compra es de " + (compras[i] - descuento));
            }
        }
    }
}

