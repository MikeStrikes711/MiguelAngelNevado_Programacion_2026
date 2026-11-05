import java.util.Arrays;
import java.util.Scanner;
public class App 
{
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) throws Exception 
    {
        ejercicio1();
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
}
