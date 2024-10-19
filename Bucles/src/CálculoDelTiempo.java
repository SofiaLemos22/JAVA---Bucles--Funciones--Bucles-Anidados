
/*
 Ejercicio 1: Cálculo del tiempo dedicado a cada actividad
Un alumno quiere medir el tiempo total que dedica a sus actividades académicas y personales durante el día.
Instrucciones:
Pide al usuario que ingrese las horas dedicadas a cada actividad: estudiar, hacer ejercicios, leer, y tiempo libre.
Usa un bucle para registrar las horas y luego calcula el tiempo total dedicado.
*/

import javax.swing.JOptionPane;

public class CálculoDelTiempo {
    public static void main(String[] args) {

        int horasEstudiar = 0;
        int horasEjercicios = 0;
        int horasLeer = 0;
        int horasTiempoLibre = 0;

        String[] actividades = {"estudiar", "hacer ejercicios", "leer", "tiempo libre"};


        for (int i = 0; i < 4; i++) {
            String actividad = actividades[i];
            String input = JOptionPane.showInputDialog(null, "Introduce las horas dedicadas a " + actividad + ":", "Registro de Horas", JOptionPane.QUESTION_MESSAGE);

            if (input != null && !input.trim().isEmpty()) {
                try {
                    int horas = Integer.parseInt(input);
                    switch (i) {
                        case 0:
                            horasEstudiar += horas;
                            break;
                        case 1:
                            horasEjercicios += horas;
                            break;
                        case 2:
                            horasLeer += horas;
                            break;
                        case 3:
                            horasTiempoLibre += horas;
                            break;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingresa un número válido para " + actividad + ".", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No ingresaste ninguna cantidad para " + actividad + ".", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        }


        int tiempoTotal = horasEstudiar + horasEjercicios + horasLeer + horasTiempoLibre;

        String mensaje = String.format("Horas dedicadas:\nEstudiar: %d\nHacer Ejercicios: %d\nLeer: %d\nTiempo Libre: %d\n\nTiempo total dedicado: %d horas",
                horasEstudiar, horasEjercicios, horasLeer, horasTiempoLibre, tiempoTotal);

        JOptionPane.showMessageDialog(null, mensaje, "Resumen del Tiempo Dedicado", JOptionPane.INFORMATION_MESSAGE);
    }
}
