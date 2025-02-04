package Runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcSteps {

    private int num1;
    private int num2;
    private int result;
    private Calculator calculator;  // assuming there's a Calculator class to handle the addition

//
//    @Given("The two numbers are <num{int}> and <num{int}>")
//    public void the_Two_Numbers_Are_Num_And_Num(int num1, int num2) {
//
//
//        this.num1 = num1;
//        this.num2 = num2;
//        calculator = new Calculator();
//
//    }
    @When("I click on add")
    public void i_Click_On_Add() {
        result = calculator.add(num1, num2);  // Perform the addition
    }

    @Then("The result is {int}")
    public void the_Result_Is(int expectedResult) {
        assertEquals(expectedResult, result);  // Check if the result matches the expected value
    }


//    @io.cucumber.java.en.Given("The two numbers are <num{int}> and <num{int}>")
//    public void theTwoNumbersAreNumAndNum(int number1, int number2) {
//
//    }

    @io.cucumber.java.en.Given("The two numbers are {string} and {string}")
    public void theTwoNumbersAreAnd(String arg0, String arg1) {
        this.num1= Integer.parseInt(arg0);
        this.num2= Integer.parseInt(arg1);
        calculator=new Calculator();
        System.out.println("number 1 is "+num1);
        System.out.println("number 2 is  "+num2);

    }

   
}
