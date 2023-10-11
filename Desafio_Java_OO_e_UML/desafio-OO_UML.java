public class iPhone {
    private String modelo;
    private int anoLancamento;

    public iPhone(String modelo, int anoLancamento) {
        this.modelo = modelo;
        this.anoLancamento = anoLancamento;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
}

// Interface ReprodutorMusical
public interface ReprodutorMusical {
    void play();
    void pause();
    void stop();
    void skipTrack();
}

// Interface AparelhoTelefonico
public interface AparelhoTelefonico {
    void fazerChamada(String numero);
    void receberChamada(String chamador);
    void enviarMensagem(String destinatario, String mensagem);
}

// Interface NavegadorInternet
public interface NavegadorInternet {
    void abrirURL(String url);
    void navegarHistorico();
    void fecharNavegador();
}
