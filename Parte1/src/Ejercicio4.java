public class Ejercicio4 {
    public static void main(String[] args) {
        int inventarioCafe=50;
        int pedido=3;
        int tope=10;

        while(tope<=inventarioCafe){
            inventarioCafe-=pedido;
            System.out.printf("Cantidad entregada: %d%nCantidad restante:%d%n",pedido,inventarioCafe);
        }
    }
}
