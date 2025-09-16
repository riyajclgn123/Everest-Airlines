package GroupProject.Everest_Airlines.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String passengerName;
    private String flightNumber;
    private String email;
    private int seatsBooked;

    private LocalDateTime bookingDate;

    public Booking() {}

    public Booking(String passengerName, String flightNumber, String email, int seatsBooked, LocalDateTime bookingDate) {
        this.passengerName = passengerName;
        this.flightNumber = flightNumber;
        this.email = email;
        this.seatsBooked = seatsBooked;
        this.bookingDate = bookingDate;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getPassengerName() { return passengerName; }
    public void setPassengerName(String passengerName) { this.passengerName = passengerName; }

    public String getFlightNumber() { return flightNumber; }
    public void setFlightNumber(String flightNumber) { this.flightNumber = flightNumber; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public int getSeatsBooked() { return seatsBooked; }
    public void setSeatsBooked(int seatsBooked) { this.seatsBooked = seatsBooked; }

    public LocalDateTime getBookingDate() { return bookingDate; }
    public void setBookingDate(LocalDateTime bookingDate) { this.bookingDate = bookingDate; }
}
