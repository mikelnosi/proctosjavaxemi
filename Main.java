package Objetos;

public class Main {
    public static void main(String[] args) {

   /*creamos garaje1*/
        Garaje opel = new Garaje("opel", 50.2, 10);
        /* fin garaje1*/
        /*creamos garaje2*/
        Garaje renault = new Garaje("Renault", 120, 40);
        /*fin garaje2*/
        /*inicio coches*/
        /*creamos coche ferrari*/
        Coche ferrari = new Coche("Ferrari",4,2,1, "V8", "Gasolina", "rojo");
        /*fin crear ferrari*/
        /*visualizar ferrari*/
        //System.out.println(ferrari);
        /*---------------------------------------------------*/
        //crear coche citroen sin parametros
        Coche citroen = new Coche();
        /*-----------*/
        //añadirle parametros
        citroen.setNombre("C3");
        citroen.setRuedas(4);
        citroen.setRetrovisores(3);
        citroen.setMotor("HDI 2.0");
        citroen.setColor("verde");
       /*-----------*/
        /*visualizar citroen*/
        //System.out.println(citroen.toString());
        //al poner toString me da error mas tarde despues de revertir los cambios y seguir para adelante lo vuelvo a poner y va bien no entiendo nada

        /*fin visualizacion citroen*/
        /*creamos el coche opel zafira*/
        Coche opelzafira = new Coche("OpelZafira",4,4,3, "HDI", "Diesel", "azul");
        /* fin crear coche opel zafira*/
        /*visualizar coche zafira*/
        //System.out.println(opelzafira);
        /*fin visualizar coche zafira*/
        /*CREAMOS UN COCHE*/
        Coche [] arrayCoches = new Coche[2];
        /*metemos dos coches al array*/
        arrayCoches [0] = ferrari;
        arrayCoches [1] = opelzafira;
        /*fin de meter 2 coches al array*/
        /*fin coches*/
        /*pasamos al apartado motos*/
        /*creamos moto honda con parametros*/
        Moto honda = new Moto("yamaha1",3, 2, "600cc","roja");
        /*fin de creacion moto honda con parametros*/
        /*moto ducati con parametros*/
        Moto ducati = new Moto("ducati1", 2, 2, "700CC", "azul");
        /*fin moto ducati con parametros*/
        /*inicio moto yamaha con parametros vacios sin definir*/
        Moto yamaha = new Moto();
        //System.out.println("moto honda vacio"+yamaha.toString());
        /* moto yamaha sin parametros sin definir*/
        /*inicio definir parametros yamaha*/
        yamaha.setNombre("yamaha1");
        yamaha.setRuedas(2);
        yamaha.setMotor("800cc");
        yamaha.setColor("azul");
        yamaha.setRetrovisores(2);
        /*fin definicion de parametros yamaha*/
        /*visualizacion de parametros yamaha*/
        //System.out.println("moto honda vacio"+yamaha.toString());
        /*fin visualizacion de parametros yamaha*/
        /*consulatas de parametros*/
        //retrovisores ducati
        //System.out.println("retrovisoresducati: "+ducati.getRetrovisores());
        //fin retrovisores ducati

        /*fin consultas de parametros*/
      /*cambiar datos de parametros*/
        //yamaha set introducir dato
        yamaha.setMotor("900CC");
        //consulta cambio realizado get obtener el dato cambiado
        //System.out.println("cambio de motor:  "+yamaha.getMotor());


        //fin yamaha
        /*fin cambiar datos de parametros */

        /*fin apartado motos*/
        /*inicio apartado camiones*/
        /*camion man con parametros introducidos*/
        Camion man = new Camion("man1", "verde", "gasoil", "625CV", 2, 2, 18);
        /*fin camion man*/
        /*consulta camion  man*/
        //System.out.println("motor camion man:  "+man.getMotor());
        //System.out.println("consulta de parametros:  "+yamaha.toString());
        //cambio de ruedas camion man
        man.setRuedas(16);
        //fin cambio de ruedas camion man
        //consulta ruedas camion man
        System.out.println("ruedas camion man:  "+man.getRuedas());
        //fin consulta ruedas camion man
        /*fin consulta camion man*/
        /*camion mercedes con parametros vacios*/
        Camion mercedes = new Camion();
        //consultar parametros del mercedes
       //System.out.println("parametros mercedes:  "+mercedes.toString());
        //fin de consulta parametros mercedes
        //rellenar parametros del camion
        //meter parametros a mercedes
        mercedes.setNombre("mercedes1");
        mercedes.setRuedas(18);
        mercedes.setColor("azul");
        mercedes.setMotor("900cv");
        mercedes.setCombustible("gasoil");
        mercedes.setPuertas(2);
        mercedes.setRetrovisores(2);
        /*visualizar parametros  mercedes*/
        //System.out.println("mercedes: "+mercedes.toString());
        /*fin visualizar parametros mercedes*/
        /*creamos camion volvo con parametros */
        Camion volvo = new Camion("volvo1", "azul", "diesel","800cv",2,2,18);
        /*fin creacion volvo*/
        /*creamos camion iveco con parametros*/
        Camion iveco = new Camion("iveco1","azul","gasoleo","1000cv",2,2,18);
        /*fin  creacion camion iveco*/
        /*metemos el array camiones al garaje para ello creamos un nuevo array*/
        //creamos camion
        Camion[] arraycamiones = new Camion[5];
        renault.setCamion(arraycamiones);//los metemos al garaje renault
        //lo visualizamos
        //System.out.println(renault.setCamion());
        //fin visualizacion
        renault.agregarCamion(0,volvo);

        //metodo mostrar array camiones
        Garaje.mostrarCamion();
        /*fin apartado camiones*/


    }





    }

