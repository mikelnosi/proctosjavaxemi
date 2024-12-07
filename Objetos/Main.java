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
