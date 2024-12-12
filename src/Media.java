/**
 *  Classe para calcular a média e verificar o estado de aprovação da média.
 *  Fornece métodos para calcular a média aritmética das 4 notas informadas,
 * e verifica se o aluno que tirou essas notas foi aprovado ou não.
 *
 * @author Elenilton Silva
 * @version 1.0
 * @since 2024
 */
public class Media {
    /**
     * - Método para calcular a média aritmética das quatro notas fornecidas.
     *
     * @param nota1 Primeira nota informada.
     * @param nota2 Segunda nota informada.
     * @param nota3 Terceira nota informada.
     * @param nota4 Quarta nota informada.
     * @return Resultado da divisão entre a soma de todas as notas por quatro.
     */
    public double fazerMediaNota(double nota1, double nota2, double nota3, double nota4){
        return ((nota1+nota2+nota3+nota4)/4);
    }

    /**
     * - Método para verificar se o aluno está aprovado com base na média calculada.
     *
     * @param media A média aritmética calculada a partir das notas.
     * @return {@code true} se a média for maior ou igual a 6.0, caso contrário, {@code false}.
     */
    public boolean verificarAprovacao (double media){
        return media >= 6.0;
    }

    /**
     * - Método para validar se a nota está dentro do intervalo aceitável de 0 a 10.
     *
     * @param nota Nota informada pelo úsuario.
     * @return {@code true} se a nota estiver entre 0.0 e 10.0, caso contrário, {@code false}.
     */
    public boolean validarNota (double nota){
        return nota >= 0.0 && nota <= 10.0;
    }
}
