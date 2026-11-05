import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception 
    {
        //Suma(1, 2);
        //holaMundo();
        //eco(3);
        //mostrarIntermedios(1, 90);
        //areaCirculo(9);
        //comparacionNumeros(9, 2);
        //mostrar();
        buscar(new int[]{1,2, 3, 4, 5, 6, 7, 8, 9, 10}, 9);
    }

    // 1. REALIZA UNA SUMA ENTRE LOS NUMEROS "numero1" Y "numero2" //
    //-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-//
    public static void Suma(int numero1, int numero2)
    {
        int total = numero1 + numero2;
        System.out.println(total);
    }

    // 2. HOLA MUNDO //
    //-_-_-_-_-_-_-_-//
    public static void holaMundo()
    {
        System.out.println("Hola mundo");
    }

    // 3. REPITE LAS COSAS "ecoVeces" VECES //
    //-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_//
    public static void eco(int ecoVeces)
    {
        for (int i = 0; i < ecoVeces; i++)
        {
            System.out.println("ECO");
        }
    }

    // 4. PROGRAMA PARA MOSTRAR LOS NUMEROS PARES ENTRE LOS NUMEROS "a" Y "b".//
    //-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-//
    public static void mostrarIntermedios(int a, int b)
    {
        if (a < b)
        {
            int numero = a;
            for (int i = 0; i < b; i++)
            {
                if (numero%2 == 0)
                {
                    System.out.print(" " + numero);
                }
                numero++;

            }
            System.out.print("\n");
        }
        else if (a > b)
        {
            System.out.println("ERROR: A es mayor que B");
        }
    }

    // 5. CALCULA EL AREA DE UN CIRCULO (LA VARIABLE "radio" ALMACENA EL RADIO).//
    //-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-//
    public static void areaCirculo(double radio)
    {
        double areaCirculo = Math.PI * radio * 2;
        System.out.println("El area del circulo es " + areaCirculo);
    }

    // 6. COMPARACION DE DOS NUMEROS "a" Y "b" //
    //-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-//
    public static void comparacionNumeros(int a, int b)
    {
        if (a >= b)
        {
            System.out.println("El número " + a + " es mayor que " + b);
        }
        else if ( b >= a)
        {
            System.out.println("El número" + b + " es mayor que " + a);
        }
    }

    // 7. ARRAY BIDIMENSIONAL MOSTRADO POR CONSOLA //
    //-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-//
    public static void mostrar()
    {
        // Creamos un array de 2 valores (por eso se incluye dos veces "[]")
        int arrayBidimensional[][] =
        {
            {1, 2, 3},
            {4, 5, 6}
        };

        for (int i = 0; i < arrayBidimensional.length; i++)
        {
            for (int j = 0; j < arrayBidimensional[i].length; j++)
            {
                System.out.print(arrayBidimensional[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 8. //
    //-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-//
    public static void buscar(int array[], int elementoBuscado)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(i);
            if (array[i] == elementoBuscado)
            {
                System.out.printf("\nTu número: " + i + " ha sido encontrado\n");
                break;
            }
        }
        System.out.println("Final de la búsqueda");
    }
}
