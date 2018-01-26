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
    //numero identificador de cada contacto
    private int id;
    /**
     * Constructor for objects of class paginasAmarillas
     */
    public Agenda()
    {
        contactos = new ArrayList<Contacto>();
        this.id = 1;
    }

    
    /**
     * 
     * 
     * Metodo para añadir contactos a las paginas amarillas
     */
    public void addContactos(String nombre, int telefono,String direccion,int edad)
    {
        contactos.add(new Contacto(nombre,telefono,direccion,edad));
        id = id +1;
    }

    /**
     * metodo que devuelve el id del contacto
     */
    public int getId()
    {
        return id;
    }

    /**
     * metodo para devolver el numero de contactos
     */
    public void getNumeroDeContactos()
    {
        System.out.println(contactos.size());  
    }

    /**
     * Metodo para mostra la informacion de cada contacto por pantalla numerados
     * 
     */
    public void mostrasContactos()
    {
        System.out.println("Lista de Contactos : ");

        for(Contacto contactos : contactos) {
            System.out.println(contactos.getContactoCompleto());
        }
        System.out.println();
    }
}
