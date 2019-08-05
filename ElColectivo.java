import java.util.Scanner;
/**
 * Write a description of class ElColectivo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElColectivo
{
   public static void main (String[] args) 
   {
   Scanner input = new Scanner(System.in);
   
   System.out.println("Ingrese el numero de pasajeros");
   int pasajeros = input.nextInt();
    System.out.println("Ingrese la capacidad de acomodacion de pasajeros");
    int capacidad = input.nextInt();
    
  int tarifaViaje = 10000;
  int tarifaCompania = 2000;
  
  double viajes = pasajeros / capacidad;
  System.out.println("El numero de viajes necesarios es: " + viajes);
  
  double gananciaTotal = pasajeros * tarifaViaje;
  System.out.println("La ganancia total es: " + gananciaTotal);
  
  double gananciaCompania = viajes * tarifaCompania;
  System.out.println("La ganancia para la compania es: " + gananciaCompania);
  
  
}
}