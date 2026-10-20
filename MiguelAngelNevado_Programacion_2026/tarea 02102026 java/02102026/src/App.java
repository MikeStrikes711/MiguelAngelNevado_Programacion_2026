import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
import java.util.random.*;
public class App

{
    public static void main(String[] args) throws Exception
    {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
        ejercicio9();
    }

    public static void ejercicio1()
    {
        int numero=0;
        System.out.println("Ahora vamos a hacer un bucle que dictará los números del 1 al 100");
        System.out.println("INTRODUCE:");
        System.out.println("[ 1 ] para ejecutar el bucle con un comando 'while'");
        System.out.println("[ 2 ] para ejecutarlo con un comando 'do while'");
        System.out.println("[ 3 ] para ejecutar el código con un comando 'for'");
        Scanner keyboard = new Scanner(System.in);
        int respuesta = keyboard.nextInt();

        if (respuesta == 1)
        {
            while (numero <=99) 
            {
                numero +=1;
                System.out.println(numero);
            }
        }
        else if (respuesta == 2)
        {
            do
            {
                numero +=1;
                System.out.println(numero);
            } while (numero <=99);
        }
        else if (respuesta == 3)
        {
            for (int i = 0;numero <=99;i++)
            {
                numero +=1;
                System.out.println(numero);
            }
        }
        else if (respuesta >= 3 || respuesta <= 1)
        {
            System.out.println("ERROR: no has pulsado una tecla correcta");
        }
    }

    public static void ejercicio2()
    {
        System.out.println("Inserta un número, y contaré hasta tu número desde el 1");
        Scanner keyboard = new Scanner(System.in);
        int numeroSeleccionado = keyboard.nextInt();
        int numeroVisible = 0;
        if (numeroSeleccionado >= 1) 
        {
            while (numeroVisible <=(numeroSeleccionado-1))
            {
                numeroVisible += 1;
                System.out.println(numeroVisible);
            }  
        }
        else if (numeroSeleccionado <=1)
        {
            System.out.println("ERROR: el número no puede ser menor de 1");
        }
    }

    public static void ejercicio3()
    {
        System.out.println("Ahora vas a insertar 10 números para posteriormente sumarlos");
        Scanner keyboard = new Scanner(System.in);
        int Resultado = 0;


        for (int i=1;i<=10;i++)
        {
            System.out.println("Número " +i);
            int numeroSeleccionado = keyboard.nextInt();
            Resultado += numeroSeleccionado;
        }

        System.out.println("El resultado de tu cuenta es " + Resultado);

    }

    public static void ejercicio4()
    {
        System.out.println("Introduce un nombre, te diré cuando adivines el nombre");
        String nombre = "miguel";
        nombre = nombre.toLowerCase();
        boolean nombreCorrecto = false;
        Scanner keyboard = new Scanner(System.in);
        while (!nombreCorrecto) 
        {
            String nombreIntroducido = keyboard.nextLine();
            if (!nombreIntroducido.equalsIgnoreCase(nombre))    // El comando "equalsIgnoreCase" permite que el 
            {
                System.out.println("Nombre Incorrecto");
            }
            else
            {
                nombreCorrecto = true;
            }
        System.out.println("Nombre Correcto");
        }
    }

    public static void ejercicio5()
    {
        System.out.println("Ahora vamos a tirar unos dados. Escribe (si) si deseas proceder. Si no, escribe (no) ");
        Scanner keyboard = new Scanner(System.in);
        String respuesta = keyboard.nextLine();
        Random random = new Random();
        while (respuesta.equalsIgnoreCase("si") || respuesta.equalsIgnoreCase("s"))
        {
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;
            if (dado1 == dado2) 
            {
                System.out.println("Tus dados son iguales:" + dado1);    
            }
            else
            {
                System.out.println("Tus dados sacaron: " + dado1 + " y " + dado2);
            }
            System.out.println("¿Quieres seguir jugando? (sí o no)");
            respuesta = keyboard.nextLine();
        }
        System.out.println("Operación detenida. Fin");
    }

    public static void ejercicio6()
    {
        System.out.println("Ahora vas a adivinar un número y te daré pistas si es mayor o menor");
        Scanner keyboard = new Scanner(System.in);
        int numeroOculto = 12;
        boolean numeroCorrecto = false;
        while (!numeroCorrecto)
        {
            int numeroSeleccionado = keyboard.nextInt();
            if (numeroOculto != numeroSeleccionado)
            {
                System.out.println("Numero Incorrecto");
                if (numeroOculto >= numeroSeleccionado)
                {
                    System.out.println("Tu numero es mayor que el número secreto");    
                }
                if (numeroOculto <= numeroSeleccionado)
                {
                    System.out.println("Tu numero es menor que el numero seleccionado");
                }
            }
            else
            {
                System.out.println("Numero Correcto. Felicidades");
                numeroCorrecto = true;
            }
        }
    }

    public static void ejercicio7() throws InterruptedException
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce las horas");
        int hora = keyboard.nextInt();
        System.out.println("Introduce los minutos");
        int minutos = keyboard.nextInt();
        System.out.println("Introduce los segundos");
        int segundos = keyboard.nextInt();
        while (true)
        {
            System.out.println(hora + ":" + minutos + ":" + segundos);
            segundos += 1;
            Thread.sleep(1);
            if (segundos == 60) 
            {
                segundos = 0;
                minutos += 1;
            }
            if (minutos == 60)
            {
                minutos = 0;
                hora += 1;
            }
            if (hora == 24)
            {
                hora = 0;
            }
        }
    }

    public static void ejercicio8()
    {
        System.out.println("Introduce un numero y calcularemos su factorial");
        Scanner keyboard = new Scanner(System.in);
        int numero = keyboard.nextInt();
        int factorial = 1;

        if (numero <= 0)
        {
            System.out.println("El número no puede ser menor que 0");
        }
        else
        {
            for (int i=1; i <= numero; i++)
            {
                factorial = factorial * i;
            }
            System.out.println("El numero factorial de " + numero + "es " + factorial);
        }
    }

    public static void ejercicio9()
    {
        Scanner keyboard = new Scanner(System.in);
        int numeroEscaleras = keyboard.nextInt();

        System.out.println("Piramide normal");
        for (int i = 1; i <= numeroEscaleras; i++)      // i (columnas) es igual a 1, mientras i sea menor que el número de escaleras
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("Piramide invertida");
        for (int i = numeroEscaleras; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
