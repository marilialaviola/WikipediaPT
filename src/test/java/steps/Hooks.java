// 1 - Pacote
package steps;

//2 - Bibliotecas
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

//3 - Classe
public class Hooks extends Base{
    private Base base;

    public Hooks(Base base) {
        this.base = base;
    }

    @Before         //iniciar
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/88/chromedriver.exe");//onde está o chromedriver
        base.driver = new ChromeDriver(); // Instanciou o Selenium como Chrome

        base.driver.manage().window().maximize();//Maximizar a janela do navegador
        base.driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS); //Timeout
    }
    @After          //finalizar
    public void tearDown(){
        base.driver.quit();
    }
}
