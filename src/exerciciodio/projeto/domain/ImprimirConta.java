package exerciciodio.projeto.domain;

public class ImprimirConta {
    String nome;
    String agencia;
    int conta;
    double saldo;

    public ImprimirConta(String nome, String agencia, int conta, double saldo) {
        this.nome = nome;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }

    public void imprime(){
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$" + saldo + " já está disponível para saque");
    }
}
