/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones4;

import Servicio.ServicioPelicula;
import java.util.Scanner;

/**
 *
 * @author 54343
 */
public class Colecciones4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPelicula SP = new ServicioPelicula();
        Scanner leer = new Scanner(System.in);
        SP.crearPelicula();
        int opcion;
         do {

            System.out.println("¿QUE DESEA HACER?");
            System.out.println("1 - Ver lista de peliculas");
            System.out.println("2 - Ver lista de peliculas con duracion mayor a una hora");
            System.out.println("3 - Ver lista de peliculas de acuerdo a su duracion descendiente");
            System.out.println("4 - Ver lista de peliculas de acuerdo a su duracion ascendente");
            System.out.println("5 - Ver lista de peliculas ordenadas alfabeticamente por titulo");
            System.out.println("6 - Ver lista de peliculas ordenadas alfabeticamente por su director");
            System.out.println("7 - Salir");

            System.out.println("Elija una opción");
            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    SP.mostrarPeliculas();
                    break;
                case 2:
                    SP.Peliculas1Hora();
                    break;
                case 3:
                     SP.duracionDesc();
                    break;
                case 4:
                    SP.duracionAsc();
                    break;
                case 5:
                    SP.ordenTitulo();
                case 6: 
                    SP.ordenDirector();
                    break;
                 case 7:
                    System.out.println("Sistema cerrado");
                default: 
                    System.out.println(" ");
                    break;
            }

        } while (opcion !=7);
}}
/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

22

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.*/