public class Ejercicio7 {
    public static void main(String[] args) {
//        int cantidadVendida = "5"; // 1. se declara como int pero aparece como str
        int cantidadVendida = 5;
        double precioUnitario = 4500;
        double total = cantidadVendida * precioUnitario; //2. no tenía ; al terminar
        boolean aplicaDescuento = (total > 20000);
        if (aplicaDescuento = true){ // tiene = lo que lo hace true siempre? se podría utilizar simplemente aplicaDescuento porque el ya es true
            total = total - (total * 0.10);
        }
        System.out.println("Total: " + total);
    }
}