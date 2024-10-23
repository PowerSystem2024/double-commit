
package Operaciones;


public class Aritmetica {
      //Atributos de la clase
    int a;
    int b;
    
    //El constructor es un método especial
    public  Aritmetica() {  //Constructor 1 vacio
        System.out.println("Se esta ejecutando el constructor numero uno");      
    }
    // Estamos viendo lo que se llama sobrecarga de constructores
    public Aritmetica(int a, int b) {
           this.a = a;
           this.b = b;
           System.out.println("Se esta ejecutando el constructor numero dos");
        }
        
    //Metodos de la clase
    public void sumarNumeros() {
        int resultado = this.a +this. b;
        System.out.println("resultado = " + resultado);
    }
    public int sumarConRetorno(){
        //int resultado = a + b;
        return  a + b;
    }
    public int sumarConArgumentos(int a, int b) {
        this.a = a; //No modifica los valores de los atributos del objeto //El argumento a se  asigna a this.a
        this.b = b; //No son las mismas a y b que las de arriba
        //return a + b;
        return this.sumarConRetorno();
    }
}
