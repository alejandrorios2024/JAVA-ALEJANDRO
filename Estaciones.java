import javax.swing.JOptionPane;

public class Estaciones {
    public static void main(String[] args) {
       
        String input = JOptionPane.showInputDialog("Ingresa el numero del mes (1-12):");

        if (input != null) {
            try {
                int mes = Integer.parseInt(input);
                String estacion;

                switch (mes) {
                    case 12:
                    case 1:
                    case 2:
                        estacion = "Invierno";
                        break;
                    case 3:
                    case 4:
                    case 5:
                        estacion = "Primavera";
                        break;
                    case 6:
                    case 7:
                    case 8:
                        estacion = "Verano";
                        break;
                    case 9:
                    case 10:
                    case 11:
                        estacion = "Otonio";
                        break;
                    default:
                        estacion = "Mes invalido";
                        break;
                }

        
                JOptionPane.showMessageDialog(null, "La estacion es: " + estacion);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada no valida. Ingresa un numero entre 1 y 12.");
            }
        }
    }
}
