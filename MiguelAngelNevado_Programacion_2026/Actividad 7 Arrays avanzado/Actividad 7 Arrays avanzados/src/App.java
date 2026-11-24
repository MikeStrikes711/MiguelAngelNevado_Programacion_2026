import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class App 
{
    static Random random = new Random();
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) throws Exception 
    {
        ejercicio1();
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
}
 