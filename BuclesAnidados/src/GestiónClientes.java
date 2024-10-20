
/*
Ejercicio 3: Gestión de clientes
Una pequeña empresa de servicios tiene una lista de clientes a los que debe enviar facturas, pero quiere procesar solo aquellos que tengan facturas pendientes por más de $500.

**Instrucciones**:
- Crea un arreglo `clientes` que almacene los nombres de los clientes y un arreglo `facturasPendientes` con el monto de sus facturas pendientes.
- Escribe una función `enviarFacturas` que imprima los nombres de los clientes con facturas mayores a $500.
*/


    import javax.swing.*;

    public class GestiónClientes {

        public static void main(String[] args) {
            // Arreglos de clientes y facturas pendientes
            String[] clientes = {"Marin", "Sofia", "Juan", "Martina"};
            double[] facturasPendientes = {200, 900, 600, 300};

            // Llamada al método para enviar facturas
            enviarFacturas(clientes, facturasPendientes);
        }

        // Método que imprime los nombres de los clientes con facturas mayores a $500
        public static void enviarFacturas(String[] clientes, double[] facturasPendientes) {
            for (int i = 0; i < clientes.length; i++) {
                if (facturasPendientes[i] > 500) {
                    // Mostrar un mensaje solo para los clientes con facturas mayores a $500
                    JOptionPane.showMessageDialog(null, "El cliente " + clientes[i] + " tiene una factura de $" + facturasPendientes[i], "Facturas", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }
