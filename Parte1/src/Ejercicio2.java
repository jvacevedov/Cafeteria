public class Ejercicio2 {
    public static void main(String[] args) {
        double descuentoPorcentaje =0.15;
        int minDescuentos=30000;
        double subtotal=42500;

        double descuento= subtotal*descuentoPorcentaje;
        double totalPagar=subtotal-descuento;
        boolean aplicaDescuento;



        if (subtotal>=minDescuentos){
            aplicaDescuento=true;
        }else {
            aplicaDescuento=false;
        }
        System.out.printf("Subtotal: $%.2f%nDescuento aplicado: %b%nTotal a pagar: $%.2f",subtotal, aplicaDescuento, descuento);
    }
}
