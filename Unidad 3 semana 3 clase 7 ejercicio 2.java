import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner Reader = new Scanner(System.in);
    int contador;
    int fin;
    System.out.println("Por favor ingrese el valor inicial (Contador)");
    contador = Reader.nextInt();
    System.out.println("Por favor ahora ingrese el valor final");
    fin = Reader.nextInt();
    while(contador <=fin){
    System.out.println("Valor actual de la interaccion"+contador);
    contador++;
    }
  }
}