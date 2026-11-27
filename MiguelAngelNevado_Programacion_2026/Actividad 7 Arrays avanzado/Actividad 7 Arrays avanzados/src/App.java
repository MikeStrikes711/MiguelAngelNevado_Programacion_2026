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
        ejercicio2();
    }

    // EJERCICIO 1
    // Crea un programa que genere un arreglo (vector) de tamaño N con (números
    // aleatorios que no se repitan entre sí). El rango de los números y el tamaño N los
    // puedes definir tú.
    // *Pista: Cuando generes un número, tendrás que comprobar si ya existe en el array
    // antes de añadirlo.*
    public static void ejercicio1()
    {
        int N = 10;
        int[] vector = new int[N];

        for (int i = 0; i < vector.length; i++)
        {
            vector[i] = random.nextInt(N) + 1;
            int j = 0;
            while (j < i)
            {
                if (vector[i] == vector[j])
                {
                    vector[i] = random.nextInt(N) + 1;
                    j = 0;
                }
                else
                {
                    j++;
                }
            }
        }
        System.out.println(Arrays.toString(vector));
    }

    // EJERCICIO 2
    // De una empresa de transporte se quiere guardar el nombre de los conductores que
    // tiene, y los kilómetros que conducen cada día de la semana.
    // Para guardar esta información, se van a utilizar dos arreglos:
    // * `nombre`: Un vector para guardar los nombres de los conductores.
    // * `kms`: Una tabla (matriz) para guardar los kilómetros que realizan cada día de
    // la semana (por ejemplo, 5 conductores y 7 días).
    // El programa debe generar un nuevo vector llamado `totalKms` con los kilómetros
    // totales que realiza cada conductor durante la semana. Al finalizar, se debe mostrar
    // una lista con los nombres de los conductores y, al lado, el total de kilómetros que
    // ha realizado cada uno.
    public static void ejercicio2()
    {
        String[] nombre = new String[5];
        int[][] kms = new int[nombre.length][7];
        int[] totalKms = new int[nombre.length];

        // ESTABLECER EL NOMBRE DEL CONDUCTOR
        for (int i = 0; i < nombre.length; i++)
        {
            System.out.println("Introduce el nombre del conductor " + (i+1));
            nombre[i] = keyboard.nextLine();
        }
        System.out.println(Arrays.toString(nombre));

        // VER CUANTOS KILOMETROS HACE CADA DIA CADA CONDUCTOR
        for (int i = 0; i < kms.length; i++)
        {
            for (int j = 0; j < kms[i].length; j++)
            {
                System.out.println("¿Cuantos kilometros hace " + nombre[i] + " el dia " + (j+1) + "?");
                kms[i][j] = keyboard.nextInt();
            }
        }

        // HACER EL TOTAL DE KILOMETROS DE CADA UNO
        for (int i = 0; i < totalKms.length; i++)
        {
            for (int j = 0; j < kms[i].length; j++)
            {
                
            }
        }

        System.out.println(Arrays.deepToString(kms));
            

    }
}
 