package com.example.tdd;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.example.tdd.service.BookingService;

@SpringBootTest
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
