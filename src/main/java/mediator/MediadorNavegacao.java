package mediator;

public class MediadorNavegacao {
    private static MediadorNavegacao instancia = new MediadorNavegacao();

    private MediadorNavegacao() {}

    public static MediadorNavegacao getInstancia() {
        return instancia;
    }

    public String receberInformacaoPorto(String mensagem) {
        return "A Mediador da Navegacao receptou seu contato.\n"+
                "A decisao do porto esta descrita conforme mensagem a seguir.\n" +
                ">>" + Porto.getInstancia().receberInformacao(mensagem);
    }

    public String receberInformacaoFarol(String mensagem) {
        return "A Mediador da Navegacao receptou seu contato.\n"+
                "A decisao do farol esta descrita conforme mensagem a seguir.\n" +
                ">>" + Farol.getInstancia().receberInformacao(mensagem);
    }
}
