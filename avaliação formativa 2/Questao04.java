import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double soma = 0;
        double maior = notas[0];
        double menor = notas[0];
        int aprovados = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];

            if (notas[i] > maior) {
                maior = notas[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
            }
            if (notas[i] >= 7.0) {
                aprovados++;
            }
        }

        double media = soma / notas.length;

        System.out.println("\n--- Resultado ---");
        System.out.print("Notas: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");
        }
        System.out.println();

        System.out.println("Média: " + media);
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.println("Estudantes com nota >= 7.0: " + aprovados);

        scanner.close();
    }
}