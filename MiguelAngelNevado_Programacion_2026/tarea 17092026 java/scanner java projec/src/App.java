import java.util.Scanner;
//import java.lang.Math;

public class App 
{
    // FUNCION MAIN
        public static void main(String[] args) throws Exception 
    {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
    }

    // EJERCICIO 1
    public static void ejercicio1()
    {
        System.out.println("Hola, ¿cuál es tu nombre?");
        Scanner keyboard = new Scanner(System.in);
        String nombre = keyboard.nextLine();

        System.out.println("Hola, bienvenido " + nombre);
    }

    // EJERCICIO 2
    public static void ejercicio2()
    {
       System.out.println("¿Cuántos años tienes?");
       Scanner keyboard = new Scanner(System.in);
       int edad = keyboard.nextInt();

       System.out.println("Entonces, tienes " + edad + " años");
       System.out.println("¿Y cuál es tu correo electrónico?");
       String correoElectronico = keyboard.next();

       System.out.println("Entonces tu correo es " + correoElectronico + ", ¿verdad?");
    }

    // EJERCICIO 3
    public static void ejercicio3()
    {
        System.out.println("LISTA DE PALABRAS EN INGLÉS Y ESPAÑOL");

        System.out.println("Sill\tChair");
        System.out.println("Puerta\tDoor");
        System.out.println("Pelota\tBall");
        System.out.println("Agua\tWater");
        System.out.println("Brazo\tArm");
        System.out.println("Manzana\tApple");
        System.out.println("Pizarra\tBoard");
        System.out.println("Ventana\tWindow");
        System.out.println("Tiza\tChalk");
        System.out.println("Coche\tCar");
        System.out.println("Botella\tBottle");
    }

    public static void ejercicio4()
    {
        System.out.println("HORARIOS DE DAM-1");

        System.out.println("DÍAS\tL\tM\tX\tJ\tV");
        System.out.println("1º\tIPE-1\tProg.\tED\tSI\tLeng.");     //PRIMERA HORA
        System.out.println("2º\tSI\tProg.\tED\tSI\tLeng.");         //SEGUNDA HORA
        System.out.println("3º\tSI\tBD\tBD\tProg.\tProg.");         //TERCERA HORA
        System.out.println("R\tE\tC\tR\tE\tO");
        System.out.println("4º\tED\tBD\tBD\tProg.\tProg.");           //CUARTA HORA
        System.out.println("5º\tLeng.\tIng.\tSI\tIng.\tBD");        //QUINTA HORA
        System.out.println("6º\tLeng.\tIPE-1\tProg.\tIPE-1\tBD");   //SEXTA HORA

    }

    // EJERCICIO 5
    public static void ejercicio5()
    {
        System.out.println("Pulsa intro para ver una pirámide");

        Scanner keyboard = new Scanner(System.in);
        String piramide = keyboard.nextLine();

        System.out.println("-----o-----");
        System.out.println("----ooo----");
        System.out.println("---ooooo---");
        System.out.println("--ooooooo--");
        System.out.println("-ooooooooo-");
    }

    // EJERCICIO 6
        public static void ejercicio6()
    {
        System.out.println("Pulsa intro para ver una pirámide de antimateria");

        Scanner keyboard = new Scanner(System.in);
        String piramide = keyboard.nextLine();

        System.out.println("oooo/ Voooo");
        System.out.println("ooo/   Vooo");
        System.out.println("oo/     Voo");
        System.out.println("oV       Vo");
        System.out.println("V_________V");
    }

    // EJERCICIO 7
        public static void ejercicio7()
    {
        System.out.println("Pulsa intro para ver una pirámide invertida");

        Scanner keyboard = new Scanner(System.in);
        String piramide = keyboard.nextLine();

        System.out.println("-oooooooo/-");
        System.out.println("--oooooo/--");
        System.out.println("---oooo/---");
        System.out.println("----oo/----");
        System.out.println("-----V-----");
    }
}
    


