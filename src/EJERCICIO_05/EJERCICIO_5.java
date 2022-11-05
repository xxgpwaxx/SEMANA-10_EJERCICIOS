/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//crear una lista simplemente enlazada y realizar un menu donde pueda hacer lo siguiente:
//Agregar
//Mostrar
//Ingresar al final
//ingresar al inicio
//mayor numero
//menor numero
//pomedio
//ordenar
//ordenar ascendente
//eliminar por posición
package EJERCICIO_05;
import java.util.Scanner;
//Gaspar Paucar Wilber Andrihu
/**
 *
 * @author Usuario
 */
public class EJERCICIO_5 {
    public static Scanner sc = new Scanner(System.in);
    public static ListaEnLazada miLista = new ListaEnLazada();
    public static void main(String[] args) {
      int op = 0;
        do {
            System.out.println("menu de opciones");
            System.out.println("[1] Ingresar elementos a las lista");
            System.out.println("[2] Mostrar lista");
            System.out.println("[3] Ingrese Elemento Al final");
            System.out.println("[4] Borrar numero del inicio");
            System.out.println("[5] Mayor numero");
            System.out.println("[6] Menor numero");
            System.out.println("[7] Promedio");
            System.out.println("[8] Ordenar Acendente");
            System.out.println("[9] Eliminar por posicion");
            System.out.println("[10] Salir");
            System.out.println("Ingrese opcion[1-10]");
            op = sc.nextInt();
        switch (op) {
        case 1 -> {
            double x = 0;
            System.out.println("Numero de elementos de la lista");
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese numero::" + j);
                x = sc.nextDouble();
                miLista.insertarAlinicio(x);
            }
              }
        case 2 -> {
            System.out.println("Los numeros ingresados son::");
            miLista.mostrar();
              }
        case 3 -> {
            double e;
            System.out.println("Numero de elementos de la lista");
            int r = sc.nextInt();
            for (int i = 0; i < r; i++) {
                System.out.println("Ingrese numer::" + i);
                e = sc.nextDouble();
                miLista.insertarAlFinal(e);
            }
              }
        case 4 -> {
            System.out.println("Borrando numero del inicio");
            miLista.borrarPrimero();
              }
        case 5 -> miLista.mayor();
        case 6 -> miLista.menor();
        case 7 -> {
            System.out.println("Promedio");
            miLista.promedio();
              }
        case 8 -> {
            System.out.println("ORDENAMIENTO ACENDENTE");
            miLista.ordenarAcendente();
            miLista.mostrar();
              }
        case 9 -> {
            System.out.println("Ingrese Numero a eliminar");
            double numero=sc.nextDouble();
            
            if(miLista.buscarPosicion(numero)!=-1){
                int p=miLista.buscarPosicion(numero);
                miLista.borrar(p);
                System.out.println("Numero eliminado");
            }else{
                System.out.println("Nuemro no encontrado");
            } }
                default -> System.out.println("Saliendo del programa");
            }
                } while (op != 10);
        }
    }

