
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class Cliente {
    private String idCliente;
    private String nombre;
    private ArrayList<Reserva> reservasRealizadas;

    public Cliente() {
        reservasRealizadas = new ArrayList<Reserva>();
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void agregarReserva(Reserva reser)
    {
        reservasRealizadas.add(reser);
    }
    public boolean eliminarReserva(String idHotel,String numeroHabitacion)
    {
        for(Reserva reser: reservasRealizadas)
        {
            if(reser.getHotel().getIdHotel().equals(idHotel) && reser.getHabitacionReservada().getNumeroHabitacion().equals(numeroHabitacion))
            {
                reservasRealizadas.remove(reser);  
                return true;
            }
        }
        return false;
    }
}
