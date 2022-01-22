package jaac.dio.banco;

public class Cliente {

    private String clienteNome;

    public String getClienteNome()
    {
        return clienteNome;
    }

    public void setClienteNome(String clienteNome)
    {
        this.clienteNome = clienteNome;
    }

    @Override
    public String toString() {
        return clienteNome;
    }

}

