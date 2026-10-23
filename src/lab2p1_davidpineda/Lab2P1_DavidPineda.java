/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_davidpineda;

import java.util.Scanner;

/**
 *
 * @author daveh
 */
public class Lab2P1_DavidPineda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        byte opcionMenu;

        byte codigoNumerico;
        
        
        

        String menuPrincipal = """
                               Main menu
                               1. Escaner de seguridad
                               2. Conjetura de Collatz
                               3. Palidromos Numericos
                               0. 0 para salir 
                               
                               """;
        do {
            System.out.print(menuPrincipal);
            System.out.println("Ingrese una opcion");
            opcionMenu = leer.nextByte();

            if (opcionMenu == 1) {
                System.out.println("Escaner de seguridad");
                System.out.println("Ingrese un codigo numerico(1-100)");
                codigoNumerico = leer.nextByte();
                if (codigoNumerico <1 || codigoNumerico >100) {
                    System.out.println("Numero invalido");
                    break;
                    
                } else if(codigoNumerico==1) {
                    System.out.println("Código de emergencia detectado!");
                }else if (codigoNumerico== 15 || codigoNumerico ==30 || codigoNumerico== 45){
                   
                
                    
                }
               
    
                    
                    
                 
                    
                    
                
                    
                
                
                    
                

               
                

            }

          

    }

        while (opcionMenu != 0);

    }

}
