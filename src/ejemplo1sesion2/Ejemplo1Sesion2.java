
package ejemplo1sesion2;

import java.util.Scanner;
public class Ejemplo1Sesion2 {

    public static void main(String[] args) {
        //Definicio de la consola
        Scanner consola = new Scanner(System.in);
        //Definicion variables
        int estrato;
        char estado;
        long documento,tarifa_basica=0;
        //Codificacion del Programa
        System.out.println("documento de Identifiacion: ");
        documento=consola.nextLong();
        System.out.println("Estado(A=Activo, S=Suspendido)");
        estado=consola.next().charAt(0);
        System.out.println("Estrato [1,2,3,4,5]:");
        estrato=consola.nextInt();
        if (estado=='S') {
            tarifa_basica=0;
        }
        else{
            switch(estrato){
                case 1: 
                    tarifa_basica=10000;
                    break;
                case 2:
                    tarifa_basica=15000;
                    break;
                case 3:
                    tarifa_basica=30000;
                    break;
                case 4:
                    tarifa_basica=50000;
                    break;
                case 5:
                    tarifa_basica=65000;
                    break;
                
            }
        }
        System.out.println("tarifa Basica: "+tarifa_basica);
        
    }
    
}
