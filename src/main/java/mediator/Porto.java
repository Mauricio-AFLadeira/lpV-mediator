package mediator;

public class Porto implements Entidade{
    private static Porto instancia = new Porto();

    private Porto() {}

    public static Porto getInstancia() {
        return instancia;
    }

    public String receberInformacao(String mensagem) {
        return "O Porto decidiu sobre: " + mensagem;
    }

}
