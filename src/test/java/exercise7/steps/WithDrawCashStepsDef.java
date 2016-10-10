package exercise7.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.PendingException;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;

import exercise5.BDDStyle;

public class WithDrawCashStepsDef {

	private BDDStyle atm = new BDDStyle();
		
    @Given("^the account has (\\d+) dollars in credit$")
    public void the_account_has_amount_dollars_in_credit(int inCredit) throws Throwable {
    	atm.dollarsInCredit(inCredit);

    }
        
    @Given("^given the dispenser contains (\\d+) dollars$")
    public void the_dispenser_contains_amount_dollars(int amountInDispenser) throws Throwable {
    	atm.dollarsInDispenser(amountInDispenser);
    }

    @When("^the customer withdraws (\\d+) dollars$")
    public void thw_customer_withdraws(int amountToWithdraw) throws Throwable {
    	atm.requestDollars(amountToWithdraw);
    }

    @Then("^ensure the account contains (\\d+) dollars")
    public void ensure_the_account_contains(int expectedAmount) throws Throwable {
    	assertThat(atm.accountSaldo(), equalTo(expectedAmount) ); 
    }

    @Then("^ensure the account contains -(\\d+) dollars$")
    public void ensure_the_account_contains_dollars(int expectedAmount) throws Throwable {
    	assertThat(atm.accountSaldo(), equalTo(expectedAmount) ); 
    }

    @Then("^ensure cash is dispensed from the dispenser$")
    public void ensure_cash_is_dispensed_from_the_dispenser() throws Throwable {
    	assertThat(atm.cashDispensed(), equalTo(true) ); 
    }
    
    @And("^ensure cas is dispensed from the dispenser$")
    public void ensure_cas_is_dispensed_from_the_dispenser() throws Throwable {
    	assertThat(atm.cashDispensed(), equalTo(true) ); 
    }
    
    @And("^the dispenser should have (\\d+) dollars$")
    public void the_dispenser_should_have(int amountAvailable) throws Throwable {
    	assertThat(atm.dispenserAmount(), equalTo(amountAvailable) ); 
    }    

}