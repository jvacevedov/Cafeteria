public class Ejercicio5 {
    public static void main(String[] args) {
        double montoApertura=0;
        do{
            System.out.println("Ingrese el monto para apertura de caja:$");
            if(montoApertura<=0){
                System.out.println("Valor ingresado incorrecto");
            }
            montoApertura=20;
        }while(montoApertura<=0);
        System.out.println("Bienvenido");
}}
