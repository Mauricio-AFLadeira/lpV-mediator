package mediator;

public class Navio {
    public String informarFarol(String mensagem) {
        return MediadorNavegacao.getInstancia().receberInformacaoFarol(mensagem);
    }
    public String informarPorto(String mensagem) {
        return MediadorNavegacao.getInstancia().receberInformacaoPorto(mensagem);
    }
}
