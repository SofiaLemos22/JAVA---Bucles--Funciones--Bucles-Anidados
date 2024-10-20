
/*
 Ejercicio 7: Descuento por compras grandes
Una tienda de ropa ofrece un 15% de descuento a las compras superiores a $500.

**Instrucciones**:
- Crea un arreglo `compras` que almacene los montos de las compras de los clientes.
- Escribe una función `aplicarDescuento` que aplique el descuento a las compras que superen los $500.

 */


import javax.swing.*;

public class DescuentoGrandesCompras {
    public static void main(String[] args) {
        // Arreglo con los montos de las compras de los clientes
        double[] compras = {3000, 5660, 9500, 200};

        // Llamar a la función que aplica el descuento
        aplicarDescuento(compras);
    }

    public static void aplicarDescuento(double[] compras) {
        for (int i = 0; i < compras.length; i++) {
            // Verificar si la compra supera los $500
            if (compras[i] > 500) {
                double descuento = compras[i] * 0.15; // Calcular el descuento (15%)
                double total = compras[i] - descuento; // Calcular el total a abonar

                // Mostrar el monto original, el descuento y el total a pagar en un cuadro de diálogo
                JOptionPane.showMessageDialog(null, "Tu compra de " + compras[i] +" superó los $500. Se te aplicó un descuento del 15%, " +
                        " tu monto a abonar es de: $" + total);
            } else {
                // Si la compra no supera los $500, informar que no hay descuento
                JOptionPane.showMessageDialog(null, "Tu compra es de $" + compras[i] + ". No se aplica descuento.");
            }
        }
    }
}
