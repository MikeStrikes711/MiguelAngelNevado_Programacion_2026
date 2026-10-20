import java.util.Scanner;

public class App {
    public static void main(String[] args) 
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

    // EJERCICIO 1
    public static void ejercicio1()
    {
        System.out.println("Ahora introduce un número, yo te diré si es multiplo de 3");
        Scanner keyboard = new Scanner(System.in);
        double numero = keyboard.nextDouble();
        if (numero % 3 == 0)
        {
            System.out.println("Tu número es divisible entre 3");
        }
        else
        {
            System.out.println("Tu número no es divisible entre 3");
        }
    }

    // EJERCICIO 2
    public static void ejercicio2()
    {
        System.out.println("Ahora escribirás tres números y te diré cual es el más grande");
        System.out.println("Número 1:");
        Scanner keyboard = new Scanner(System.in);
        double numero1 = keyboard.nextDouble();
        System.out.println("Número 2:");
        double numero2 = keyboard.nextDouble();
        System.out.println("Número 3:");
        double numero3 = keyboard.nextDouble();

        if (numero1 > numero3 && numero1 > numero2) 
        {
            System.out.println(numero1 + " es el número mayor.");
        }
        if (numero2 > numero3 && numero2 > numero1)
        {
            System.out.println(numero2 + " es el número mayor");
        }
        if (numero3 > numero2 && numero3 > numero1)
        {
            System.out.println(numero3 + " es el número mayor");
        }
    }

    // EJERCICIO 3
    public static void ejercicio3()
    {
        System.out.println("Indicame una hora (hh/mm/ss) en formato de 24 horas (00-24)");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("¿Que hora quieres poner?");
        int horas = keyboard.nextInt();
        System.out.println("Introduce los minutos");
        int minutos = keyboard.nextInt();
        System.out.println("Introduce los segundos");
        int segundos = keyboard.nextInt();

        if (horas >= 24)
        {
            System.out.println("ERROR: no existe la hora " + horas);
        }
        else if (minutos >= 60)
        {
            System.out.println("ERROR: no pueden haber más de " + minutos);
        }
        else if (segundos >= 60)
        {
            System.out.println("ERROR: no pueden haber más de " + segundos);
        }
        else if (horas <= 24 && minutos <= 59 && segundos <= 59)
        {
            System.out.println("La hora se ha establecido correctamente: "+horas+":"+ minutos+":"+ segundos);
        }


    }
    public static void ejercicio4()
    {
        System.out.println("Introduce un número del 1 al 10");
        Scanner keyboard = new Scanner(System.in);
        int numero = keyboard.nextInt();

        switch (numero) 
        {
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
                break;
            case 3:
                System.out.println("Tres");
                break;
            case 4:
                System.out.println("Cuatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            case 6:
                System.out.println("Seis");
                break;
            case 7:
                System.out.println("Siete");
                break;
            case 8:
                System.out.println("Ocho");
                break;
            case 9:
                System.out.println("Nueve");
                break;
            case 10:
                System.out.println("Diez");
                break;
            default:
                break;
        }

    }
    
    public static void ejercicio5()
    {
        System.out.println("Haz lo mismo que antes, pero en lugar de darme el número como caracter (1,2,3...), nómbramelo con letras (Uno, Dos, Tres...)");
        Scanner keyboard = new Scanner(System.in);
        String numeroString = keyboard.nextLine();

        switch (numeroString.toLowerCase()) 
        {
            case "uno":
                System.out.println("1");
                break;
            case "dos":
                System.out.println("2");
                break;
            case "tres":
                System.out.println("3");
                break;
            case "cuatro":
                System.out.println("4");
                break;
            case "cinco":
                System.out.println("5");
                break;
            case "seis":
                System.out.println("6");
                break;
            case "siete":
                System.out.println("7");
                break;
            case "ocho":
                System.out.println("8");
                break;
            case "nueve":
                System.out.println("9");
                break;
            case "diez":
                System.out.println("10");
                break;
            default:
                break;
        }
    }

    public static void ejercicio6()
    {
        System.out.println("Ahora me vas a introducir un mes en números (1-12) y te diré cuantos días tiene y como se llama.");
        Scanner keyboard = new Scanner(System.in);
        int mes = keyboard.nextInt();
        if (mes <= 1 || mes >= 12 )
        {
            System.out.println("El mes introducido no es válido");
        }
        else
        {
            switch (mes) 
            {
                case 1:
                    System.out.println("Enero, 31 días");
                    break;
                case 2:
                    System.out.println("Febrero, 28-29 días");
                    break;
                case 3:
                    System.out.println("Marzo, 31 días");
                    break;
                case 4:
                    System.out.println("Abril, 30 días");
                    break;
                case 5:
                    System.out.println("Mayo, 31 días");
                    break;
                case 6:
                    System.out.println("Junio, 30 días");
                    break;
                case 7:
                    System.out.println("Julio, 31 días");
                    break;
                case 8:
                    System.out.println("Agosto, 30 días");
                    break;
                case 9:
                    System.out.println("Septiembre, 31 días");
                    break;
                case 10:
                    System.out.println("Octubre, 30 días");
                    break;
                case 11:
                    System.out.println("Noviembre, 31 días");
                    break;
                case 12:
                    System.out.println("Diciembre, 30 días");
                    break;
                default:
                    break;
            }
        }
    }
    
    public static void ejercicio7()
    {
        System.out.println("Vamos a calcular la media de tus notas. A continuación, introduce las notas que has tenido en 3 asignaturas.");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Nota 1:");
        double nota = keyboard.nextDouble();
        System.out.println("Nota 2:");
        double nota2 = keyboard.nextDouble();
        System.out.println("Nota 3:");
        double nota3 = keyboard.nextDouble();
        int aprobado = 0;
        double notaMedia = (nota+nota2+nota3)/3;
        if (notaMedia >= 5)
        {

            System.out.println("Estás aprobado, y tu media es: " + notaMedia );
        }
        else
        {
            System.out.println("Estás suspenso, no podemos hacerte la media.");
        }

    }

    public static void ejercicio8()
    {
        System.out.println("Introduce la cantidad de horas que has trabajado este mes");
        Scanner keyboard = new Scanner(System.in);
        int horasTrabajadas = keyboard.nextInt();
        int pagaCantidad = 0;
        if (horasTrabajadas >= 150)
        {
            pagaCantidad = 20;
        }
        else
        {
            pagaCantidad = 10;
        }
        System.out.println("El total de tus horas pagadas son: " + horasTrabajadas*pagaCantidad);
    }

    public static void ejercicio9()
    {
        System.out.println("Introduce un año y te diré si es bisiesto o no bisiesto");
        Scanner keyboard = new Scanner(System.in);
        int ano = keyboard.nextInt();
        if (ano % 4 == 0 || ano % 100 == 0 || ano % 400 == 0)
        {
            System.out.println("Tu año es bisiesto");
        }
        else
        {
            System.out.println("Tu año es no bisiesto");
        }
    }
}
