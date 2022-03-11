package collections.map;

import java.util.*;

public class ExemploMap {
    /*
    Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
    modelo = gol - consumo = 14,4km/l
     modelo = uno - consumo = 15,6 km/l
     modelo = mobi - consumo = 16,1 km/l
     modelo = hb20 - consumo = 14,5 km/l
     modelo = kwid - consumo = 15,6 km/l
     */
    
    //        Map carrosPopulares2020 = new HashMap(); //antes do java 5
    //        Map<String, Double> carrosPopulares = new HashMap<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
    //        HashMap<String, Double> carrosPopulares = new HashMap<>();
    //        Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6)
    public static void main(String[] args) {
    
         Map<String, Double> carrosPopulares = new HashMap<>(){{
             put("Gol", 14.4);
             put("Uno", 15.6);
             put("Mobi", 16.1);
             put("Hb20", 14.5);
             put("Kwid", 15.6);
         }};
     
     
   }    
}