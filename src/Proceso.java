import java.util.*;

class Proceso {
    String nombre;
    int tiempoRafaga;
    int tiempoLlegada;
    int prioridad;
    int tiempoEspera;
    int tiempoFinal;

    public Proceso(String nombre, int tiempoRafaga, int tiempoLlegada, int prioridad) {
        this.nombre = nombre;
        this.tiempoRafaga = tiempoRafaga;
        this.tiempoLlegada = tiempoLlegada;
        this.prioridad = prioridad;
    }
}