import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner entrada = new Scanner (System.in);

    int numero1; // primer número a comparar

    System.out.print("Escriba el primer entero: "); // indicador
    numero1 = entrada.nextInt(); //lee el primer número del usuario

    if (numero1 >= 100) {
        System.out.println("El numero " + numero1 + " es mayor o igual a 100");
    }
    else if (numero1 >= 50) {
        System.out.println("El numero " + numero1 + "es mayor o igual a 50 pero menor que 100");
    }
    else if (numero1 >= 0) {
        System.out.println("El numero " + numero1 + " es mayor o igual a 50 pero menor que 50");
    } else {
        System.out.println("El numero " + numero1 + " es menor que 0");
    }
  }
}