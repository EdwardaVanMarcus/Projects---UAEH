import pck_consultorio.*;
import pck_fecha.*;
import javax.swing.JOptionPane;

public class TestConsultorio {
    public static void main(String[] args) {
        
        
    }

    // hello probando uwu

    public static int entradaNumerica(int l, int r, String dato, String titulo){
        int num;

        do{
            num = l - 1;

            try{
                String ent = JOptionPane.showInputDialog(null, dato, titulo, 3);
                num = Integer.parseInt(ent);

                if (num < l || num > r) JOptionPane.showMessageDialog(null, "El valor debe estar entre " + l + " y " + r, "Valor invalido", 2);

            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "El valor debe ser numerico", "Error", 2);
            }

        }while(num < l || num > r);

        return num;
    }
}
