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

        int codigoNumerico;
        int divisor = 2;
        int conjetura;
        byte palindron;
        

         
        do {
            System.out.print("""
                               Main menu
                               1. Escaner de seguridad
                               2. Conjetura de Collatz
                               3. Palidromos Numericos
                               0. 0 para salir 
                               
                               """);
            System.out.println("Ingrese una opcion");
            opcionMenu = leer.nextByte();

            if (opcionMenu == 1) {
                System.out.println("Escaner de seguridad");
                System.out.println("Ingrese un codigo numerico(1-100)");
                codigoNumerico = leer.nextInt();
                if (codigoNumerico < 1 || codigoNumerico > 100) {
                    System.out.println("Numero invalido");
                    break;

                } else if (codigoNumerico == 1) {
                    System.out.println("Código de emergencia detectado!");
                } else if (codigoNumerico == 15 || codigoNumerico == 30 || codigoNumerico == 45 || codigoNumerico == 60 || codigoNumerico == 90) {
                    System.out.println("ACCESO CONCEDIDO - Nivel 1: Tenes acceso al puente de mando");
                } else if (codigoNumerico == 3 || codigoNumerico == 6 || codigoNumerico == 9 || codigoNumerico == 12 || codigoNumerico == 18 || codigoNumerico == 21 || codigoNumerico == 24 || codigoNumerico == 27 || codigoNumerico == 33 || codigoNumerico == 36 || codigoNumerico == 39 || codigoNumerico == 42 || codigoNumerico == 48 || codigoNumerico == 51 || codigoNumerico == 54 || codigoNumerico == 57 || codigoNumerico == 63 || codigoNumerico == 66 || codigoNumerico == 69 || codigoNumerico == 71 || codigoNumerico == 74 || codigoNumerico == 77 || codigoNumerico == 83 || codigoNumerico == 86 || codigoNumerico == 89 || codigoNumerico == 91 || codigoNumerico == 94 || codigoNumerico == 98 || codigoNumerico == 99) {
                    System.out.println("ACCESO CONCEDIDO - Nivel 2;Tienes acceso al laboratorio de ingeneria");
                } else if (codigoNumerico == 5 || codigoNumerico == 10 || codigoNumerico == 20 || codigoNumerico == 25 || codigoNumerico == 25 || codigoNumerico == 40 || codigoNumerico == 50 || codigoNumerico == 55 || codigoNumerico == 65 || codigoNumerico == 70 || codigoNumerico == 80 || codigoNumerico == 85 || codigoNumerico == 95 || codigoNumerico == 100) {
                    System.out.println("ACCESO CONCEDIDO - Nivel 3:Tienes acceso a los dorms");
                } else {
                    System.out.println("Numero invalido intentar de nuevo");
                    continue;
                }

                while (codigoNumerico > divisor) {
                    if (codigoNumerico % divisor == 0) {
                        divisor++;
                        System.out.println("ALERTA: Codigo inestable");
                    } else {
                        System.out.println("ACCESO RESTRINGIDO: Código de baja prioridad");
                    }

                }

            } else if (opcionMenu == 2) {
                System.out.println("Conjetura de Collatz");
                System.out.print("Ingrese un numero entre 1 y 100");
                conjetura = leer.nextInt();
                while (conjetura > divisor) {
                    if (conjetura % divisor == 0) {
                        divisor++;
                        int impar = conjetura * 3 + 1;
                        System.out.println(impar);
                    } else  {
                        int par = conjetura / 2;
                        System.out.println(par);
                    }

                     if (conjetura < 1 || conjetura > 100) {
                        System.out.println("Numero no valido");
                        continue;
                    }
                
                }
            }else if(opcionMenu==3){
                System.out.println("Palindromos Numerico");
                System.out.print("Ingrese un numero;");
                palindron = leer.nextByte();
                while(palindron>0) {
                    if (palindron>0) {
                        int numero = palindron%10;
                        int numeroInvertido= (0*10)+numero;
                        System.out.println(numeroInvertido);
                        System.out.println("Numero Original"+palindron);
                        System.out.println("Numero Invertido;"+numeroInvertido);
                        System.out.println("El numero es un palindromo numerico");
                    }else {
                        System.out.println("Numero Original"+palindron);
                        System.out.println("Numero Original"+palindron);
                        System.out.println("el numero NO es un Palindromo numerico");
                    }if(palindron<0){
                        System.out.println("Numero invalido");
                        continue;
                    }
                    
                {
                }
                    
                }
                
            }
                while (opcionMenu != 0) {
                        
                    }
                }while (opcionMenu != 0);
        
        

            }
            }
