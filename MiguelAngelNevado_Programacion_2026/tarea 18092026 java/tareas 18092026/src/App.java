import java.util.Scanner;
public class App 
{
    public static void main(String[] args) throws Exception 
    {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio9();
    }

    public static void ejercicio1()
    {
        System.out.println("Hola, ¿Cuál es tu nombre??");
        Scanner keyboard = new Scanner(System.in);
        String nombre = keyboard.nextLine();

        System.out.println("Bienvenido " + nombre);
    }

    public static void ejercicio2()
    {
        System.out.println("Ahora vamos a hacer una suma, porfavor, introduce DOS números");
        System.out.println("Número 1:");
        Scanner keyboard = new Scanner(System.in);
        int numero1 = keyboard.nextInt();
        System.out.println("El primer número es " + numero1 + ", ¿cúal es el segundo número?");
        int numero2 = keyboard.nextInt();
        int resultado = numero1 + numero2;
        System.out.println("El resultado de tu operación (" + numero1 + " + " + numero2 + ") es: " + resultado );

    }

    public static void ejercicio3()
    {
        System.out.println("Ahora vamos a calcular una raíz cuadrada, dime un número del que quieras calcular su raíz");
        Scanner keyboard = new Scanner(System.in);
        int numeroRaiz = keyboard.nextInt();
        double resultadoRaiz = Math.sqrt(numeroRaiz);
        System.out.println("El resultado de la raíz cuadrada de " + numeroRaiz + " es " + resultadoRaiz);
    }

    public static void ejercicio4()
    {
        System.out.println("Ahora vamos a elevar un número a un exponente. Primero, indícame la base:");
        Scanner keyboard = new Scanner(System.in);
        double numeroBase = keyboard.nextDouble();
        System.out.println("Muy bien, tu base es " + numeroBase + ", ahora dime cual será el exponente");
        double numeroExponente = keyboard.nextDouble();
        double resultadoExponente = Math.pow(numeroBase, numeroExponente);
        System.out.println("El resultado de la operación es " + resultadoExponente);
    }

    public static void ejercicio5()
    {
        System.out.println("Ahora vamos a calcular el área de un circulo, para ello, indícame el radio de la circunferencia:");
        Scanner keyboard = new Scanner(System.in);
        double radioCircunferencia = keyboard.nextDouble();
        double areaCircunferencia = Math.PI *radioCircunferencia /2;
        System.out.println("Muy bien, el área de tu circunferencia es: " + areaCircunferencia);
    }

    public static void ejercicio6()
    {
        System.out.println("Ahora, vamos a calcular la longitud de la circunferencia. Introduce la longitud del radio:");
        Scanner keyboard = new Scanner(System.in);
        double radioCircunferencia2 = keyboard.nextDouble();
        double longitudCircunferencia = 2 +Math.PI *radioCircunferencia2;
        System.out.println("La longitud de tu circunferencia es " + longitudCircunferencia);
    }

    public static void ejercicio7()
    {
        System.out.println("Introduce la contraseña de 4 dígitos (la contraseña es java1999)");
        Scanner keyboard = new Scanner(System.in);
        String contraseña = keyboard.nextLine();
        String codigo = "java1999";
        if (contraseña.equals(codigo)) 
        {
            System.out.println("Contraseña correcta");
        }
        else
        {
            System.out.println("Contraseña incorrecta");
        }
    }

    public static void ejercicio8()
    {
        System.out.println("Ahora, introduce una palabra/ frase por la terminal");
        Scanner keyboard = new Scanner(System.in);
        String fraseEjercicio8 = keyboard.nextLine();
        char primerCaracter = fraseEjercicio8.charAt(0);
        char ultimoCaracter = fraseEjercicio8.charAt(fraseEjercicio8.length() -1);          // Se utiliza para seleccionar la ultima letra de un string "texto.length -1"
        int longitudFrase = fraseEjercicio8.length(); 
        System.out.println("Tu frase contiene " + longitudFrase + " caracteres, su primera letra es " + primerCaracter + " y su última letra es " + ultimoCaracter);
    }
    
    public static void ejercicio9()
    {
        System.out.println("Introduce una frase con la palabra ''amigo'' en ella y te enseñaré en que posición se halla dicha palabra.");
        Scanner keyboard = new Scanner(System.in);
        String fraseEjercicio = keyboard.nextLine();
        int posicion = fraseEjercicio.indexOf("AMIGO");
        //Si no encuentra la palabra devuelve -1
        if (posicion >=0)
        {
            System.out.println("Palabra encontrada");
            System.out.println("La posicion de la palabra amigo comienza en: " + posicion);
            fraseEjercicio.substring(posicion, posicion + "amigo".length());
            System.out.println("amigo");
        }
        else
        {
            System.out.println("La palabra no existe");
        }        
    }
}
