
package com.mycompany.pruebafinalsistemas;

public class Ejemplos {
    
 
    public static int Minutos(int minutes) {
	return minutes*60;
}    
    public static int Edad(int age) {
	return age*365;
}
    public static int Power(int A, int B) {
	return (A*B);
}
    public static void main(String[]args){
       
        Ejemplos X= new Ejemplos();
        System.out.println("la conversion de minutos a segundos es "+ X.Minutos(10));
        System.out.println("el calculo de la edad es " +X.Edad(8));
        System.out.println("el poder es de "+ X.Power(9,7));
}  
    
}    

