import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class App 
{
    static Random random = new Random();
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) throws Exception 
    {
        //ejercicio5();
        ejercicio6();
    }

    // EJERCICIO 5
    // Programa que declare tres vectores: `vector1`, `vector2` y `vector3` de cinco
    // enteros cada uno. Pide valores para `vector1` y `vector2` por teclado y calcula
    // `vector3` como la suma de los dos anteriores (`vector3 = vector1 + vector2`).
    public static void ejercicio5()
    {
        int[] vector1 = new int [5];
        int[] vector2 = new int [5];
        int[] vector3 = new int [5];
        for (int i = 0; i < vector1.length; i++)
        {
            vector1[i] = random.nextInt(10)+1;
        }
        System.out.println(Arrays.toString(vector1));
        for (int i = 0; i < vector2.length; i++)
        {
            vector2[i] = random.nextInt(10)+1;
        }
        System.out.println(Arrays.toString(vector2));
        for (int i = 0; i < vector3.length; i++)
        {
            vector3[i] = vector1[i] + vector2[i];
        }
        System.out.println(Arrays.toString(vector3));
    }

    // Ejercicio 6
    // Queremos guardar los nombres y las edades de los alumnos de un curso. Realiza un
    // programa que introduzca el nombre y la edad de cada alumno.
    // El proceso de lectura de datos terminará cuando se introduzca como nombre un
    // asterisco (`*`). Al finalizar se mostrará:
    // *    - Todos los alumnos que son **mayores de edad**.
    // *    - El/los alumno/s de **mayor edad** .
    public static void ejercicio6()
    {
        boolean continuar = true;
        int indiceAlumnos = 0;
        String[] nombre = new String[1];
        int[] edad = new int[1];

        // INTRODUCIR DATOS DE LOS ALUMNOS
        while (continuar == true)
        {
            for (int i = indiceAlumnos; i < edad.length; i++)
            {
                // INTRODUCIR NOMBRE DEL ALUMNO
                System.out.println("Introduce la EDAD del alumno " + (i+1));
                int introducirEdad = keyboard.nextInt();
                keyboard.nextLine();
                edad[i] = introducirEdad;
                
                // INTRODUCIR EDAD DEL ALUMNO
                System.out.println("Introduce el NOMBRE del alumno " + (i+1));
                String introducirNombre = keyboard.nextLine();
                nombre[i] = introducirNombre;

                // CONTINUAR EL BUCLE
                System.out.println("¿Deseas continuar?");
                System.out.println("Pulsa * si es que NO. Pulsa cualquier otra tecla para continuar");
                String respuesta = keyboard.nextLine();
                if (respuesta.equals("*"))
                {
                    System.out.println("Fin");
                    continuar = false;
                }
                else if (respuesta != "*")
                {
                    indiceAlumnos++;
                    nombre = Arrays.copyOf(nombre, nombre.length+1);
                    edad = Arrays.copyOf(edad, edad.length+1);
                }
            }
        }

        // VER QUIEN ES EL MAYOR
        int edadMaxima = Integer.MIN_VALUE;
        int indice = 0;
        int indiceMayor = 0;
        String[] personaMayor = new String [0];
        String[] alumnosMayores = new String [0];
        for (int j = 0; j < edad.length; j++)
        {
            if (edad[j] > edadMaxima)
            {
                edadMaxima = edad[j];
                personaMayor = new String[1];
                personaMayor[0] = nombre[j];
                indiceMayor = 1;
            }
            else if (edad[j] == edadMaxima)
            {
                personaMayor = Arrays.copyOf(personaMayor, personaMayor.length+1);
                personaMayor[indiceMayor] = nombre[j];
                indiceMayor++;
            }

            if (edad[j] >= 18)
            {
                alumnosMayores = Arrays.copyOf(alumnosMayores, alumnosMayores.length+1);
                alumnosMayores[indice] = nombre[j];
                indice++;
            }
        }

        System.out.println("El alumno más mayor/es es : " + Arrays.toString(personaMayor));
        System.out.println("Los alumnos mayores de edad son: " + Arrays.toString(alumnosMayores));
    }

    // EJERCICIO 7
    // Queremos guardar la temperatura mínima y máxima de 5 días. Realiza un programa que
    // ofrezca la siguiente información:
    // * La temperatura media de cada día ⚖.
    // * Los días con la temperatura más baja .
    // * Se lee una temperatura por teclado y se muestran los días cuya temperatura
    // máxima coincide con ella. Si no existe ningún día, se muestra un mensaje
    // informativo.
    public static void ejercicio7()
    {
        
    }
}