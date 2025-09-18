package GroupProject.Everest_Airlines.controller;

import GroupProject.Everest_Airlines.model.AdminLog;
import GroupProject.Everest_Airlines.repository.AdminLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/adminlogs")
@CrossOrigin(origins = "http://localhost:4200") // Allow Angular frontend
public class AdminLogController {

    @Autowired
    private AdminLogRepository adminlogRepository;

    // Get all admin logs
    @GetMapping
    public List<AdminLog> getAllAdminLogs() {
        return adminlogRepository.findAll();
    }

    // Get admin log by id
    @GetMapping("/{id}")
    public Optional<AdminLog> getAdminLogById(@PathVariable int id) {
        return adminlogRepository.findById(id);
    }

    // Create a new admin log
    @PostMapping
    public AdminLog createFlight(@RequestBody AdminLog adminLog) {
        return adminlogRepository.save(adminLog);
    }

    // Update a flight
    @PutMapping("/{id}")
    public AdminLog updateAdminLog(@PathVariable int id, @RequestBody AdminLog updatedAdminLog) {
        return adminlogRepository.findById(id).map(adminlog -> {
            adminlog.setAdminId(updatedAdminLog.getAdminId());
            adminlog.setAction(updatedAdminLog.getAction());
            adminlog.setAction(updatedAdminLog.getAction());

            return adminlogRepository.save(adminlog);
        }).orElseThrow(() -> new RuntimeException("FLight not found with id " + id));
    }

    // Delete a flight
    @DeleteMapping("/{id}")
    public void deleteFlight(@PathVariable int id) {
        adminlogRepository.deleteById(id);
    }
}
