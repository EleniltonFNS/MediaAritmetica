import java.util.Scanner;

/**
 *  Classe main - Coletar as notas e armazenar em um array, validando cada nota na
 * hora que for inserida, onde caso não seja uma nota válida, o sistema irá esperar
 * que seja inserida uma nota válida, após as notas coletadas será realizado o calcúlo
 * da média e por fim informa o estado de aprovação do aluno com base na sua média.
 */
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n -=-=-=- Sistema de Média -=-=-=- \n");

        Media media = new Media();

        double[] notas = new double[4]; // - Arreio para armazenar as notas.

        // - Loop para coletar as 4 notas.
        for (int i = 0; i < notas.length; i++) {
            boolean notaValida;

            do { // Loop para permitir que a nota apenas seja armazenada caso a nota esteja válida.
                System.out.print(" - Informe a " + (i + 1) + "° nota: ");
                double nota = entrada.nextDouble();

                notaValida = media.validarNota(nota); // - Valida a nota.

                if (notaValida) {
                    notas[i] = nota; // - Armazena a nota no arreio.
                } else {
                    System.out.println("\n - Nota invalida! Tente novamente!");
                }
            }while (!notaValida);
        }

        // - Calcular média.
        double mediaNota = media.fazerMediaNota(notas[0],notas[1],notas[2],notas[3]);

        // - Verificar aprovação
        boolean aprovacao = media.verificarAprovacao(mediaNota);

        // - Exibição dos resultados.
        System.out.println("\n -=-=- Resultados: ");

        System.out.printf("\n - Média: %.2f\n", mediaNota); // - Imprime a média
        System.out.print(" - Estado de Aprovação: " + (aprovacao ? "Aprovado" : "Reprovado") + "\n"); // - Imprime se o aluno foi aprovado ou não
    }
}