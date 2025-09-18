package GroupProject.Everest_Airlines.controller;

import GroupProject.Everest_Airlines.model.Maintenance;
import GroupProject.Everest_Airlines.repository.MaintenanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/maintenances")
@CrossOrigin(origins = "http://localhost:4200") // Allow Angular frontend
public class MaintenanceController {

    @Autowired
    private MaintenanceRepository maintenanceRepository;

    // Get all maintenances
    @GetMapping
    public List<Maintenance> getAllFlightCrews() {
        return maintenanceRepository.findAll();
    }

    // Get maintenance by id
    @GetMapping("/{id}")
    public Optional<Maintenance> getMaintenanceById(@PathVariable int id) {
        return maintenanceRepository.findById(id);
    }

    // Create a new maintenance
    @PostMapping
    public Maintenance createMaintenance(@RequestBody Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    // Update a maintenance
    @PutMapping("/{id}")
    public Maintenance updateMaintenance(@PathVariable int id, @RequestBody Maintenance updatedMaintenance) {
        return maintenanceRepository.findById(id).map(maintenance -> {
            maintenance.setPlaneId(updatedMaintenance.getPlaneId());
            maintenance.setMaintenanceDate(updatedMaintenance.getMaintenanceDate());
            maintenance.setMaintenanceDescription(updatedMaintenance.getMaintenanceDescription());
            maintenance.setMaintenanceType(updatedMaintenance.getMaintenanceType());
            maintenance.setMaintenanceStatus(updatedMaintenance.getMaintenanceStatus());
            maintenance.setTechnicianName(updatedMaintenance.getTechnicianName());

            return maintenanceRepository.save(maintenance);
        }).orElseThrow(() -> new RuntimeException("Maintenance not found with id " + id));
    }

    // Delete a maintenance
    @DeleteMapping("/{id}")
    public void deleteMaintenance(@PathVariable int id) {
        maintenanceRepository.deleteById(id);
    }
}
