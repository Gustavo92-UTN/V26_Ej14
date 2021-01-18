/*Ej14
    Hacer un programa que pase de Kg a otra unidad de medida de masa, mostrar en pantalla un menu con las opciones posibles. */
package v26_ej14;
import javax.swing.JOptionPane;
/*@author Gustavo Apaza Huanca*/
public class V26_Ej14 {
    public static void main(String[] args) {
        int opcion;
        String eleccion = "kg";
        double masa;
        masa = Double.parseDouble(JOptionPane.showInputDialog("Ingrese una cantidad de masa (en Kg):"));
        
        while(masa < 0){
            JOptionPane.showMessageDialog(null, "No existe valor de masa en negativo", "Alerta!!!", JOptionPane.WARNING_MESSAGE);
            masa = Double.parseDouble(JOptionPane.showInputDialog("Ingrese una cantidad de masa (en Kg):"));
        }
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Elija del menu de opciones a que unidad desea cambiar" +
                "\n1 - Tonelada metrica" +
                "\n2 - Quintal metrico" +
                "\n3 - Hectogramo" +
                "\n4 - Decagramo" +
                "\n5 - gramo" +
                "\n6 - decigramo" +
                "\n7 - centigramo" +
                "\n8 - miligramo" +
                "\n0 - Ninguno"));
        
        while(opcion < 0 || opcion > 8){
            JOptionPane.showMessageDialog(null, "ELECCION INCORRECTA", "Alerta!!!", JOptionPane.WARNING_MESSAGE);
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Elija del menu de opciones a que unidad desea cambiar" +
                "\n1 - Tonelada metrica" +
                "\n2 - Quintal metrico" +
                "\n3 - Hectogramo" +
                "\n4 - Decagramo" +
                "\n5 - gramo" +
                "\n6 - decigramo" +
                "\n7 - centigramo" +
                "\n8 - miligramo" +
                "\n0 - Ninguno"));
        }
        
        switch(opcion){
            case 1:
                eleccion = "Tonelada/s metrica (t)";
                masa = masa / 1000;
                break;
            case 2:
                eleccion = "Quintal/es metrico (q)";
                masa = masa / 100;
                break;
            case 3:
                eleccion = "Hectogramo/s (hg)";
                masa = masa * 10;
                break;
            case 4:
                eleccion = "Decagramo/s (dag)";
                masa = masa * 100;
                break;
            case 5:
                eleccion = "gramo/s (g)";
                masa = masa * 1000;
                break;
            case 6:
                eleccion = "decigramo/s (dg)";
                masa = masa * 10000;
                break;
            case 7:
                eleccion = "centigramo/s (cg)";
                masa = masa * 100000;
                break;
            case 8:
                eleccion = "miligramo/s (mg)";
                masa = masa * 1000000;
                break;
        }
        JOptionPane.showMessageDialog(null, "Su masa es: " + masa + " " + eleccion);
    }
}
