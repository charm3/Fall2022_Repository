package Helper;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="./Features/Hotels/HotelsSP_1.feature",
        glue="StepDefinations",
        dryRun=true,
        monochrome = true,
        tags = "@test6"  ,
        plugin= {"pretty","html:test-output",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

)

public class TestRunner {
}
