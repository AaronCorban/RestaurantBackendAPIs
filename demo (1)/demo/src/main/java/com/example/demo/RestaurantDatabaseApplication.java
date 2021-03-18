package com.example.demo;

import Entities.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import springbootrepository.BookingRepository;


@SpringBootApplication
public class RestaurantDatabaseApplication {
	public static void main(String[] args) {
		SpringApplication.run(RestaurantDatabaseApplication.class, args);
	}

}
