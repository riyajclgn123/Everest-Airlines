package GroupProject.Everest_Airlines.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.security.Timestamp;
import jakarta.persistence.*;



@Entity
@Table (name = "maintenances")

public class Maintenance {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int MaintenanceId;

    private int planeId;
    private Timestamp maintenanceDate;
    private String maintenanceType;
    private String maintenanceDescription;
    private String maintenanceStatus;
    private String technicianName;
    public Maintenance() {}

    public Maintenance(int planeId, Timestamp maintenanceDate, String maintenanceType, String maintenanceDescription, String maintenanceStatus, String technicianName) {
        this.planeId = planeId;
        this.maintenanceDate = maintenanceDate;
        this.maintenanceType = maintenanceType;
        this.maintenanceDescription = maintenanceDescription;
        this.maintenanceStatus = maintenanceStatus;
        this.technicianName = technicianName;

    }

    public int getMaintenanceId() { return MaintenanceId; }
    public void setMaintenanceId(int MaintenanceId) { this.MaintenanceId = MaintenanceId; }

    public int getPlaneId() { return planeId; }
    public void setPlaneId(int planeId) { this.planeId = planeId; }

    public Timestamp getMaintenanceDate() { return maintenanceDate; }
    public void setMaintenanceDate(Timestamp maintenanceDate) { this.maintenanceDate = maintenanceDate; }

    public String getMaintenanceType() { return maintenanceType; }
    public void setMaintenanceType(String maintenanceType) { this.maintenanceType = maintenanceType; }

    public String getMaintenanceDescription() { return maintenanceDescription; }
    public void setMaintenanceDescription(String maintenanceDescription) { this.maintenanceDescription = maintenanceDescription; }

    public String getMaintenanceStatus() { return maintenanceStatus; }
    public void setMaintenanceStatus(String maintenanceStatus) { this.maintenanceStatus = maintenanceStatus; }

    public String getTechnicianName() { return technicianName; }
    public void setTechnicianName(String technicianName) { this.technicianName = technicianName; }



}
