import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class App 
{
    static Random random = new Random();
    static Scanner keyboard = new Scanner(System.in);
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
        //ejercicio9();
        //borrarBucles();
        //ejercicio10();
        //ejercicio11();
        //ejercicio12();
        //ejercicio13();
    }

    // EJERCICIO 1
    /* Realiza un programa que pida al usuario un número natural n,
    a partir de ese número le pediremos n veces que nos
    introduzca otros números que almacenaremos en un array a y
    mostraremos por pantalla. */

    public static void ejercicio1()
    {
        System.out.println("Introduce un número 'n'");
        int n = keyboard.nextInt();
        if (n > 0)
        {
            int[] a = new int[n]; 
            System.out.println("Ahora, introduce " + n + " numeros");
            for (int i = 0; i < n; i++)
            {
                a[i] = keyboard.nextInt();
            }
            System.out.println(Arrays.toString(a));
        }
        else if (n < 0 || n == 0)
        {
            System.out.println("ERROR: 'n' no puede ser menor o igual a 0");
        }
    }

    // EJERCICIO 2
    /* Realiza un programa que teniendo un array relleno con
    valores a de tamaño 5 (no es necesario que los valores los
    introduzca el usuario) realice una copia del mismo en otra
    variable array b y lo muestre por pantalla. */
    public static void ejercicio2()
    {
        int a[], b[];
        a  = new int[5];
        a[1] = 5;
        a[2] = 10;
        a[3] = 15;
        a[4] = 20;
        a[5] = 25;
        b = a;
        System.out.println(Arrays.toString(b));
    }

    // EJERCICIO 3
    /* Realiza un programa que pida números enteros positivos al
    usuario y los vaya almacenando en un array a, cuando el
    usuario introduzca -1 se dejará de pedir números y se
    mostrará el array a de los números que ha introducido
    (exceptuando el -1). */
    public static void ejercicio3()
    {
        int[] a = new int[0];
        boolean salir = false;
        while (!salir)
        {
            System.out.println("Introduzca un numero");
            int numero = keyboard.nextInt();
            if (numero <= 0)
            {
                if (numero == -1)
                {
                    salir = true;
                }
                else
                {
                    System.out.println("El numero no es valido");
                }
            }
            else
            {
                a = Arrays.copyOf(a, a.length+1);
                a[a.length-1] = numero;
            }
        }
    }

    // EJERCICIO 4
    /*Realiza un programa que pida al usuario un array a de 10
    elementos y muestre por pantalla un array b que contenga los
    elementos al revés, finalmente muestra por pantalla el array b. */
    public static void ejercicio4()
    {
        // ARRAY NUMERO 1 (A)
        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Introduce el valor del array nº " + (i+1));
            a[i] = keyboard.nextInt();
            System.out.println(Arrays.toString(a));
        } 
        System.out.println("Tu array 'a' vale: " + Arrays.toString(a)); 

        // ARRAY NUMERO 2 (B)
        int[] b = new int [10];
        int n = 0;
        for (int i = (b.length-1); i > 0; i--)
        {
            b[i] = a[n];
            n +=1;
        }
        System.out.println("El inverso es: " + Arrays.toString(b));

        // ARRAY NUMERO 2 (explicación Mariano) (B)
        /*
        int[] b = new int [10];
        for (int i = 0; i > a.length; i++)
        {
            b[i] = a[a.length-1-i];
        }*/
    }

    // EJERCICIO 5
    /* Realiza un programa que pida al usuario un conjunto de
    números para un array a de 8 elementos y muestre por
    pantalla un array b que solo contenga los elementos impares. */
    public static void ejercicio5()
    {
        // ARRAY NUMERO 1 (A)
        int a[] = new int [8];
        for (int i = 0; i < a.length; i++)
        {
            System.out.printf("\nIntroduce la cifra del array " + (i+1) + ":\n");
            int numero = keyboard.nextInt();
            a[i] = numero;
            System.out.println(Arrays.toString(a));
        }

        // ARRAY NUMERO 2 (B)
        int posb = 0;
        int b[] = new int [8];
        for (int i = 0; i < b.length; i++)
        {
            if (a[i] % 2 != 0)
            {
                b[posb] = a[i];
                posb++;
            }
        }
        System.out.println("Array con solo los números impares");
        for (int i = 0; i < posb; i++)
        {
            System.out.println(b[i]);
        }
        System.out.println(Arrays.toString(b));
    }

    // EJERCICIO 6
    /*Realiza un programa que pida al usuario 9 números naturales
    y los almacene en un array a, tras ello, introducir todos los
    números que sean pares en un array b y los que sean
    impares en un array c, tanto el array b como el array c se
    tendrán que mostrar por pantalla. */
    public static void ejercicio6()
    {
        int posB = 0;
        int posC = 0;
        int[] a = new int [9];
        for (int i = 0; i < a.length; i++)
        {
            a[i] = keyboard.nextInt();
            System.out.println(Arrays.toString(a));
        }

        int [] b = new int [9];
        int [] c = new int [9];
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] % 2 == 0)
            {
                b[posB] = a[i];
                posB++;
            }
            else if (a[i] % 2 != 0)
            {
                c[posC] = a[i];
                posC++;
            }
        }
        System.out.println("ARRAY A: " + Arrays.toString(a));
        System.out.println("ARRAY B: " + Arrays.toString(b));
        System.out.println("ARRAY C: " + Arrays.toString(c));
    }

    // EJERCICIO 7
    /*Escribe un programa que pida 10 números por teclado, los
    almacene en un array y que luego muestre el máximo valor, el
    mínimo y las posiciones que ocupan en el array. */
    public static void ejercicio7()
    {
        int[] a = new int[10];

        // Inicialización correcta usando constantes límites
        int numeroMayor = Integer.MIN_VALUE;
        int numeroMenor = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++)
        {
            a[i] = keyboard.nextInt();
        }

        // NUMERO MAYOR Y MENOR (empezando desde j = 0)
        int contadorMayor = 0;
        int contadorMenor = 0;
        for (int j = 0; j < a.length; j++)
        {
            if (a[j] > numeroMayor)
            {
                numeroMayor = a[j];
                contadorMayor = j;
            }
            if (a[j] < numeroMenor)
            {
                numeroMenor = a[j];
                contadorMenor = j;
            }
        }

        System.out.println(Arrays.toString(a));
        System.out.println("Mayor: " + numeroMayor);
        System.out.println("Menor: " + numeroMenor);
        System.out.println("Numero mayor en posicion: " + contadorMayor);
        System.out.println("Numero menor en posicion: " + contadorMenor);
    }

    // EJERCICIO 8
    /*Escribe un programa que genere 20 números enteros
    aleatorios entre 0 y 99 y los almacene en un array. El programa
    debe crear un nuevo array con los números pares que haya
    entre esos 20 números. Luego debe mostrar los dos arrays. */
    public static void ejercicio8()
    {
        int[] a = new int [20];
        for (int i = 0; i < 20; i++)
        {
            a[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(a));
        
        // COMPROBACION DE NUMEROS PARES
        int [] b = new int [20];
        int posB = 0;
        for (int j = 0; j < a.length; j++)
        {
            if (a[j] % 2 == 0)
            {
                b[posB] = a[j];
                posB++;
            }
        }
        System.out.println(Arrays.toString(b));
    }

    // EJERCICIO 9
    /*Realiza un programa que dado un array desordenado lo
    ordene y lo muestre por consola siguiendo el algoritmo que
    desees. */
    public static void ejercicio9()
    {
        // CREACION DEL ARRAY DESORDENADO
        int[] a = new int [20];
        for (int q = 0; q < a.length; q++)
        {
            a[q] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(a));

        // ORDENAR ARRAY
        int n = a.length;
        for (int i = 0; i < n-1; i++)
        {
            for (int j = 0; j < n-1-i; j++)
            {
                if (a[j] > a[j+1])
                {
                    int aux = a[j];
                    a[j] = a[j+1];
                    a[j+1] = aux;
                }
            }
        }

        System.out.println(Arrays.toString(a));
    }

    // EJERCICIO DE CLASE
    public static void borrarBucles()
    {
        int a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.println(java.util.Arrays.toString(a));

        int n = a.length;
        for (int i = 0; i < n; i++)
        {
            if (a[i] %2 == 0) 
            {
                for (int j = i; j < n-1; j++)
                {
                    a[j] = a[j + 1];
                }
                n--;
                i--;
            }
        }
        System.out.println(java.util.Arrays.toString(a));
    }

    // EJERCICIO 10
    /*Haz un programa que genere 20 números enteros del 1 al
    50 ambos inclusive y los almacene en un array,
    posteriormente almacenará en un nuevo array solo los
    números primos que haya en ese array. Ambos arrays
    finalmente serán mostrados por consola. */
    public static boolean esPrimo(int numero)
    {
        for (int i=2; i <numero; i++)
        {
            if (numero %2 ==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void ejercicio10()
    {
        int[] datos = new int[20];
        int[] datosPrimos = new int[0];
        Random rd = new Random();
        for (int i=0; i < 20 ;i++)
        {
            datos[i] = rd.nextInt(50)+1;
        }
        System.out.println(Arrays.toString(datos));

        for (int i=0; i < datos.length; i++)
        {
            if (esPrimo(datos[i]))
            {
                datosPrimos = Arrays.copyOf(datosPrimos, datosPrimos.length+1);
                datosPrimos[datosPrimos.length-1] = datos[i];
            }
        }
        System.out.println(Arrays.toString(datosPrimos));
    }

    // EJERCICIO 11
    // Realiza un programa que dado un array bidimensional, lo 
    // muestre por pantalla con la siguiente estructura
    public static void ejercicio11()
    {
        int[][] a =
        {
            {1, 2, 3},
            {4, 5, 6},
            {4, 5, 3},
            {4, 2, 1}
        };
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[i].length; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(); // Salto de linea
        }
    }

    // EJERCICIO 12
    // Realiza un programa que dado un array bidimensional lo 
    // rellene de números enteros aleatorios del 2 al 12 (ambos 
    // inclusive)
    public static void ejercicio12()
    {
        // CREAR ARRAY
        int[][] a = new int[4][3];
        for (int i =0; i < a.length; i++)
        {
            for (int j = 0; j < a[i].length; j++)
            {
                a[i][j] = random.nextInt(12)+1;
            }
        }
        // IMPRIMIR ARRAY
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[i].length; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(); // Salto de linea
        }
    }

    // EJERCICIO 13
    // Realiza un programa que inserte en un array bidimensional
    // de 3x3 de números enteros, compuesto solamente por 0, tres
    // valores 1 en una posición aleatoria, no pueden solaparse, es
    // decir, ocupar la misma casilla alguno de los tres valores,
    // después muestra por pantalla el contenido del array.
    public static void ejercicio13()
    {
        Random nuevoRandom = new Random();
        int[][] a = new int[3][3];
        int contador = 0;
        while (contador < 3)
        {
            int fila = nuevoRandom.nextInt(3);
            int columna = nuevoRandom.nextInt(3);

            if (a[fila][columna] == 0) 
            {
                a[fila][columna] = 1;
                contador++;
            }
        }
        // IMPRIMIR ARRAY
        for(int i = 0; i< a.length; i++)
        {
            for(int j = 0; j< a[i].length; j++)
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // EJERCICIO 14
    //Realiza un programa que pida al usuario el tamaño en las
    // dos dimensiones (X e Y) de un array bidimensional, construya
    // un array bidimensional (con esas dimensiones) con todas las
    // posiciones con el valor 0 y lo muestre por pantalla.
    // Posteriormente se va introducir en el array el valor 1 en todas
    // las posiciones exceptuando las que estén en los bordes
    // exteriores del array, ejemplo:
    public static void ejercicio14()
    {

    }
}