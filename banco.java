
interface Sentimiento{
    public void amar();
    public void odiar();
}

class Persona implements Sentimiento{
    String nombre;
    int edad;
    String apellidos;
    boolean genero;
    char sexo;

    Persona(String nombre, int edad, String apellidos, boolean genero, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.apellidos = apellidos;
        this.genero =genero;
        this.sexo = sexo;
    }
    void correr(){
        System.out.pritnln("ajajajaj");
    }
    void hablar(){
        System.out.println("jajajajajajo");
    }
    @Override
    public void amar(){
        System.out.println("jajajajaaj");
    }
    @Override
    public void odiar(){
        System.out.println("jajajajajaj");
    }
    class cuenta {
        double saldo;
        void cargar(double cantidad){
            saldo = saldo + cantidad;
        }
        void abonar(double cantidad){
            saldo=saldo+cantidad;
        }
    }    
    class banco{
        String nombre;
        String direccion;
        public void saludar(){
            System.out.println("Hola, bienvenidos al banco");
        }
    }
    class Cliente extends Persona{
        int numero;
        Cuenta cuenta;
        Cliente(String nombre, int edad, string apellidos, bloolean genero, char sexo){
            super(nombre, edad, apellidos,genero, sexo );
        }
    

    }

}

class programa{

    public static void main(String []args){
        System.out.println("jajajajaja");

    }
}