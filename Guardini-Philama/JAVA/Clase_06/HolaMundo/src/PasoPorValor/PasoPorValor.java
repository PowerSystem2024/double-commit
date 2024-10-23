

package PasoPorValor;


public class PasoPorValor {
       public static void main(String[] args) {
        var valorX = 20;
        System.out.println("valorX = " + valorX);
        CambioValor(valorX); // Solo lo enviamos una copia
        System.out.println("valorX = " + valorX);
    }
    public static void CambioValor(int arg1){ // parametro por valor
        System.out.println(" arg1 = " + arg1);
        //arg1 = 15;
    }
}
