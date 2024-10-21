
/*
 Ejercicio 9: Calcular el precio final con descuentos
Una empresa quiere calcular el precio final de sus productos después de aplicar un descuento general del 10%.

**Instrucciones**:
- Crea un arreglo `preciosOriginales` que almacene el precio original de varios productos.
- Escribe una función `calcularPrecioFinal` que aplique el descuento a cada producto y devuelva el precio final.

*/


import javax.swing.*;

public class CalcularPrecioFinalDescuento {
    public static void main(String[] args) {
        // Crear un arreglo con los precios originales de los productos
        double[] preciosOriginales = {50, 100, 240, 500};

        // Llamar a la función para calcular el precio final
        calcularPrecioFinal(preciosOriginales);
    }

    // Función que calcula el precio final con un descuento del 10%
    public static void calcularPrecioFinal(double[] preciosOriginales) {
        for (int i = 0; i < preciosOriginales.length; i++) {
            // Calcular el descuento
            double descuento = preciosOriginales[i] * 0.10;
            // Calcular el precio final
            double total = preciosOriginales[i] - descuento;

            // Mostrar el resultado en un cuadro de diálogo
            JOptionPane.showMessageDialog(null, "El producto tiene un valor de $" + preciosOriginales[i] +
                    ". Se aplicó un descuento del 10% y ahora vale: $" + total);
        }
    }
}
