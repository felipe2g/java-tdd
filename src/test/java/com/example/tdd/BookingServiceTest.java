package com.example.tdd;



import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

@ExtendWith(SpringExtension.class)

public class BookingServiceTest {

	@Autowired
	BookingService bookingService;
	
	@Test
	public void bookingTestServiceDaysCalculator() {
		String name = "Felipe";
		int days = bookingService.daysCalculatorWithDatabase(name);
		
		Assertions.assertEquals(days, 10);
	}
	
}
