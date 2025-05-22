import javax.swing.JOptionPane;

public class MesConNumero {
    public static void main(String[] args) {
     
        String input = JOptionPane.showInputDialog("Ingresa el numero del mes (1-12):");
        
        if (input != null) {
            try {
                int numeroMes = Integer.parseInt(input);
                String nombreMes = obtenerNombreMes(numeroMes);
                
                
                if (nombreMes != null) {
                    JOptionPane.showMessageDialog(null, "El mes es: " + nombreMes);
                } else {
                    JOptionPane.showMessageDialog(null, "Numero de mes invalido. Debe estar entre 1 y 12.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada no valida. Por favor, ingresa un numero.");
            }
        }
    }

    
    public static String obtenerNombreMes(int mes) {
        String[] meses = {
            "january", "Febrary", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        
        if (mes >= 1 && mes <= 12) {
            return meses[mes - 1];
        } else {
            return null;
        }
    }
}
