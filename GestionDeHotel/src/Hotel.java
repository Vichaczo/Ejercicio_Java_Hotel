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
    private ArrayList<Habitacion> habitacionesDisponibles;

    public Hotel() {
        habitacionesDisponibles = new ArrayList<Habitacion>();
    }
    public boolean agregar(Habitacion habitacion)
    {
        return habitacionesDisponibles.add(habitacion);
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
        for(Habitacion habi:habitacionesDisponibles){
            System.out.println(habi.getNumeroHabitacion());
        }
    }
}


