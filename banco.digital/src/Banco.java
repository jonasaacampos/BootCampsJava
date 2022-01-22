package jaac.dio.banco;

import java.util.Arrays;
import java.util.List;

public class Banco {
    public static void main(String[] args) {

        String clienteNome;
        List<Cliente> contas;

        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente();
        Cliente c4 = new Cliente();

        c1.setClienteNome("Paul");
        c2.setClienteNome("Joao");
        c3.setClienteNome("Gabi");
        c4.setClienteNome("Ana");

        contas = Arrays.asList(c1, c2, c3, c4);

        System.out.println("Clientes atuais do banco");
        for (Cliente conta : contas) {
            System.out.println(conta);
        }
        System.out.println("_______________");

        Conta contaCorrente = new ContaCorrente(c1);
        Conta contaPoupanca = new ContaPoupanca(c1);
        contaCorrente.depositar(10.00);
        contaCorrente.transferir(1, contaPoupanca);
        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

        Conta contaCorrente2 = new ContaCorrente(c2);
        contaCorrente2.imprimirExtrato();

        Conta contaCorrente3 = new ContaCorrente(c3);
        contaCorrente3.imprimirExtrato();

        Conta contaCorrente4 = new ContaCorrente(c4);
        contaCorrente4.imprimirExtrato();

    }

}
