package mediator;

public class Farol implements Entidade{
    private static Farol instancia = new Farol();

    private Farol() {}

    public static Farol getInstancia() {
        return instancia;
    }

    public String receberInformacao(String mensagem) {
        return "O Farol decidiu sobre: " + mensagem;
    }
}
