import java.util.Scanner;
public class App
    public static void main(String[] args) throws Exception 
    {
        //ejercicio1();
        //ejercicio2();
        ejercicio3();
        //ejercicio4();
        ejercicio5();
        ejercicio6();
    }

    // EJERCICIO 1
    public static void ejercicio1()
    {
        System.out.println("Introduce tu primer número, vamos a hacer una comparativa de numeros");
        Scanner keyboard = new Scanner(System.in);
        int primerComparativa = keyboard.nextInt();
        System.out.println("Muy bien, ahora introduce el segundo núero que usaremos en la comparación");
        int segundaComparativa = keyboard.nextInt();
        if (primerComparativa >= segundaComparativa)
        {
            System.out.println(primerComparativa + " > " + segundaComparativa);
        }
        else
        {
            System.out.println(primerComparativa + " < " + segundaComparativa);
        }
    }

    // EJERCICIO 2
    public static void ejercicio2()
    {
        System.out.println("Ahora vamos a averiguar si tu numero es par");
        Scanner keyboard = new Scanner(System.in);
        int numeroPar = keyboard.nextInt();
        if (numeroPar % 2 == 0)
        {
            System.out.println("Tu número es par");
        }
        else
        {
            System.out.println("Tu número es impar");
        }

    }

    public static void ejercicio3()
    {
        System.out.println("Ahora vas a escribir 2 número para dividirlos entre sí, si uno de los numeros es igual a 0, te daré error");
        Scanner keyboard = new Scanner(System.in);
        double restoNumero = keyboard.nextDouble();
        double restoNumero2 = keyboard.nextDouble();
        if (restoNumero == 0 || restoNumero2 == 0) 
        {
            System.out.println("Error, no se puede dividir entre cero");    
        }
        else
        {
            System.out.println("Correcto, tu resultado es: " + restoNumero/restoNumero2);
        }
    }

    public static void ejercicio4()
    {
        System.out.println("Ahora debes de darme dos números");
        Scanner keyboard = new Scanner(System.in);
        double numeroUno = keyboard.nextDouble();
        if (numeroUno >=0)
        {
            numeroUno = numeroUno;
        }
        else
        {
            numeroUno = 0;
        }
        double numeroDos = keyboard.nextDouble();
        double resultadoPotencia = Math.pow(numeroUno, numeroDos);
    }

    public static void ejercicio5()
    {
        System.out.println("Ahora vamos a crear un triángulo, y para ello, introducirás 3 números para cada uno de sus lados");
        Scanner keyboard = new Scanner(System.in);
        double cara1 = keyboard.nextDouble();
        double cara2 = keyboard.nextDouble();
        double cara3 = keyboard.nextDouble();
        //Vamos a averiguar si es un triángulo isosceles
        if (cara1 == cara2 && cara2 == cara3)
        {
            System.out.println("Tu triangulo es equilatero");
        }
        else if (cara1 == cara2 || cara2 == cara3 || cara1==cara3)
        {
            System.out.println("Tu triangulo es isosceles");
        }
        else
        {
            System.out.println("Tu triangulo es escaleno");
        }
    }
    
    public static void ejercicio6()
    {
        System.out.println("Un instituto está organizando un viaje, y necesitas escribir cuantos niños van a ir. numeros del 20 al 50 aproximadamente.");
        Scanner keyboard = new Scanner(System.in);
        int alumnos = keyboard.nextInt();
        int precio = 0;
        
        switch (alumnos/10) 
        {
            case 0:
                precio = 2000;
                break;
            case 1:
                precio = 2000;
                break;
            case 2:
                precio = 56*alumnos;
                break;
            case 3:
            case 4:
        }
    }