/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Entidad.Pelicula;
import java.util.Comparator;

/**• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 *
 * @author 54343
 */
public class Comparadores {
    public static Comparator<Pelicula> ordenarPorDuracionDesc = new Comparator <Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
                return t1.getDuracion().compareTo(t.getDuracion());
            
            
        }
    };
    public static Comparator<Pelicula> ordenarPorDuracionAsc = new Comparator <Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
                return t.getDuracion().compareTo(t1.getDuracion());
            
            
        }
    };
    public static Comparator<Pelicula> ordenarPorTitulo = new Comparator <Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
                return t.getTitulo().compareTo(t1.getTitulo());
            
            
        }
    };
    public static Comparator<Pelicula> ordenarPorDirector = new Comparator <Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
                return t.getDirector().compareTo(t1.getDirector());
            
            
        }
    };
}
