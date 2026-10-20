import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception 
    {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        //ejercicio7();
        ejercicio8();
    }

    public static void ejercicio1()
    {
        System.out.println("Porfavor, introduce un número y repetiré una secuencia desde el 1 hasta tu número, las veces que equivalgan a tu número");
        Scanner keyboard = new Scanner(System.in);
        int numeroSeleccionado = keyboard.nextInt();
        int numero = 1;
        for (int i = 1; i <= numeroSeleccionado; i++)
        {
            for (int j = 1; j <= numeroSeleccionado; j++)
            {
                System.out.print(numero++);
            }
            System.out.println("");
            numero = 1;
        }
    }

    public static void ejercicio2()
    {
        System.out.println("Porfavor, introduce un número y repetiré una secuencia desde tu número hasta el 1 las veces que equivalgan a tu número");
        Scanner keyboard = new Scanner(System.in);
        int numeroSeleccionado = keyboard.nextInt();
        int numero = numeroSeleccionado;
        for (int i = numeroSeleccionado; i >= 1 ; i--)
        {
            for (int j = numeroSeleccionado; j >= 1; j--)
            {
               System.out.print(numeroSeleccionado--); 
            }
            System.out.println("");
            numeroSeleccionado += numero;
        }

    }

    public static void ejercicio3()
    {
        System.out.println("Ahora introduce un número, vamos a realizar una escalera siguiendo el patrón de antes");
        Scanner keyboard = new Scanner(System.in);
        int numeroSeleccionado = keyboard.nextInt();
        int numero = 1;
        for (int i = 1; i <= numeroSeleccionado; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(numero++);
            }
            System.out.println("");
            numero = 1;
        }
    }

    public static void ejercicio4()
    {
        System.out.println("Ahora vamos a imprimir en pantalla los números del 100 al 1, ¿quieres proceder con la operación? (s / n)");
        Scanner keyboard = new Scanner(System.in);
        String eleccion = keyboard.nextLine();
        if (eleccion.equalsIgnoreCase("s") || eleccion.equalsIgnoreCase( "si")) 
        {
            System.out.println("-------------------------------------------------------------");

            for (int i = 100;i >= 1; i-=7)
            {
                for (int j = 1; j >= 1; j--)
                {
                    System.out.print(i);                    
                }
                System.out.println("");
            }
            System.out.println("La secuencia ha llegado a su fin");
        }
    }

    //Ejercicio 5: Desarrollar un programa que te pregunte cuando números quieres leer.
    //Nosotros deberemos leer la cantidad de números indicada y calcula el promedio de los valores indicados.
    public static void ejercicio5()
    {
        System.out.println("¿Cuántos numeros quieres leer?");
        Scanner keyboard = new Scanner(System.in);
        int cantidad = keyboard.nextInt();
        int total = 0;
        for (int i = 0; i <= cantidad; i++)
        {
            total = i;
        }
        int resultado = total/cantidad;
        System.out.print(resultado);
    }

    public static void ejercicio6()
    {
        System.out.println("Ahora vamos a ver si el numero que introduzcas es primo. Introduce tu numero porfavor.");
        Scanner keyboard = new Scanner(System.in);
        int numero = keyboard.nextInt();
        boolean primo = false;
        for (int i = 2; i < numero; i++)
        {
            while (i<numero) 
            {
                i++;
                //System.out.print(i);  // Herramienta debug, se puede desactivar

            }
            if (numero % i == 0 && numero % 2 != 0) 
            {
                System.out.println("Tu numero es primo");
                break;    
            }
            else if (numero % i == 0 && numero % 2 == 0) 
            {
                System.out.println("Tu numero es no primo");
                break;
            }
        }
    }

    public static void ejercicio7()
    {
        System.out.println("Ahora vamos a contar numeros infinitamente hasta que pulses la tecla 0");
        System.out.println("Pulsa '1' para comenzar");
        Scanner keyboard = new Scanner(System.in);
        int respuesta = keyboard.nextInt();
        if (respuesta >= 0)
        {
            boolean seguir = true;
            if (respuesta != 0) 
            {
                int contadorNumeros = 0;
                do
                {
                    System.out.print(contadorNumeros++);
                } while (seguir == true);
            }
            else if (respuesta == 0)
            {
                seguir = false;
            }
        }
    }

    public static void ejercicio8(int total)
    {
        System.out.println("¿Que operación quieres realizar?");
        System.out.printf("[1] SUMAR\n[2] RESTAR\n[3] MULTIPLICAR\n");
        System.out.printf("[4] DIVIDIR\n[5] NUMEROS PRIMOS\n[6] SALIR\n");
        Scanner keyboard = new Scanner(System.in);
        int opcion = keyboard.nextInt();
        switch (opcion) {
            case 1:     // SUMAR
                int operacionSumar = 1;
                if (operacionSumar == 1)
                {
                    System.out.println("Elige los números que quieras sumar");
                    total = 0;
                    while (operacionSumar == 1)
                    {
                        double numeroIntroducido = keyboard.nextDouble();
                        System.out.println(total += numeroIntroducido);
                        if (numeroIntroducido == 0)
                        {
                            operacionSumar = 0;    
                        }
                    }
                }
                break;

            case 2:     // RESTAR
                int operacionRestar = 1;
                if (operacionRestar == 1)
                {
                    System.out.println("Elige los números que quieras restar");
                    total = 0;
                    while (operacionRestar == 1)
                    {
                        double numeroIntroducido = keyboard.nextDouble();
                        System.out.println(total += numeroIntroducido);
                        if (numeroIntroducido == 0)
                        {
                            operacionRestar = 0;
                        }
                    }
                }
                break;

            case 3:     // MULTIPLICAR
                int operacionMultiplicar = 1;
                if (operacionMultiplicar == 1)
                {
                    System.out.println("Elige los números que quieras multiplicar");
                    total = 1;
                    while (operacionMultiplicar == 1)
                    {
                        double numeroIntroducido = keyboard.nextDouble();
                        System.out.println(total *= numeroIntroducido);
                        if (numeroIntroducido == 0)
                        {
                            operacionMultiplicar = 0;
                        }
                    }
    
                }
                break;

            case 4:     // DIVIDIR
                int operacionDividir = 1;
                if (operacionDividir == 1)
                {
                    System.out.println("Elige los números que quieras dividir");
                    total = 1;
                    while (operacionDividir == 1)
                    {
                        double numeroIntroducido = keyboard.nextDouble();
                        System.out.println(total /= numeroIntroducido);
                        if (numeroIntroducido == 0)
                        {
                            operacionDividir = 0;
                        }
                    }
                }
                break;

            case 5:     // CALCULAR NUMEROS PRIMOS
                ejercicio6();
                break;

            case 6:     // SALIR
                System.out.println("Gracias, hasta la próxima.");
                break;
        
            default:
                System.out.println("Opción no válida");
        }
    }

    public static void ejercicio9()
    {
        System.out.println("Ahora, averiguaré la letra de tu DNI. Porfavor, introduce tu DNI:");
        Scanner keyboard = new Scanner(System.in);
        int dni = keyboard.nextInt();
        int letraCorrespondiente = dni / 7;
        switch (letraCorrespondiente) 
        {
            case 1:
                char letra = 'A';
                break;
            case 2:
                char letra = 'B';
                break;
            case 3:
                char letra = 'C';
                break;
            case 4:
                char letra = 'D';
                break;
            case 5:
                char letra = 'E';
                break;
            case 6:
                char letra = 'F';
                break;
            case 7:
                char letra = 'G';
                break;
            case 8:
                char letra = 'H';
                break;
            case 9:
                char letra = 'I';
                break;
            case 10:
                char letra = 'J';
                break;
            case 11:
                char letra = 'K';
                break;
            case 12:
                char letra = 'L';
                break;
            case 13:
                char letra = 'M';
                break;
            case 14:
                char letra = 'N';
                break;
            case 15:
                char letra = 'O';
                break;
            case 16:
                char letra = 'P';
                break;
            case 17:
                char letra = 'Q';
                break;
            case 18:
                char letra = 'R';
                break;
            case 19:
                char letra = 'S';
                break;
            case 20:
                char letra = 'T';
                break;
            case 21:
                char letra = 'U';
                break;
            case 22:
                char letra = 'V';
                break;
            case 23:
                char letra = 'W';
                break;
            case 24:
                char letra = 'X';
                break;
            case 25:
                char letra = 'Y';
                break;
            case 26:
                char letra = 'Z';
                break;
        
            default:
                break;
        }
    }
}
