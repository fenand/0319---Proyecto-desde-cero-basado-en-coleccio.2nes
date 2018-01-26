
/**
 * The test class AgendaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Test
{
    /**
     * Default constructor for test class AgendaTest
     */
    public Test()
    {
    }

    public void Test()
    {
        Agenda agenda1 = new Agenda(); 

        agenda1.addContactos("laura",53456435 ,"era1",19 );
        agenda1.addContactos("Fernando2",1034563456,"era1",  18);
        agenda1.addContactos("Fernando3",206456,"era1",  11);
        agenda1.addContactos("Fernando4",  256456345,"era1",35);
        agenda1.addContactos("Fernando5", 3435645,"era1", 77);
        System.out.println("Todos los contactos: ");
        agenda1.mostrasContactos();
        System.out.println();

        System.out.println("Mostramos los contactos ordenados de mayor a menor edad:");
        agenda1.contactosOrdenadosDeMayorAMenorEdad();
        System.out.println();

        System.out.println("Mostramos los contactos ordenados de mayor a menor telefono:");
        agenda1.contactosOrdenadosDeMayorAMenorNumeroDeTelefono();
        System.out.println();

        agenda1.modificarContacto(4,"Fernandorewr2",45649856,"erwera44",1);
        System.out.println("Modificado el contacto 4");
        System.out.println();
        System.out.println("Todos los contactos: ");
        agenda1.mostrasContactos();
        System.out.println();
        agenda1.modificarContacto(3,"Fer",0000,"ere",111111);
        System.out.println("Modificado el contacto 3");
        System.out.println();
        System.out.println("Todos los contactos: ");
        agenda1.mostrasContactos();
        System.out.println();
       
        System.out.println();

        System.out.println("Eliminamos el contacto que contenga el nombre indicado por nombre, --Laura--.");
        agenda1.removeContacto("laura");
        System.out.println();

        System.out.println("Mostramos todos los contactos:");
        agenda1.mostrasContactos();
    }

}
