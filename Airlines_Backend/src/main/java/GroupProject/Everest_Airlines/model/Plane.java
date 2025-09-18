package GroupProject.Everest_Airlines.model;

import jakarta.persistence.*;
import java.security.Timestamp;
import java.util.Date;



@Entity
@Table (name = "planes")
public class Plane {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int planeId;

    private String planeName;
    private String planeModel;
    private String planeType;
    private String planeColor;
    private int planeCapacity;
    private int planeRegistrationNumber;
    private String planeDescription;
    private int planeSeatCapacity;
    private int fuelCapacity;
    private Date planeManufactureDate;
    private Timestamp planeMaintenanceDate;
    private int numberOfFlights;
    private int minimumWeight;
    private int maximumWeight;
    private String status;
    public Plane() {}

    public Plane(String planeName, String planeModel, String planeType, String planeColor, int planeCapacity, int planeRegistrationNumber, String planeDescription,
                 int planeSeatCapacity, int fuelCapacity, Date planeManufactureDate, Timestamp planeMaintenanceDate, int numberOfFlights, int minimumWeight, int maximumWeight, String status) {
        this.planeName = planeName;
        this.planeModel = planeModel;
        this.planeType = planeType;
        this.planeColor = planeColor;
        this.planeCapacity = planeCapacity;
        this.planeRegistrationNumber = planeRegistrationNumber;
        this.planeDescription = planeDescription;
        this.planeSeatCapacity = planeSeatCapacity;
        this.fuelCapacity = fuelCapacity;
        this.planeManufactureDate = planeManufactureDate;
        this.planeMaintenanceDate = planeMaintenanceDate;
        this.numberOfFlights = numberOfFlights;
        this.minimumWeight = minimumWeight;
        this.maximumWeight = maximumWeight;
        this.status = status;

    }

    //getters and setters

    public int getPlaneId() { return planeId; }
    public void setPlaneId(int planeId) { this.planeId = planeId; }

    public String getPlaneName() { return planeName; }
    public void setPlaneName(String planeName) { this.planeName = planeName; }

    public String getPlaneModel() { return planeModel; }
    public void setPlaneModel(String planeModel) { this.planeModel = planeModel; }

    public String getPlaneType() { return planeType; }
    public void setPlaneType(String planeType) { this.planeType = planeType; }

    public String getPlaneColor() { return planeColor; }
    public void setPlaneColor(String planeColor) { this.planeColor = planeColor; }

    public int getPlaneCapacity() { return planeCapacity; }
    public void setPlaneCapacity(int planeCapacity) { this.planeCapacity = planeCapacity; }

    public int getPlaneRegistrationNumber() { return planeRegistrationNumber; }
    public void setPlaneRegistrationNumber(int planeRegistrationNumber) { this.planeRegistrationNumber = planeRegistrationNumber; }

    public String getPlaneDescription() { return planeDescription; }
    public void setPlaneDescription(String planeDescription) { this.planeDescription = planeDescription; }

    public int getPlaneSeatCapacity() { return planeSeatCapacity; }
    public void setPlaneSeatCapacity(int planeSeatCapacity) { this.planeSeatCapacity = planeSeatCapacity; }

    public int getFuelCapacity() { return fuelCapacity; }
    public void setFuelCapacity(int fuelCapacity) { this.fuelCapacity = fuelCapacity; }

    public Date getPlaneManufactureDate() { return planeManufactureDate; }
    public void setPlaneManufactureDate(Date planeManufactureDate) { this.planeManufactureDate = planeManufactureDate; }

    public Timestamp getPlaneMaintenanceDate() { return planeMaintenanceDate; }
    public void setPlaneMaintenanceDate(Timestamp planeMaintenanceDate) { this.planeMaintenanceDate = planeMaintenanceDate; }

    public int getNumberOfFlights() { return numberOfFlights; }
    public void setNumberOfFlights(int numberOfFlights) { this.numberOfFlights = numberOfFlights; }

    public int getMinimumWeight() { return minimumWeight; }
    public void setMinimumWeight(int minimumWeight) { this.minimumWeight = minimumWeight; }

    public int getMaximumWeight() { return maximumWeight; }
    public void setMaximumWeight(int maximumWeight) { this.maximumWeight = maximumWeight; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }



}
