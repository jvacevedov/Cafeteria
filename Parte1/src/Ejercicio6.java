public class Ejercicio6 {
    public static void main(String[] args){
        String[] productos = {"Café americano", "Capuchino", "Jugo de naranja", "Tostada",
                "Brownie"};
        double[] precios = {3500, 5000, 4000, 4500, 6000};

        for(int p=0; p<productos.length;p++){
            System.out.printf("%d. %s: $%.2f%n",p+1, productos[p],precios[p]);
        }
    }
}
