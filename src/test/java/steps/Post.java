// 1 - Pacote
package steps;

//2 - Bibliotecas
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertTrue;

//3 - Classe
public class Post extends Base{

    //3.1 - Atributos
    private Base base;// Instânciando a Classe Base

    //3.2 - Construtor
    public Post(Base base) {
        this.base = base;
    }

    @Dado("^que acesso a Wikipedia em Portugues$")
    public void queAcessoAWikipediaEmPortugues() {
        base.driver.get(base.url);// Abre o navegador no site alvo(extendendo da base)
    }

    @Quando("^pesquiso por \"([^\"]*)\"$")
    public void pesquisoPor(String produto) {
       base.driver.findElement(By.id("searchInput")).sendKeys(produto + Keys.ENTER);
    }

    @Entao("^exibe a expressao \"([^\"]*)\" no titulo da guia$")
    public void exibeAExpressaoNoTituloDaGuia(String produto) {
        assertTrue(base.driver.getTitle().contains(produto));
    }

}
