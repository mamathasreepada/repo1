package Runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\pavan\\eclipse-workspace\\Dummy\\src\\main\\java\\Features\\Demologinpage.feature"
		,glue={"Step"},
		monochrome= true
		//,tags = "@Smoke"
		)

public class runner {

}
