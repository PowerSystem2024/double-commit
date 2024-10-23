
package ciclowhile;

public class Ejerciciowhile01 {
     public static void main(String[] args){
        var conteo = 0; //Inferencia de tipos

        while (conteo < 3){
            System.out.println("conteo = " + conteo);
            conteo++; //Aumentamos en 1 la variable
        }
        
      var contador = 0;
        do {
            System.out.println("contador = " + contador);
            contador++;
        }while(contador <= 7);
        
          for (var contando = 0; contando < 10; contando++) {
            System.out.println("contando = " + contando);
        }
        
          for (var contando = 0; contando < 7; contando++) {
              if (contando % 2 == 0)
            System.out.println("contando = " + contando);break;
        }
                    
          for (var contando = 0; contando < 10; contando++) {
            if (contando % 2 != 0) {
                continue; //Pasa inmediatamente a la siguiente iteración sin pasar por lo que queda del mismo ciclo
            }
            System.out.println("contando Continue = " + contando);
        }
          
        inicio:
        for (var contando = 0; contando < 10; contando++) {
            if (contando % 2 == 0) {
                System.out.println("contando Labels = " + contando);
                break; //Interrumpe la ejecución del ciclo
            }
        }
        
         inicioContinue:
        for (var contando = 0; contando< 10; contando++) {
            if (contando % 2 != 0) {
                continue; //Pasa inmediatamente a la siguiente iteración sin pasar por lo que queda del mismo ciclo
            }
            System.out.println("contando labels = " + contando);
        }
    }
}
