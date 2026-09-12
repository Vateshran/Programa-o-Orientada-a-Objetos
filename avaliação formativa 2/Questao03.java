import java.util.Scanner;

public class Questao03 {

    public static int quantidadeCaracteres(String texto) {
        return texto.length();
    }

    public static String formatarNome(String nome) {
        return nome.toUpperCase();
    }

    public static boolean contemSilva(String nome) {
        return nome.toLowerCase().contains("silva");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome completo: ");
        String nome = scanner.nextLine();

        int qtd = quantidadeCaracteres(nome);
        String nomeMaiusculo = formatarNome(nome);
        boolean silva = contemSilva(nome);

        System.out.println();
        System.out.println("Quantidade de caracteres: " + qtd);
        System.out.println("Nome em maiúsculas: " + nomeMaiusculo);
        System.out.println("Contém \"Silva\": " + silva);

        scanner.close();
    }
}