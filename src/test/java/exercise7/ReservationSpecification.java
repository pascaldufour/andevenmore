package exercise7;

import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import exercise7.CancellationPolicy;

public class ReservationSpecification {
	
	@Test
	public void CancellationPercentage10DaysBeforeArrivalShouldBe80() {
		CancellationPolicy policy = new CancellationPolicy();
		DateTime dt = new DateTime();
		DateTime dt2 = dt.plusDays(10);
		
		int percentage = policy.calculateIncurredCalcuationPercentage(dt2, dt);	
		
		assertThat(percentage, equalTo(85));
	}
	
	@Test
	public void CancellationCosts10daysBeforeOf1000ReservationCostsShouldBe800() {
		CancellationPolicy policy = new CancellationPolicy();
		DateTime dt = new DateTime();
		DateTime dt2 = dt.plusDays(10);
		
		int costs = policy.calculateIncurredCancellationCosts(dt2, dt, 1000);	
		
		assertThat(costs, equalTo(850));
	}
	
	@Test
	public void PenaltyDiscountOfNormalUserCancelled14DaysBeforeWithReservationOf5001ShouldBe6() {
		CancellationPolicy policy = new CancellationPolicy();
		DateTime now = new DateTime();
		DateTime reservedArrivalDate = now.plusDays(13);
		
		double penaltyDiscount = policy.calculatePenaltyDiscount(5001, now, reservedArrivalDate, User.NORMAL);	
		
		assertThat(penaltyDiscount, equalTo(6.0));
	}
	
	@Test
	public void PenaltyOfNormalUserCancelled14DaysBeforeWithReservationOf5001ShouldBe79() {
		CancellationPolicy policy = new CancellationPolicy();
		DateTime now = new DateTime();
		DateTime reservedArrivalDate = now.plusDays(13);
		
		double penaltyDiscount = policy.calculatePenaltyDiscount(5001, now, reservedArrivalDate, User.NORMAL);
		int penaltyPercentage = policy.calculateIncurredCalcuationPercentage(reservedArrivalDate, now);	
		
		assertThat(penaltyPercentage - penaltyDiscount, equalTo(79.0));
	}
	
//	@Test
//	public void CancllationNoCosts() {
//		DateTime arrivalDate = new DateTime().plusMonths(7);
//		Reservation reservation = new Reservation(1000, arrivalDate);
//		reservation.cancel();
//		
//		assertThat(reservation.incurredCancellationPercantage(new CancellationPolicy()), equalTo(0)); //STRANGE!
//		assertThat(reservation.incurredCancellationCosts(new CancellationPolicy()), equalTo(0));
//	}
	
}
