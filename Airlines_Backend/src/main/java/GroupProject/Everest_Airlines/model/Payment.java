package GroupProject.Everest_Airlines.model;

import jakarta.persistence.*;

import java.security.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "payments")

public class Payment {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int paymentId;
    private int bookingId;
    private int userId;
    private int flightId;
    private int seatId;
    private Timestamp bookingDate;
    private LocalDateTime paymentDate;
    private double amount;
    private String method;
    private Long cardNumber;
    private int cvvCode;
    private Date expiryDate;
    private String  status;
    public Payment() {}

    public Payment(LocalDateTime paymentDate, double amount, String method, Long cardNumber, int cvvCode, Date expiryDate, int bookingId, int userId, int flightId, int seatId, Timestamp bookingDate, String status) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.flightId = flightId;
        this.seatId = seatId;
        this.bookingDate = bookingDate;
        this.status = status;
        this.paymentDate = paymentDate;
        this.amount = amount;
        this.method = method;
        this.cardNumber = cardNumber;
        this.cvvCode = cvvCode;
        this.expiryDate = expiryDate;


    }

    //getters and setters

    public int getPaymentId() { return paymentId; }
    public void setPaymentId(int paymentId) { this.paymentId = paymentId; }

    public int getBookingId() { return bookingId; }
    public void setBookingId(int bookingId) { this.bookingId = bookingId; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public int getFlightId() { return flightId; }
    public void setFlightId(int flightId) { this.flightId = flightId; }

    public int getSeatId() { return seatId; }
    public void setSeatId(int seatId) { this.seatId = seatId; }

    public Timestamp getBookingDate() { return bookingDate; }
    public void setBookingDate(Timestamp bookingDate) { this.bookingDate = bookingDate; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Long getCardNumber() { return cardNumber; }
    public void setCardNumber(Long cardNumber) { this.cardNumber = cardNumber; }

    public Date getExpiryDate() { return expiryDate; }
    public void setExpiryDate(Date expiryDate) { this.expiryDate = expiryDate; }

    public String getMethod() { return method; }
    public void setMethod(String method) { this.method = method; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public int getCvvCode() { return cvvCode; }
    public void setCvvCode(int cvvCode) { this.cvvCode = cvvCode; }

    public LocalDateTime getPaymentDate() { return paymentDate; }
    public void setPaymentDate(LocalDateTime paymentDate) { this.paymentDate = paymentDate;}

}
