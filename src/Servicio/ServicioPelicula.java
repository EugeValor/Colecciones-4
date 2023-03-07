/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pelicula;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Scanner;

/** 
 *
 * @author 54343
 */
public class ServicioPelicula {
  
      ArrayList<Pelicula> cartelera = new ArrayList();    
   Scanner titulo = new Scanner(System.in);
   Scanner director = new Scanner(System.in);
   Scanner duracion = new Scanner(System.in);
   Scanner opcion = new Scanner(System.in);
    public void crearPelicula(){
       int opc;
        
        do{
        System.out.println("Ingrese el titulo de la pelicula");
        String Titulo = titulo.nextLine();
        System.out.println("Ingrese el director de la pelicula");
        String Director = director.nextLine();
        System.out.println("Ingrese la duracion de la peliculas en horas");
        int Duracion = duracion.nextInt();
        Pelicula P1 = new Pelicula(Titulo, Director, Duracion);
        cartelera.add(P1);
        System.out.println("Desaa agregas mas peliculas? 1-Si/2-No");
        opc = opcion.nextInt();
        
        }while(opc==1);
        
    }
   public void mostrarPeliculas(){
       cartelera.forEach((pelicula) -> {
           System.out.println(pelicula);
          });
   }
   public void Peliculas1Hora(){
         System.out.println("Las peliculas que duran mas de una hora son: ");
         cartelera.stream().filter((pelicula) -> (pelicula.getDuracion()>1)).forEachOrdered((pelicula) -> {
             System.out.println(pelicula.toString());
          });
   }
   public void duracionDesc(){
       cartelera.sort(Comparadores.ordenarPorDuracionDesc);
       System.out.println("La lista de peliculas de acuerdo a su duracion(Desc) es: ");
       cartelera.forEach((pelicula) -> {
           System.out.println(pelicula.toString());
          });
   }
    public void duracionAsc(){
       cartelera.sort(Comparadores.ordenarPorDuracionAsc);
       System.out.println("La lista de peliculas de acuerdo a su duracion(Asc) es: ");
       cartelera.forEach((pelicula) -> {
           System.out.println(pelicula.toString());
          });
    }
     public void ordenTitulo(){
       cartelera.sort(Comparadores.ordenarPorTitulo);
       System.out.println("La lista de peliculas ordenadas alfabeticamente  por titulo es: ");
       cartelera.forEach((pelicula) -> {
           System.out.println(pelicula.toString());
          });
     }
    public void ordenDirector(){
       cartelera.sort(Comparadores.ordenarPorDirector);
       System.out.println("La lista de peliculas ordenadas alfabeticamente por su director es: ");
       cartelera.forEach((pelicula) -> {
           System.out.println(pelicula.toString());
          });
     } 
}
