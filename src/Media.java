/**
 *  Classe para calcular a média e verificar o estado de aprovação da média.
 *  Fornece métodos para calcular a média aritmética das 4 notas informadas,
 * e verifica se o aluno que tirou essas notas foi aprovado ou não.
 */
public class Media {
    /**
     * - Método para calcular a média aritmética das quatro notas fornecidas.
     *
     * @param nota1 Primeira nota informada
     * @param nota2 Segunda nota informada
     * @param nota3 Terceira nota informada
     * @param nota4 Quarta nota informada
     * @return Retorna o resultado da divisão entre a soma de todas as notas por quatro.
     */
    public double fazerMediaNota(double nota1, double nota2, double nota3, double nota4){
        return ((nota1+nota2+nota3+nota4)/4);
    }

    /**
     * - Método para validar o estado de aprovação do aluno, tendo como média mínima exigida 6,0.
     *
     * @param media Média aritmética já calculada
     * @return Retorna {@code true} caso o aluno seja aprovado e {@code false} caso o aluno não seja
     */
    public boolean verificarAprovacao (double media){
        return media >= 6.0;
    }

    /**
     * - Método para validar se a nota é válida de 0 a 10.
     *
     * @param nota Nota informada pelo úsuario
     * @return Retorna {@code true} caso a nota seja válida {@code false} caso ela seja inválida
     */
    public boolean validarNota (double nota){
        return nota >= 0.0 && nota <= 10.0;
    }
}
