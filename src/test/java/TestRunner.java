import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( features = "src/test/java/features/MakingPurshase.feature",
//src/test/java/features/MakingPurshase.feature
        //src/test/java/features/AddingAddress.feature
plugin ={"pretty"},
publish = true)
public class TestRunner {
}
