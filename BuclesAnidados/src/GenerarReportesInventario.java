
/*
 Ejercicio 2: Generar reportes de inventario
Una tienda de electrónica necesita un informe del inventario, mostrando los productos que tienen menos de 5 unidades en stock.

**Instrucciones**:
- Crea un arreglo `productos` que almacene los nombres de los productos y otro arreglo `stocks` que almacene la cantidad de stock de cada producto.
- Escribe una función `generarReporteBajoStock` que imprima los productos con menos de 5 unidades.

 */

import javax.swing.*;

public class GenerarReportesInventario {
    public static void main(String[] args) {
        // Crear los arreglos de productos y stocks
        String[] productos = {"Celular", "Notebook", "Impresora", "Auriculares", "Laptop", "Televisor"};
        int[] stocks = {1, 2, 3, 4, 5, 6};

        // Llamar a la función que genera el reporte de bajo stock
        generarReporteBajoStock(productos, stocks);
    }

    // Función que genera el reporte de productos con menos de 5 unidades en stock
    public static void generarReporteBajoStock(String[] productos, int[] stocks) {
        String reporte = "Productos con menos de 5 unidades en stock:\n";  // Variable para almacenar el reporte

        // Recorrer los productos y verificar el stock
        for (int i = 0; i < stocks.length; i++) {
            if (stocks[i] < 5) {
                // Concatenar el nombre del producto con bajo stock y su cantidad al reporte
                reporte += productos[i] + " - " + stocks[i] + " unidades\n";
            }
        }

        // Mostrar el reporte en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, reporte, "Reporte de Inventario", JOptionPane.INFORMATION_MESSAGE);
    }
}
