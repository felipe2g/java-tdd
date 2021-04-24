package com.example.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.tdd.service.BookingService;


@ExtendWith(SpringExtension.class)
public class BookingServiceTest {
	
	@TestConfiguration
	static class BookingServiceTestConfiguration{
		
		@Bean
		public BookingService bookingService() {
			return new BookingService();
		}
	}
	
	@Autowired
	BookingService bookingService;
	
	@Test
	public void bookingTestServiceDaysCalculator() {
		String name = "Felipe";
		int days = bookingService.daysCalculatorWithDatabase(name);
		
		Assertions.assertEquals(days, 10);
	}
	
}
