import java.util.Scanner;

public class tabuada01 {
    public static void main(String[] args) {

        int numero;
        int soma;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o numero da tabuada desejada:");
        numero = sc.nextInt();
        for (int i = 0; i <= 10; i++) {

            soma = numero * i;

            System.out.println("tabuada" + i + ": " + soma);

        }
    }
}
