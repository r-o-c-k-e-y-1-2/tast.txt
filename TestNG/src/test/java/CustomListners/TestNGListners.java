package CustomListners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;


public class TestNGListners implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Starting test" + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test passed Sucessfuly" + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed" + result.getName());

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("TestSkipped" + result.getName());

    }
}
