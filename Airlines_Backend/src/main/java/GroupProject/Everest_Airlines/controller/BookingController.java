package GroupProject.Everest_Airlines.controller;

import GroupProject.Everest_Airlines.model.Booking;
import GroupProject.Everest_Airlines.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/bookings")
@CrossOrigin(origins = "http://localhost:4200") // Allow Angular frontend
public class BookingController {

    @Autowired
    private BookingRepository bookingRepository;

    // Get all bookings
    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    // Get booking by id
    @GetMapping("/{id}")
    public Optional<Booking> getBookingById(@PathVariable Long id) {
        return bookingRepository.findById(id);
    }

    // Create a new booking
    @PostMapping
    public Booking createBooking(@RequestBody Booking booking) {
        booking.setBookingDate(LocalDateTime.now());
        return bookingRepository.save(booking);
    }

    // Update a booking
    @PutMapping("/{id}")
    public Booking updateBooking(@PathVariable Long id, @RequestBody Booking updatedBooking) {
        return bookingRepository.findById(id).map(booking -> {
            booking.setPassengerName(updatedBooking.getPassengerName());
            booking.setFlightNumber(updatedBooking.getFlightNumber());
            booking.setEmail(updatedBooking.getEmail());
            booking.setSeatsBooked(updatedBooking.getSeatsBooked());
            return bookingRepository.save(booking);
        }).orElseThrow(() -> new RuntimeException("Booking not found with id " + id));
    }

    // Delete a booking
    @DeleteMapping("/{id}")
    public void deleteBooking(@PathVariable Long id) {
        bookingRepository.deleteById(id);
    }
}
