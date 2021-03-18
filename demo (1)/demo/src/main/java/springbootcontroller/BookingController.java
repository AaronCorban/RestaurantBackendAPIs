package springbootcontroller;

import Entities.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.BookingService;

import java.awt.print.Book;
import java.util.List;

@RestController
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @PostMapping("/addBooking")
    public Booking addBooking(@RequestBody Booking booking){
        return bookingService.saveBooking(booking);
    }

    @GetMapping("/bookings")
    public List<Booking> findAllBookings(){
        return bookingService.getBookings();
    }

    @GetMapping("/bookingById/{bookingID}")
    public Booking findBookingById(@PathVariable long bookingID){
        return bookingService.getBookingById(bookingID);

    }

    @GetMapping("/booking/{customer_name}")
    public Booking findBookingByName(String customer_name){
        return bookingService.getBookingByName(customer_name);

    }

    @PutMapping("/update")
    public Booking updateBooking(@RequestBody Booking booking){
        return bookingService.updateBooking(booking);
    }

    @DeleteMapping("/delete/{bookingID}")
    public String deleteBooking(@PathVariable long bookingID){
        return bookingService.deleteBooking(bookingID);
    }
}
