/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;
import java.util.Scanner;
/**
 *
 * @author Carmen_Lucia3
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Punto 11. Mayor numero de dos ingresados
    
        Scanner reader = new Scanner (System.in);
        System.out.println("Ingrese el primer numero");
        double primerNumero= Integer.parseInt(reader.nextLine());
        System.out.println("Ingrese el segundo numero");
        double segundoNumero= Integer.parseInt(reader.nextLine());
        Math.max( primerNumero, segundoNumero);
        System.out.println("El mayor numero es:" + Math.max( primerNumero, segundoNumero));
        
        //Punto 16. Par o impar
        System.out.println("Ingrese un numero para determinar si es par o impar");
        int parOimpar=Integer.parseInt(reader.nextLine());
        if (parOimpar %2 == 0){
            System.out.println("El numero " + parOimpar + " es par");
        }
        else{
            System.out.println("El numero  " + parOimpar + "  es impar");
        }
        
        
        //Punto 19. Edad
        System.out.println("Ingrese su edad");
        int edad=Integer.parseInt(reader.nextLine());
        if (edad<=0 || edad >= 120){
            System.out.println("La edad ingresada es imposible.");   
        }
        else{
            System.out.println("Okay");
        }
      
        
        //Punto 20. Username
        System.out.println("Ingrese su nombre de usuario");
        String nombreUsuario = reader.nextLine();
        System.out.println("Ingrese su contraseña");
        String password = reader.nextLine();
        
        if (nombreUsuario.equals("alex") && password.equals("mightyducks") || 
                nombreUsuario.equals("emily") && password.equals("cat")){
            System.out.println("Tu seccion ha iniciado");
            }
        else{
            System.out.println("Tu contraseña o usuario es incorrecta");
        }
       
        
        //Punto 22. Password

        while(true){
            System.out.println("Ingrese la contraseña para revelar el secreto");
            String contrasena = reader.nextLine();
            if (contrasena.equals("hola")){
                System.out.println("El secreto es: chao");
                break;
            }
            else{
                System.out.println("Contraseña incorrecta");
            }
        }
       
}
}
