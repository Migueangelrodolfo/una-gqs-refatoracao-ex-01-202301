    validacao.validacaoDasProximasPerguntas(mensagem,pessoa,erroTentativas,scanner);import java.util.Scanner;

class Programa {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean erroTentativas = false;
    Pessoa pessoa = new Pessoa();
    Mensagem mensagem = new Mensagem();
    Validacao validacao = new Validacao();

    System.out.println("\tRelatório Auxiliar de Controle de Infecções");

  pessoa.coletaNome(pessoa,scanner);
    pessoa.coletaIdade(pessoa,scanner);

      erroTentativas = mensagem.realizaPerguntaVacinaEmDia(pessoa,scanner);
    erroTentativas = mensagem.realizaPerguntaTeveSintomasRecenmente(pessoa,scanner);
    erroTentativas = mensagem.realizaPerguntaTeveContatoPessoasAssintomaticas(pessoa,scanner);
    erroTentativas = mensagem.realizaPerguntaEstaRetornandoViagemExterior(pessoa,scanner);

     validacao.validacaoDasProximasPerguntas(mensagem,pessoa,erroTentativas,scanner);

       validacao.calcularValidacaoFinal(pessoa, mensagem, erroTentativas);

    // scanner.close();
  }
}
