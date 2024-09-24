
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
    private ArrayList<String> reservasRealizadas;

    public Cliente() {
        reservasRealizadas = new ArrayList<String>();
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
    public void agregarReserva(String numeroReserva)
    {
        reservasRealizadas.add(numeroReserva);
    }
    public void eliminarReserva(String numeroReserva)
    {
        for(String reserva: reservasRealizadas)
        {
            if()
            {
                reserva.equals(numeroReserva);
            }
        }
    }
}
