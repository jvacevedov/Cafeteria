//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejercicio1 {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

            String producto="Pan con chicharron";
            double precio=28.30;
            int cantidad=12;
            boolean disponible=true;
            char codigo='A';

            String informacion=String.format("Nombre producto: %s%nPrecio: $%.2f %nCantidad: %d%nDiponibilidad: %b%nCódigo: %c%n  ", producto, precio,cantidad,disponible,codigo);
            System.out.printf(informacion);

        }
    }
