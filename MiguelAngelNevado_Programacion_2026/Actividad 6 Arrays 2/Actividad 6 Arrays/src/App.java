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
        //ejercicio6();
        //ejercicio7();
        //ejercicio8();
        //ejercicio9();
        ejercicio10();
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
    public static int temperaturaMinima(int[][] temperaturas)
    {
        int tempMinima = temperaturas[0][0];
        for(int i=0;i<temperaturas.length;i++)
        {
            if(temperaturas[i][0]<tempMinima)
            {
                tempMinima = temperaturas[i][0];
            }
        }
        return tempMinima;
    }

    public static int temperaturaMaxima(int[][] temperaturas)
    {
        int tempMaxima = temperaturas[0][1];
        for(int i=0;i<temperaturas.length;i++)
        {
            if(temperaturas[i][1]> tempMaxima)
            {
                tempMaxima = temperaturas[i][1];
            }
        }
        return tempMaxima;
    }

    public static void ejercicio7()
    {
        String[] diaSemana = {"Lunes", "Martes", "Miércoles", "Jueves", 
                             "Viernes", "Sábado", "Domingo"};
        int[][] temperaturas = new int[7][2];

        for(int i=0; i<temperaturas.length;i++)
        {
            System.out.println("Introduzca la temperatura mínima del día " + diaSemana[i]);
            int tempMinima = keyboard.nextInt();
            System.out.println("Introduzca la temperatura máxima del día " + diaSemana[i]);
            int tempMaxima = keyboard.nextInt();
            temperaturas[i][0] = tempMinima;
            temperaturas[i][1] = tempMaxima;
        }

        System.out.println("Introduzca una temperatura");
        int tempTeclado = keyboard.nextInt();
        boolean controlMax = false;
        for(int i=0; i<temperaturas.length;i++)
        {
            int tempTotalDia = 0;
            for(int j=0;j<temperaturas[i].length;j++)
            {
                tempTotalDia = tempTotalDia + temperaturas[i][j];
            }
            
            int tempMedia = tempTotalDia/2;
            System.out.println("La temperatura media del " + diaSemana[i] + " es " + tempMedia);
            
            if(temperaturas[i][0] == temperaturaMinima(temperaturas))
            {
                System.out.println("El día " + diaSemana[i] + " tiene temperatura mínima");
            }

            if(temperaturas[i][1] == temperaturaMaxima(temperaturas) && temperaturas[i][1] == tempTeclado)
            {
                System.out.println("El día " + diaSemana[i] + " tiene temperatura máxima y coincide con la del teclado");
                controlMax = true;
            }
        }

        if(!controlMax){
            System.out.println("Ningún día tiene temperatura máxima que coincida con la del teclado");
        }
    }

    // EJERCICIO 8
    // Diseña el algoritmo para un programa que:
    //      1. Cree una tabla bidimensional (matriz) de 5x5 llamada `matriz`.
    //      2. Cargue la tabla con valores numéricos enteros.
    //      3. **Sume todos los elementos de cada fila y todos los elementos de cada
    //      columna**, visualizando los resultados en pantalla.
    public static void ejercicio8()
    {
        int[][] matriz = new int[5][5];
        for (int y = 0; y < matriz.length; y++)
        {
            for (int x = 0; x < matriz[y].length; x++)
            {
                matriz[y][x] = random.nextInt(9)+1;
            }
        }

        // MOSTRAR MATRIZ
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz[i].length; j++)
            {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        // SUMAR FILAS
        for (int i = 0; i < matriz.length; i++)
        {
            int sumaFilas = 0;
            for (int j = 0; j < matriz[i].length; j++)
            {
                sumaFilas += matriz[i][j];
            }
            System.out.println("Fila " + (i+1) + ": " + sumaFilas);
        }
        System.out.println();

        // SUMAR COLUMNAS
        for (int j = 0; j < matriz.length; j++)
        {
            int sumaFilas = 0;
            for (int i = 0; i < matriz[j].length; i++)
            {
                sumaFilas += matriz[i][j];
            }
            System.out.println("Columna " + (j+1) + ": " + sumaFilas);
        }
    }

    // EJERCICIO 9
    // Diseña el algoritmo para un programa que:
    //      1. Cree una tabla bidimensional de 5x5 llamada `diagonal`.
    //      2. Cargue la tabla de forma que los componentes de la **diagonal principal** tomen
    //      el valor `1` y el resto el valor `0`.
    //      3. Muestre el contenido de la tabla en pantalla.
    public static void ejercicio9()
    {
        int[][] diagonal = new int[5][5];
        for (int i = 0; i < diagonal.length; i++)
        {
            for (int j = 0; j < diagonal[i].length; j++)
            {
                if (diagonal[j] == diagonal[i])
                {
                    diagonal[i][j] = random.nextInt(2);
                }
                else
                {
                    diagonal[i][j] = random.nextInt(9)+1;
                }
            }
        }

        // MOSTRAR MATRIZ
        for (int i = 0; i < diagonal.length; i++)
        {
            for (int j = 0; j < diagonal[i].length; j++)
            {
                System.out.print(diagonal[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    // EJERCICIO 10
    // Diseña el algoritmo para un programa que:
    //      1. Cree una tabla bidimensional de 5x15 llamada `marco`.
    //      2. Cargue la tabla con ceros y unos para que se dibuje un **marco**. El valor `1`
    //      debe ocupar las posiciones más externas, y el resto de los elementos (`0`) deben
    //      quedar en el interior.
    //      3. Visualice el contenido de la matriz en pantalla, que debería tener este
    //      aspecto:
    //      
    //      111111111111111
    //      100000000000001
    //      100000000000001
    //      100000000000001
    //      111111111111111
    public static void ejercicio10()
    {
        int[][] marco = new int[5][15];
        for (int i = 0; i < marco.length; i++)
        {
            for (int j = 0; j < marco[i].length; j++)
            {
                marco[0][j] = 1;
                marco[i][0] = 1;
                marco[i][marco[0].length-1] = 1;
                marco[marco.length-1][j] = 1;
            }
        }

        // MOSTRAR MATRIZ
        for (int i = 0; i < marco.length; i++)
        {
            for (int j = 0; j < marco[i].length; j++)
            {
                System.out.print(marco[i][j]);
            }
            System.out.println();
        }
        System.out.println();

    }
}
 