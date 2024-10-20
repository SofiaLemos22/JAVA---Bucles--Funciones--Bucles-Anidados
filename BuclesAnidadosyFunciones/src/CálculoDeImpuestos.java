
/*
 Cálculo de impuestos
Una pequeña empresa debe calcular el impuesto de venta para cada una de las facturas emitidas.

**Instrucciones**:
- Crea un arreglo `facturas` con los montos de las facturas de los clientes.
- Escribe una función `calcularImpuesto` que aplique un 21% de impuesto a cada factura.
 */




import javax.swing.*;

public class CálculoDeImpuestos {
    public static void main(String[] args) {
        // Arreglo con los montos de las facturas de los clientes
        double[] facturas = {500, 900, 1500, 600};

        // Llamar a la función que calcula el impuesto
        calcularImpuestos(facturas);
    }

    public static void calcularImpuestos(double[] facturas) {
        for (int i = 0; i < facturas.length; i++) {
            double impuesto = facturas[i] * 0.21; // Calcular el impuesto (21%)
            double total = facturas[i] - impuesto; // Calcular el total a pagar

            // Mostrar el monto original, el impuesto y el total a pagar en un cuadro de diálogo
            JOptionPane.showMessageDialog(null, "A tu factura de monto $" + facturas[i] + " se le aplicó un 21% de impuesto," +
                    " debes pagar un total de: $" + total);
        }
    }
}

