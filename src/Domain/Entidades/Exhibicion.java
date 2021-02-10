package Domain.Entidades;

import java.util.ArrayList;
import java.util.List;

public class Exhibicion {
    public String id;
    public String nombre;
    public String fecha;
    public List<Exposicion> exposicion = new ArrayList<Exposicion> ();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public List<Exposicion> getExposicion() {
        return exposicion;
    }

    public void setExposicion(List<Exposicion> exposicion) {
        this.exposicion = exposicion;
    }

}
