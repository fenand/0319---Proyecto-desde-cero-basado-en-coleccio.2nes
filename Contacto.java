
/**
 * Write a description of class Agenda here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Contacto
{
    //nombre de los contactos
    private String nombre;
    //numero de telefono de los contacto
    private int telefono;
    //direccion de los contactos
    private String direccion;
    //edad de los contactos
    private int edad;

    /**
     * Constructor for objects of class Agenda
     */
    public Contacto(String nombre,int telefono,String direccion,int edad)
    {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.edad = edad;

    }

    /**
     * metodo para devolver el nombre del contacto
     */
    public String obtenerNombre()
    {
        return nombre;  
    }

    /**
     * fijar nombre
     */
    public void fijarNombre(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * fijar edad
     */
    public void fijarTelefono(int telefono)
    {
        this.telefono = telefono;
    }

    /**
     * fijar edad
     */
    public void fijarDireccion(String direccion)
    {
        this.direccion = direccion;
    }  

    /**
     * fijar edad
     */
    public void fijarEdad(int edad)
    {
        this.edad = edad;
    }

    /**
     * metodo para devolver el nombre del contacto
     */
    public int obtenerTelefono()
    {
        return telefono;  
    }

    /**
     * metodo para devolver el nombre del contacto
     */
    public int obtenerEdad()
    {
        return edad;  
    }

    /**
     * metodo para devolver el nombre del contacto
     */
    public String obtenerDireccion()
    {
        return direccion;  
    }
    /**
     * Return detalles contacto.
     */
    public String getContactoCompleto()
    {
        return "Nombre: "+ nombre +" Edad: " + edad + " Telefono: " + telefono + " Direccion: " + direccion ;
    }
}