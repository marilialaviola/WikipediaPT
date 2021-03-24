// 1 - Pacote
package steps;

// 2 - Bibliotecas
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

//3 - Anotações para o Runner funcionar
@RunWith(Cucumber.class) // Associação
@CucumberOptions(
        dryRun = false,
        monochrome = false,                        //maneira de formatar o log
        features = "src/test/resources/features", //onde estão as features
        glue = "steps",                           //onde estão os passos
        plugin = {
                "pretty",                               // formatador padrão do runner
                "html:target/relatorioSimples",         //pasta que será criada de html
                "json:target/relatorioSimples.json",    // saida json
                "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/dashboard.html"
        }
)

//4- Classe
public class Runner {

}
