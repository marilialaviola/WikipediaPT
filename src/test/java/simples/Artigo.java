// 1 - Pacote
package simples;

// 2 - Bibliotecas
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


// 3 - Classe
public class Artigo {
    //3.1 - Atributos
    String url;
    WebDriver driver;

    @Before                 //Antes do teste
    public void iniciar(){
        url = "https://pt.wikipedia.org/";
        //Onde está o Chrome Driver
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/88/chromedriver.exe");
        driver = new ChromeDriver(); // Instanciar o Selenium como Chrome

        driver.manage().window().maximize();//Maximizar a janela do navegador
        driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);//Espera implicita
    }
    @Test                    //Durante o teste
    public void consultarArtigo(){
        //Abrir o site
        driver.get(url);

        //Pesquisar por "Ovo de Páscoa" e apertar enter
        //driver.findElement(By.id("searchInput")).sendKeys(Keys.chord("Ovo de Páscoa") + Keys.ENTER);

        // Pesquisar por "Ovo de Páscoa" e clicar na lupa
        driver.findElement(By.id("searchInput")).sendKeys("Ovo de Páscoa");
        driver.findElement(By.cssSelector("button.wvui-button")).click(); // Clica na lupa

        //Validar o titulo da pagina de retorno
        // assertEquals("Resultados da pesquisa de Ovos da Pásco ? Wikipédia, a enciclopédia livre", driver.getTitle());
        assertTrue(driver.getTitle().contains("Ovo de Páscoa"));

    }
    @After                    //Final do teste
    public void finalizar(){
        driver.quit();
    }

}
