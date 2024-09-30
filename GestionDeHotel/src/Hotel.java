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

public class Hotel {
    private String idHotel;
    private String nombre;
    private ArrayList<Habitacion> habitacionesHotel;

    public Hotel() {
        habitacionesHotel = new ArrayList<Habitacion>();
    }

    public Hotel(String idHotel, String nombre, ArrayList<Habitacion> habitacionesHotel) {
        this.idHotel = idHotel;
        this.nombre = nombre;
        this.habitacionesHotel = habitacionesHotel;
    }

    public boolean agregarHabitacion(Habitacion habitacion)
    {
        return habitacionesHotel.add(habitacion);
    }

    public String getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(String idHotel) {
        this.idHotel = idHotel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarHabitacionesDisponibles()
    {
        for(Habitacion habi:habitacionesHotel){
            if(habi.estaDisponible() == true)
            {
                System.out.println("La habitacion " + habi.getNumeroHabitacion() + "esta disponible, por un precio de $"+habi.getPrecioNoche()+" la noche");
            }
        }
    }
}


