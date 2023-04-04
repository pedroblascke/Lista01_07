import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    //7- Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

    //OBS: para calcular a área de um quadrado, precisamos levar o lado do quadrado a potencia de 2. Portanto:
    
    //Entrada
    Double lado, area, respostaUsuario;
    Scanner teclado;
    teclado = new Scanner(System.in);
    System.out.println("Por favor, insira o valor do lado do quaadrado: ");
    lado = teclado.nextDouble();
    teclado.close();

    //Processamento
    area = (lado *lado);

    //Saída
    respostaUsuario = (area *2);
    System.out.println("O dobro desta área é de " + respostaUsuario);


    }

}
