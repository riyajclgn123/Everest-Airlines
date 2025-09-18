package GroupProject.Everest_Airlines.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pilots")

public class Pilot {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int pilotId;
    private int userId;
    private String licenseNumber;
    private int yearOfExperience;
    private String specialization;
    public Pilot() {}

    public Pilot(int userId, String licenseNumber, int yearOfExperience, String specialization) {
        this.userId = userId;
        this.licenseNumber = licenseNumber;
        this.yearOfExperience = yearOfExperience;
        this.specialization = specialization;

    }

    //getters and setters
    public int getPilotId() { return pilotId; }
    public void setPilotId(int pilotId) { this.pilotId = pilotId; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public String getLicenseNumber() { return licenseNumber; }
    public void setLicenseNumber(String licenseNumber) { this.licenseNumber = licenseNumber; }

    public int getYearOfExperience() { return yearOfExperience; }
    public void setYearOfExperience(int yearOfExperience) { this.yearOfExperience = yearOfExperience; }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }


}
