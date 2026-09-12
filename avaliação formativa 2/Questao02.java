import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de estudantes: ");
        int qtd = scanner.nextInt();

        System.out.println();

        double soma = 0;
        double maior = 0;
        double menor = 0;
        int aprovados = 0;

        for (int i = 1; i <= qtd; i++) {
            System.out.print("Nota do estudante " + i + ": ");
            double nota = scanner.nextDouble();

            soma += nota;

            if (i == 1) {
                maior = nota;
                menor = nota;
            } else {
                if (nota > maior) {
                    maior = nota;
                }
                if (nota < menor) {
                    menor = nota;
                }
            }

            if (nota >= 7.0) {
                aprovados++;
            }
        }

        double media = soma / qtd;

        System.out.println("\n--- Resultado ---");
        System.out.println("Média da turma: " + media);
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.println("Estudantes aprovados: " + aprovados);

        scanner.close();
    }
}