public class Ejercicio3 {
    public static void main(String[] args) {

        char bebidaCaliente='B';
        char bebidaFria='F';
        char comida='C';
        char postre='P';
        int impuestoIVA;
        boolean aplicaDescuento;
        double totalFinal;

        char categoria=postre;
        String informacion;

        switch (categoria){
            case 'B':
                impuestoIVA=0;
                informacion=String.format("Bebida Caliente%nIVA: %d%%\n" , impuestoIVA);
                break;
            case 'F':
                impuestoIVA=5;
                informacion=String.format("Bebida Fría%nIVA: %d%%\n" , impuestoIVA);
                break;
            case 'C':
                impuestoIVA=8;
                informacion=String.format("Comida%nIVA: %d%%\n" , impuestoIVA);
                break;
            case 'P':
                impuestoIVA=8;
                informacion=String.format("Postre%nIVA: %d%%\n" , impuestoIVA);
                break;
            default:
                informacion=String.format("Categoría invalida");
        }



        System.out.println(informacion);
    }
}
