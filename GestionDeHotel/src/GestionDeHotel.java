/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionDeHotel {
    public static void main(String[] args) {
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList<Hotel> listaHoteles = new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("1)Agregar Hotel ");
            System.out.println("2)Agregar Cliente ");
            System.out.println("3)Mostrar hoteles");
            System.out.println("4)Mostrar Clientes");
            System.out.println("5)Ingresar a la plataforma");
            System.out.println("6) Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese id del Hotel");
                    String idHotelMenu = leer.nextLine();
                    System.out.println("Ingrese nombre del Hotel");
                    String nombreHotelMenu = leer.nextLine();
                    System.out.println("Ingrese el total de habitaciones del hotel");
                    int totalHabitacionesMenu = leer.nextInt();
                    ArrayList<Habitacion> listaHabitaciones = new ArrayList<>();
                    leer.nextLine();
                    for (int i = 0; i < totalHabitacionesMenu; i++) {
                        System.out.println("Ingrese el numero de la habitacion: ");
                        String numeroHabitacionMenu = leer.nextLine();
                        System.out.println("Ingrese el precio por noche: ");
                        Double precioNocheMenu = leer.nextDouble();
                        leer.nextLine();
                        Habitacion habitacionMenu = new Habitacion(numeroHabitacionMenu,precioNocheMenu,true);
                        listaHabitaciones.add(habitacionMenu);
                    }
                    Hotel hotelMenu = new Hotel(idHotelMenu,nombreHotelMenu,listaHabitaciones);
                    listaHoteles.add(hotelMenu);
                    break;
                case 3:
                    for (Hotel hotel : listaHoteles) {                        
                        System.out.println(hotel.getNombre());
                    }
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 6);
    }
}
