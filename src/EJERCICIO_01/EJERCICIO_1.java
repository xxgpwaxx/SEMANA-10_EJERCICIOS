/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Realizar un programa que lea tantos números enteros como desee el usuario y los introduzca en una lista.
//Muestras la lista, intercambias los números que se encuentren en la 2ª y 4ª posición, y muestras el nuevo la lista por antalla. 
//Utiliza al menos 3 métodos: uno para introducir los datos, otro para mostrar los datos y otro para intercambiar los datos
package EJERCICIO_01;
import java.util.ArrayList;
import java.util.Scanner;
//Gaspar Paucar Wilber Andrihu
/**
 *
 * @author Usuario
 */
public class EJERCICIO_ {

    /**
     *
     * @param listaNumeros
     */
    public static void introducirValores(ArrayList <Integer> listaNumeros){
    Scanner teclado = new Scanner(System.in);
    Integer numero;
    System.out.println("Introduce un numero: ");
    do  {
        numero = teclado.nextInt();
        listaNumeros.add(numero);
        System.out.println("Introduce otro numero y si quieres salir introduce uno negativo");
        
        } while (numero >= 0);
        for (int i = 0; i < listaNumeros.size(); i++) {
        if (listaNumeros.get(i) < 0 ) {
        listaNumeros.remove(i);
                                       }       
                                                      }
    }

    public static void mostrarLista(ArrayList <Integer> listaNumeros){
            System.out.println("La lista contiene los siguientes nÃºmeros");
            System.out.println(listaNumeros);
        }

    public static void intercambiarPosiciones(ArrayList <Integer> listaNumeros){

                Integer aux;
                aux = listaNumeros.get(1);
                listaNumeros.set(1, listaNumeros.get(3));
                listaNumeros.set(3, aux);
    }

    public static void main(String[] args) {

            ArrayList <Integer> listaNumeros = new ArrayList <> ();
            introducirValores(listaNumeros);
            mostrarLista(listaNumeros);
            intercambiarPosiciones(listaNumeros);
            mostrarLista(listaNumeros);
    }   
}
