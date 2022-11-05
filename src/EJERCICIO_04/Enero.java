/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO_04;
import java.util.ArrayList;
import java.util.Scanner;
//Gaspar Paucar Wilber Andrihu
/**
 *
 * @author Usuario
 */
public class Enero {
    Integer numeroDiaMes;
    String diaSemana;
    Integer temperaturaMedia;

public Enero() {
        rellenarDia();
        rellenarDiaSemana();
        rellenarTemperaturaMedia();
    }
public void rellenarDia(){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dia del mes: ");
        numeroDiaMes = teclado.nextInt();
    }

public Integer mostrarDia(){
        return numeroDiaMes;
    }

public void rellenarDiaSemana(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dia de la semana: ");
        diaSemana = teclado.nextLine();
    }

public String mostrarDiaSemana(){
        return diaSemana;
    }

public void rellenarTemperaturaMedia(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Temperatura Media: ");
        temperaturaMedia = teclado.nextInt();
    }

public Integer mostrarTemperaturaMedia(){
        return temperaturaMedia;
    }

public static void mostrarTemperaturas(ArrayList <Enero> lista) {
        System.out.println("---------------El Mes de Enero Hizo-----------");
            for (int i = 0; i < lista.size(); i++) {
                System.out.println("Para el " + lista.get(i).mostrarDiaSemana() + " dia " + lista.get(i).mostrarDia() + " Hizo una temperatura de " + lista.get(i).mostrarTemperaturaMedia());
        }
}

public static void temperaturaMedia(ArrayList <Enero> lista) {
    Integer media;
    Integer suma = 0;
    Integer contador = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).mostrarTemperaturaMedia();
            contador++;
    }
        media = suma / contador;
        System.out.println("La Temperatura media es de: " + media);
    }

public static void diasMasCaluroso(ArrayList <Enero> lista) {
    Integer caluroso = 0;
        for (int i = 0; i < lista.size(); i++) {
        if (lista.get(i).mostrarTemperaturaMedia() > caluroso) {
        caluroso = lista.get(i).mostrarTemperaturaMedia();
             }
        }

    System.out.println("---------Los dias mas calurosos son------------");

for (int i = 0; i < lista.size(); i++) {
        if (caluroso == lista.get(i).mostrarTemperaturaMedia()) {
        System.out.println("Para el " + lista.get(i).mostrarDiaSemana() + " dia " + lista.get(i).mostrarDia() + " Hizo una temperatura de " + lista.get(i).mostrarTemperaturaMedia());
                }
          }
    }

public static void main(String[] args) {
        ArrayList <Enero> lista = new ArrayList<>(31);
        ArrayList <Enero> mostrarCaluroso = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        String respuesta;
            do {
                System.err.println("Datos del dia: ");
                lista.add(new Enero());
                System.out.println("Desea introducir otro dia [SI / NO]");
                respuesta = teclado.nextLine();
                } while (respuesta.equalsIgnoreCase("Si"));
                    mostrarTemperaturas(lista);
                    temperaturaMedia(lista);
                    diasMasCaluroso(lista);
    }
}