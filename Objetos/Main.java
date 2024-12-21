public class Main {
    public static void main(String[] args) {

        // CREAMOS UN GARAJE
        Garaje opel = new Garaje("Opel", 50.2, 10);

        // CREAMOS UN GARAJE
        Garaje renault = new Garaje("Renault", 120, 40);

        // CREAMOS UN COCHE
        Coche ferrari = new Coche("Ferrari", 4, 2, 1, "V8", "Gasolina", "Rojo ");

        // CREAMOS UN COCHE SIN PARAMETROS
        Coche citroen = new Coche();

        // CREAMOS UN COCHE
        Coche opelZafira = new Coche("Opel Zafira", 4, 4, 3, "HDI", "Diesel", "Negro");

        // CREAMOS UN COCHE
        Coche[] arrayCoches = new Coche[2];
        // METEMOS LOS DOS COCHES AL ARRAY
        arrayCoches[0] = ferrari;
        arrayCoches[1] = opelZafira;

        // METEMOS EL ARRAY DE COCHES AL GARAJE
        opel.setCoche(arrayCoches);

        // MOSTRAMOS EL ARRAY DE COCHES DEL GARAJE
        // opel.mostrarCoche();

        System.out.println(citroen.toString());

        // LE DAMOS EL COLOR AZUL A CITROEN SIN PARAMETROS
        citroen.setColor("Azul");
        citroen.setCombustible("Electrico");
        citroen.setMotor("Electrico");
        citroen.setNombre("C4");
        citroen.setPuertas(4);
        citroen.setRetrovisores(3);
        citroen.setRuedas(4);

        System.out.println(citroen.toString());
        // creamos un motos
        Moto yamaha = new Moto("yamaha1",3, 2, "600cc","rojo");
        Moto ducati = new  Moto("ducati1",2,2,"700cc", "azul");
       // CREAMOS UNA MOTO SIN PARAMETROS
       Moto honda = new  Moto();
       //visualizar estring vacio honda
       System.out.println("moto honda sin parametros "+honda.toString());
       //fin visualizacion de valores vacios de honda
       //introducirle los datos 'set' 
       honda.setNombre("honda1");
       honda.setRuedas(2);
       honda.setRetrovisores(2);
       honda.setMotor("600CC");
       honda.setColor("azul");
       // visualizar motos string
       System.out.println(yamaha.toString());
       //visualizar estring lleno de valores honda
       System.out.println("moto honda lleno de parametros "+honda.toString());
       //fin visualizacion de lleno de valores de honda
       //retrovisores ducati
       System.out.println("retrovisores ducati:  "+ducati.getRetrovisores() );
       //fin retrovisores ducati
       //cambio de motor a yamaha motos
       yamaha.setMotor("900cc");
       System.out.println("motornew yamaha"+yamaha.toString());
       //fin cambio de motor yamaha motos
       //fin visualizar motos

        //fin crear motos
        //creamos camiones
        Camion man = new Camion("man1",12, 2, "625 cv ","diesel", "rojo");
          // CREAMOS UNA camion SIN PARAMETROS
          Camion mercedes = new  Camion();
          // visuliazar camion mercesdes sin parametros
          System.out.println("camion merces sin parametros "+mercedes.toString());


          // rellenar los parametros de camion merces
          //introducirle los datos 'set' 
       mercedes.setNombre("mercedes1");
       mercedes.setRuedas(18);
       mercedes.setRetrovisores(2);
       mercedes.setMotor("624 cv");
       mercedes.setMotor("diesel");
       mercedes.setColor("azul");
         //visualizar estring lleno de valores merces
         System.out.println("moto honda lleno de parametros "+mercedes.toString());
          // CREAMOS UN CAMION
        camion volvo = new Camion("volvo1", 18, 2, 2, "615 cv", "diesel", "negro ");

        // CREAMOS UN CAMION
        camion iveco = new camion("iveco1", 18, 2, 1, "600 CV", "diesel", "Rojo ");
        //METEMOS EL ARRAY DE CAMIONES AL GARAJE
        volvo.setCoche(arrayCoches);

        // MOSTRAMOS EL ARRAY DE COCHES DEL GARAJE
         volvo.mostrarCamion();


        //me salen errores


        //fin camiones
        /*
         * creamos un moto.java
         * le damos los atributos que veamos necesarios
         * creamos sus getter y setter
         * creamos sus contructores, uno vacio y otro con parametros
         * sobreescribimos el toString como esta en la clase de Coche
         */

        /*
         * cremos una moto
         * creamos un array de motos
         * metemos el array de motos al garaje
         * mostramos el array de motos
         */
    }
}
