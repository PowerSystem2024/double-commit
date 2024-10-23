
package Operaciones;


public class Aritmetica {
    //Atributos de clases
    int a;
    int b;

    //Metodos
    public void sumarNumeros(){
        int resultado = a + b;
        System.out.println("Resultado: " + resultado);
    }
        public int sumarConRetorno(){
    //int resultado = a + b;
    return this.a + this.b;
    }
        
       public int sumarConArgumentos(int a, int b){
       this.a = a;
       this.b = b;
    //return a + b;
    return sumarConRetorno();
    }
          
    
}