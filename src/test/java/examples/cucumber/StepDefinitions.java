package examples.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
    private int firstNumber;
    private int secondNumber;
    private int result;

    @Given("first number is {int} and second number is {int}")
    public void firstNumberIsAndSecondNumberIs(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @When("user executes sum function")
    public void userExecutesSumFunction() {
        result = firstNumber + secondNumber;
    }

    @Then("the sum is {int}")
    public void theSumIs(int expected) throws Exception {
        if (expected != result) {
            throw new Exception(String.format("result is %d and should be %d", result, expected));
        }
    }
}
