import java.util.ArrayList;
import java.util.Iterator;   
/**
 * Write a description of class paginasAmarillas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Agenda
{
    //coleccion de contactos de la agenda
    private ArrayList<Contacto> contactos;

    /**
     * Constructor for objects of class paginasAmarillas
     */
    public Agenda()
    {
        contactos = new ArrayList<Contacto>();

    }

    /**
     * Metodo para añadir contactos a las paginas amarillas
     */
    public void addContactos(String nombre, int telefono,String direccion,int edad)
    {
        contactos.add(new Contacto(nombre,telefono,direccion,edad));

    }
}
