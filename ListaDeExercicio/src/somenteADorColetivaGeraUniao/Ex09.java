package somenteADorColetivaGeraUniao;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        while (true) {
            System.out.print("Digite um n�mero (digite 0 para parar): ");
            int numero = leia.nextInt();
            if (numero == 0) {
                System.out.println("Loop encerrado.");
                break;
            }
            System.out.printf("Voc� digitou: %d%n", numero);
        }
        leia.close();
    }
}
