import model.Lance;
import model.Leilao;
import model.Usuario;


import org.junit.Assert;
import org.junit.jupiter.api.Test;
import service.Avaliador;

public class TesteDoAvaliador {
    @Test
    public void main() throws Exception {
        Usuario joao = new Usuario("Joao");
        Usuario jose= new Usuario("jose");
        Usuario maria = new Usuario("maria");

        Leilao leilao = new Leilao("Playstation 3 novo");
        leilao.propoe(new Lance(joao, 250.0));
        leilao.propoe(new Lance(jose, 300.0));
        leilao.propoe(new Lance(maria, 400.0));

        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);
        double maiorEsperado = 400;
        double menorEsperado = 250;
        System.out.println(leiloeiro.getMaiorLance());
        Assert.assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);
        System.out.println(leiloeiro.getMenorLance());
        Assert.assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.00001);
    }
}
