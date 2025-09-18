package GroupProject.Everest_Airlines.model;
import jakarta.persistence.*;

import java.security.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table (name = "airports")

public class Airport {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int airportId;

    private String airportName;
    private String airportCode;
    private String city;
    private String country;
    private String state;
    private String zip;
    private String IATA;
    public Airport() {}

    public Airport(String airportName, String airportCode, String city, String country, String state, String zip, String IATA) {
        this.airportName = airportName;
        this.airportCode = airportCode;
        this.city = city;
        this.country = country;
        this.state = state;
        this.zip = zip;
        this.IATA = IATA;
    }

    //getters and setters
    public int getAirportId() { return airportId; }
    public void setAirportId(int airportId) { this.airportId = airportId; }

    public String getAirportName() { return airportName; }
    public void setAirportName(String airportName) { this.airportName = airportName; }

    public String getAirportCode() { return airportCode; }
    public void setAirportCode(String airportCode) { this.airportCode = airportCode; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public String getZip() { return zip; }
    public void setZip(String zip) { this.zip = zip; }

    public String getIATA() { return IATA; }
    public void setIATA(String IATA) { this.IATA = IATA; }

}
