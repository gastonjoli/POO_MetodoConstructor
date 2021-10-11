package ClasesYObjetos;

public class Persona {
    //Atributos

    String nombre;
    int edad;

    /* Método Constructor

   (NO SE PONE VOID)Los metodos constructores
   son los unicos metodos que no se le debe
   poner tipo de valor de retorno
   Nos va  afacilitar la inicialiciacion de
   los atributos de la clase Persona.
    */
    public Persona(String nombre, int edad ){
        this.nombre = nombre;
        this.edad = edad;
    }
    //Metodo(no retorna nada) que me va
    // a ayudar a mostrar los datos

    public void mostrarDatos(){
        System.out.println("el nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }

}
