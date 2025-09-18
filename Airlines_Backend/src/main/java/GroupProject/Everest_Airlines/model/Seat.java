package GroupProject.Everest_Airlines.model;

import jakarta.persistence.*;

@Entity
@Table(name = "seats")

public class Seat {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int seatId;

    private int flightId;
    private int seatNumber;
    private String seatClass;
    private Boolean isBooked;
    public Seat() {}

    public Seat(int flightId, int seatNumber, String seatClass, Boolean isBooked) {
        this.flightId = flightId;
        this.seatNumber = seatNumber;
        this.seatClass = seatClass;
        this.isBooked = isBooked;
    }

    //getters and setters

    public int getSeatId() { return seatId; }
    public void setSeatId(int seatId) { this.seatId = seatId; }

    public int getFlightId() { return flightId; }
    public void setFlightId(int flightId) { this.flightId = flightId; }

    public int getSeatNumber() { return seatNumber; }
    public void setSeatNumber(int seatNumber) { this.seatNumber = seatNumber; }

    public String getSeatClass() { return seatClass; }
    public void setSeatClass(String seatClass) { this.seatClass = seatClass; }

    public Boolean getIsBooked() { return isBooked; }
    public void setIsBooked(Boolean isBooked) { this.isBooked = isBooked; }

}
