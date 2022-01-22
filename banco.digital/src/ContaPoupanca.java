package jaac.dio.banco;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente clienteNome) {
        super(clienteNome);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("------ Extrato da Poupan\u00E7a --------");
        super.extrato();
    }

}
