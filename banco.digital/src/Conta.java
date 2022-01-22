package jaac.dio.banco;

import java.util.List;

public abstract class Conta implements ContaInterface {

    private List<Conta> contas;

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int contaNumero;
    protected double saldo;
    protected Cliente clienteNome;

    public Conta(Cliente clienteNome) {
        this.agencia = AGENCIA_PADRAO;
        this.contaNumero = SEQUENCIAL++;
        this.clienteNome = clienteNome;
    }

    protected void extrato() {
        System.out.println();
        System.out.printf("Agencia : %d\n", this.agencia);
        System.out.printf("c/c : %d", this.contaNumero);
        System.out.printf("\nsaldo: R$ %.2f", this.saldo);
        System.out.println();
        System.out.println(clienteNome);
    }
    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }


    public int getAgencia() {
        return agencia;
    }

    public int getContaNumero() {
        return contaNumero;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Conta> setContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }



}
