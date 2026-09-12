public class Questao06 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Ana Souza", "20260001", "Ciência da Computação");

        System.out.println("--- Dados iniciais ---");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Curso: " + aluno.getCurso());

        System.out.println("\nAlterando o curso...");
        aluno.setCurso("Sistemas de Informação");
        System.out.println("Curso alterado com sucesso.");

        System.out.println("\nTentando alterar o nome para vazio...");
        aluno.setNome("");

        System.out.println("\n--- Dados finais ---");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Curso: " + aluno.getCurso());
    }
}