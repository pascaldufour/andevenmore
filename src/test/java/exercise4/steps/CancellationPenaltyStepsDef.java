package exercise4.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.PendingException;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.joda.time.DateTime;

import exercise7.CancellationPolicy;
import exercise7.User;

import java.util.List;

public class CancellationPenaltyStepsDef {
	
	CancellationPolicy policy = new CancellationPolicy();;
	User user;
	int reservationFee;
	int canceledDaysBeforeArrival;
		
	@Given("^a normal customer$")
	public void a_normal_customer() throws Throwable {
		user = User.NORMAL;
	}

	@Given("^given a reservation fee of (\\d+) dollars$")
	public void given_a_reservation_fee_of_dollars(int givenFee) throws Throwable {
		reservationFee = givenFee;
	}

	@When("^the customer cancels (\\d+) days before arrival date$")
	public void the_customer_cancels_days_before_arrival_date(int days) throws Throwable {
		canceledDaysBeforeArrival = days;
	}

	@Then("^ensure the cancellation penalty is (\\d+\\.\\d+) dollars$")
	public void ensure_the_cancellation_penalty_is_dollars(double penalty) throws Throwable {
		DateTime now = new DateTime();
		DateTime reservedArrivalDate = now.plusDays(canceledDaysBeforeArrival);

		double cancellationPenalty = policy.calculateCancellationPenalty(reservationFee, now, reservedArrivalDate, user);
		
		assertThat(cancellationPenalty, equalTo(penalty));
	}	
	
}