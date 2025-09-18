package GroupProject.Everest_Airlines.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table (name = "flights")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int flightId;

    private String flightNumber;
    private String planeNumber;
    private String departureLocation;
    private String arrivalLocation;
    private LocalDateTime departureDateTime;
    private LocalDateTime arrivalDateTime;
    private LocalDateTime layoverDateTime;
    private String pilotNumber;
    private String pilotName;
    private String flightType;
    private String flightClass;
    private int flightPrice;
    private String seatNumber;
    private String duration;
    private String status;
    private boolean isAvailable;
    private int requiredFuelConsumption;
    private Double distance;

    public Flight() {}

    public Flight(String flightNumber, String planeNumber,String departureLocation, String arrivalLocation, LocalDateTime departureDateTime, LocalDateTime arrivalDateTime,
                  LocalDateTime layoverDateTime, String pilotNumber, String pilotName, String flightType, String flightClass, int flightPrice,
                  String seatNumber, String duration, String status, boolean isAvailable, int requiredFuelConsumption, Double distance) {
        this.flightNumber = flightNumber;
        this.planeNumber = planeNumber;
        this.departureLocation = departureLocation;
        this.arrivalLocation = arrivalLocation;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.layoverDateTime = layoverDateTime;
        this.pilotNumber = pilotNumber;
        this.pilotName = pilotName;
        this.flightType = flightType;
        this.flightClass = flightClass;
        this.flightPrice = flightPrice;
        this.seatNumber = seatNumber;
        this.duration = duration;
        this.status = status;
        this.isAvailable = isAvailable;
        this.requiredFuelConsumption = requiredFuelConsumption;
        this.distance = distance;
    }

//    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")

    //getters and setters
    public int getFlightId() { return flightId; }
    public void setFlightId(int flightId) { this.flightId = flightId; }

    public String getFlightNumber() { return flightNumber; }
    public void setFlightNumber(String flightNumber) { this.flightNumber = flightNumber; }

    public String getPlaneNumber() { return planeNumber; }
    public void setPlaneNumber(String planeNumber) { this.planeNumber = planeNumber; }

    public String getDepartureLocation() { return departureLocation; }
    public void setDepartureLocation(String departureLocation) { this.departureLocation = departureLocation;}

    public String getArrivalLocation() { return arrivalLocation; }
    public void setArrivalLocation(String arrivalLocation) { this.arrivalLocation = arrivalLocation; }

    public LocalDateTime getDepartureDateTime() { return departureDateTime; }
    public void setDepartureDateTime(LocalDateTime departureDateTime) { this.departureDateTime = departureDateTime; }

    public LocalDateTime getArrivalDateTime() { return arrivalDateTime; }
    public void setArrivalDateTime(LocalDateTime arrivalDateTime) { this.arrivalDateTime = arrivalDateTime; }

    public LocalDateTime getLayoverDateTime() { return layoverDateTime; }
    public void setLayoverDateTime(LocalDateTime layoverDateTime) { this.layoverDateTime = layoverDateTime; }

    public String getPilotNumber() { return pilotNumber; }
    public void setPilotNumber(String pilotNumber) { this.pilotNumber = pilotNumber; }

    public String getPilotName() { return pilotName; }
    public void setPilotName(String pilotName) { this.pilotName = pilotName; }

    public String getFlightType() { return flightType; }
    public void setFlightType(String flightType) { this.flightType = flightType; }

    public String getFlightClass() { return flightClass; }
    public void setFlightClass(String flightClass) { this.flightClass = flightClass; }

    public int getFlightPrice() { return flightPrice; }
    public void setFlightPrice(int flightPrice) { this.flightPrice = flightPrice; }

    public String getSeatNumber() { return seatNumber; }
    public void setSeatNumber(String seatNumber) { this.seatNumber = seatNumber; }

    public String getDuration() { return duration; }
    public void setDuration(String duration) { this.duration = duration; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public boolean getAvailable() { return isAvailable; }
    public void setAvailable(boolean isAvailable) { this.isAvailable = isAvailable; }

    public int getRequiredFuelConsumption() { return requiredFuelConsumption; }
    public void setRequiredFuelConsumption(int requiredFuelConsumption) { this.requiredFuelConsumption = requiredFuelConsumption; }

    public Double getDistance() { return distance; }
    public void setDistance(Double distance) { this.distance = distance; }


}
