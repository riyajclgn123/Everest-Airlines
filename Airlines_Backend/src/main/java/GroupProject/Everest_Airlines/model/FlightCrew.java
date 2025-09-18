package GroupProject.Everest_Airlines.model;

import jakarta.persistence.*;

@Entity
@Table(name = "flightcrews")

public class FlightCrew {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int flightCrewId;

    private int flightId;
    private int userId;
    private String role;
    public FlightCrew() {}

    public FlightCrew(int flightId, int userId, String role) {
        this.flightId = flightId;
        this.userId = userId;
        this.role = role;

    }

    //getters and setters
    public int getFlightCrewId() { return flightCrewId;    }
    public void setFlightCrewId(int flightCrewId) { this.flightCrewId = flightCrewId; }

    public int getFlightId() { return flightId;     }
    public void setFlightId(int flightId) { this.flightId = flightId; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }



}
