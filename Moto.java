package Objetos;

public class Moto {
    // crear atributos
    private String nombre;
    private int ruedas;
    private int retrovisores;
    private String motor;
    private String color;


    // crear CONSTRUCTOR CON PARAMETROS
public Moto(String nombre, int ruedas, int retrovisores, String motor, String color){
    this.nombre = nombre;
    this.ruedas= ruedas;
    this.retrovisores= retrovisores;
    this.motor = motor;
    this.color = color;
}

    // Crear constructor vacio
public Moto(){

}

    // crear metodos GETTER Y SETTER
    // get nombre
    public String getNombre() {
    return nombre;
}

    // set nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // get retrovisores
    public int getRetrovisores(){
    return retrovisores;
}

    // set retrovisores
    public void setRetrovisores(int retrovisores) {
        this.retrovisores = retrovisores;
       
    }
     // get ruedas
     public int getRuedas(){
        return ruedas;
    }
    
        // set ruedas
        public void setRuedas(int ruedas) {
            this.ruedas = ruedas;
        }
    

    // get motor
    public String getMotor(){
        return motor;
    }

    // set motor
    public void setMotor(String motor) {
        this.motor = motor;
    }

    // get color
   public String getColor(){
    return color;
}

    // set color
    public void setColor(String color) {
        this.color = color;
    }

    // metodo String
@Override
public String toString(){
    return "motos{"+" nombre="+this.nombre+ ", ruedas="+this.ruedas +", retrovisores="+this.retrovisores +", motor="+ this.motor +", color="+this.color +"}";//concatenacion
        
    }//this.nombre->nombre del atributo que hemos creado en la public class.
}
