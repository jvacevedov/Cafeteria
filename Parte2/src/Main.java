//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] nombres = {"Café americano", "Capuchino", "Jugo naranja", "Tostada",
                "Brownie"};
        double[] precios = {3500, 5000, 4000, 4500, 6000};
        char[] categorias = {'B','B', 'F', 'C', 'P'}; // B=Bebida caliente, F=Fría, C=Comida, P=Postre
        int[] pedidoProducto = {0, 2, 1, 4, 0, 3}; // índice del producto en cada pedido
        int[] pedidoCantidad = {2, 1, 3, 1, 1, 2}; // unidades por pedido

        char categoria;
        double subtotal=0;
        String descripcion;
        boolean aplicaDescuento;
        double totalFinal=0;
        double descuento;

        for (int p=0;p<pedidoProducto.length;p++){
            subtotal=precios[pedidoProducto[p]]*pedidoCantidad[p];
            categoria=categorias[pedidoProducto[p]];
            switch (categoria){
                case 'B':
                    descripcion="Bebida caliente";
                    break;
                case 'F':
                    descripcion="Bebida fría";
                    break;
                case 'C':
                    descripcion="Comida";
                    break;
                case 'P':
                    descripcion="Postre";
                    break;
                default:
                    descripcion="Desconocido";
                    break;

            }

            aplicaDescuento = (subtotal> 12000);
            if (aplicaDescuento){
                descuento=subtotal*0.10;
                totalFinal=subtotal-descuento;
            }else{
                totalFinal=subtotal;
            }




            System.out.printf("Número de pedido: %d Nombre producto: %s Cantidad: %d Categoría: %s Subtotal:$ %.2f Aplicar descuento:%b Total pagar: $%.2f %n", p+1,nombres[pedidoProducto[p]],pedidoCantidad[p],descripcion, subtotal, aplicaDescuento, totalFinal);


        }
    }
}