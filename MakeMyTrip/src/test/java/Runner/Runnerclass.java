package Runner;

import Base.Baseclass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( features ="src/test/java/Features/trip.feature",
                  glue ="StepDef")

public class Runnerclass extends Baseclass {

    @BeforeClass
    public static void driverlaunch(){
     web();
     impwait();
     maximize();

    }

    @AfterClass
    public static void back(){
     driver.close();
    }
}
