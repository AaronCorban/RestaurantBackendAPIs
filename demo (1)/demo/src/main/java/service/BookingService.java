package service;

import Entities.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springbootrepository.BookingRepository;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    //saves one booking
    public Booking saveBooking(Booking booking){
        return bookingRepository.save(booking);
    }

    //get bookings from database
    public List<Booking> getBookings(){
        return bookingRepository.findAll();
    }

    //get booking by id
    public Booking getBookingById(long bookingID){
        return bookingRepository.findById(bookingID).orElse(null);
    }

    //get booking by name
    public Booking getBookingByName(String customer_name){
        return bookingRepository.findByName(customer_name);
    }

    //delete booking by id
    public String deleteBooking(long bookingID){
        bookingRepository.deleteById(bookingID);
        return "Booking ID: "+ bookingID +" has been deleted";
    }

    //update booking
    public Booking updateBooking(Booking booking){
        Booking existingBooking=bookingRepository.findById(booking.getBookingID()).orElse(null);
        existingBooking.setCustomer_name(booking.getCustomer_name());
        existingBooking.setDate(booking.getDate());
        existingBooking.setTime(booking.getTime());
        existingBooking.setTable_ID(booking.getTable_ID());
        return bookingRepository.save(existingBooking);
    }

}
