package PasoPorValor;

public class PasoPorValor {
    public static void main(String[] args) {
        var valorX = 20;
        System.out.println("Valor x = "+ valorX);
        cambioValor(valorX); // Solo le enviamos una copia
        System.out.println("Valor x = "+ valorX);
    }
    public static void cambioValor(int arg1) {
        System.out.println("arg1 = "+arg1);
        arg1 = 15;
    }
}
