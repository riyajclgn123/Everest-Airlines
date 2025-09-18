package GroupProject.Everest_Airlines.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "adminLogs")

public class AdminLog {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int adminLogId;

    private int adminId;
    private String action;
    private Date actionDate;
    public AdminLog() {}

    public AdminLog(int adminId, String action, Date actionDate) {
        this.adminId = adminId;
        this.action = action;
        this.actionDate = actionDate;
    }

    //getters and setters
    public int getAdminLogId() { return adminLogId; }
    public void setAdminLogId(int adminLogId) { this.adminLogId = adminLogId; }

    public int getAdminId() { return adminId; }
    public void setAdminId(int adminId) { this.adminId = adminId; }

    public String getAction() { return action; }
    public void setAction(String action) { this.action = action; }

    public Date getActionDate() { return actionDate; }
    public void setActionDate(Date actionDate) { this.actionDate = actionDate; }
}
