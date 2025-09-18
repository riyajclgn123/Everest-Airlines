package GroupProject.Everest_Airlines.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;


@Entity
@Table (name = "technicians")

public class Technician {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int technicianId;

    private String technicianName;
    private String technicianAddress;
    private String technicianEmail;
    private String technicianPhone;
    private int yearsOfExperience;
    private String technicianType;
    private String technicianStatus;
    public Technician() {}

    public Technician(String technicianName, String technicianAddress, String technicianEmail, String technicianPhone, int yearsOfExperience, String technicianType, String technicianStatus) {
        this.technicianName = technicianName;
        this.technicianAddress = technicianAddress;
        this.technicianEmail = technicianEmail;
        this.technicianPhone = technicianPhone;
        this.yearsOfExperience = yearsOfExperience;
        this.technicianType = technicianType;
        this.technicianStatus = technicianStatus;

    }

    //getters and setters

    public int getTechnicianId() { return technicianId; }
    public void setTechnicianId(int technicianId) { this.technicianId = technicianId; }

    public String getTechnicianName() { return technicianName; }
    public void setTechnicianName(String technicianName) { this.technicianName = technicianName; }

    public String getTechnicianAddress() { return technicianAddress; }
    public void setTechnicianAddress(String technicianAddress) { this.technicianAddress = technicianAddress; }

    public String getTechnicianEmail() { return technicianEmail; }
    public void setTechnicianEmail(String technicianEmail) { this.technicianEmail = technicianEmail; }

    public String getTechnicianPhone() { return technicianPhone; }
    public void setTechnicianPhone(String technicianPhone) { this.technicianPhone = technicianPhone; }

    public int getYearsOfExperience() { return yearsOfExperience; }
    public void setYearsOfExperience(int yearsOfExperience) { this.yearsOfExperience = yearsOfExperience; }

    public String getTechnicianType() { return technicianType; }
    public void setTechnicianType(String technicianType) { this.technicianType = technicianType; }

    public String getTechnicianStatus() { return technicianStatus; }
    public void setTechnicianStatus(String technicianStatus) { this.technicianStatus = technicianStatus; }

}
