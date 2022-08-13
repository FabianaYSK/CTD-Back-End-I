package tests;

import entities.Download;
import entities.Pessoa;
import entities.ServicoDownloadProxy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PessoaTest {
    Pessoa p1, p2;

    @BeforeEach
    void doBefore() {
        p1 = new Pessoa("Lívia", "Couto", 12345, "premium");
        p2 = new Pessoa("Júlia", "Bernardo", 54321, "free");
    }

    @Test
    public void musica1() {
        Download download = new ServicoDownloadProxy();
        download.baixarMusica(p1.getId(), p1.getTipoUsuario());
        System.out.println(p1);
    }

    @Test
    public void musica2() {
        Download download = new ServicoDownloadProxy();
        download.baixarMusica(p2.getId(), p2.getTipoUsuario());
        System.out.println(p2);
    }
}
