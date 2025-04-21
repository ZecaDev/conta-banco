package exerciciodio.projeto.terminalconta;

import exerciciodio.projeto.domain.ImprimirConta;

import java.util.Scanner;

public class ContaTeminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe scanner
        //exibir as mensagens para o usuário
        //obter pela scanner os valores digitados no terminal
        //exibir a mensagem conta criada


        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = teclado.nextLine();
        System.out.print("Digite sua agencia: ");
        String agencia = teclado.nextLine();
        System.out.print("Digite sua conta: ");
        int conta = teclado.nextInt();

        
        ImprimirConta imprimirConta = new ImprimirConta(nome, agencia, conta, 3233.32);

        imprimirConta.imprime();
    }
}
