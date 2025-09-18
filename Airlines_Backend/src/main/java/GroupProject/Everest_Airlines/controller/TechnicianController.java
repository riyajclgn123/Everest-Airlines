package GroupProject.Everest_Airlines.controller;

import GroupProject.Everest_Airlines.model.Technician;
import GroupProject.Everest_Airlines.repository.TechnicianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/technicians")
@CrossOrigin(origins = "http://localhost:4200") // Allow Angular frontend
public class TechnicianController {

    @Autowired
    private TechnicianRepository technicianRepository;

    // Get all technicians
    @GetMapping
    public List<Technician> getAllTechnicians() {
        return technicianRepository.findAll();
    }

    // Get technician by id
    @GetMapping("/{id}")
    public Optional<Technician> getTechnicianById(@PathVariable int id) {
        return technicianRepository.findById(id);
    }

    // Create a new technician
    @PostMapping
    public Technician createTechnician(@RequestBody Technician technician) {
        return technicianRepository.save(technician);
    }

    // Update a technician
    @PutMapping("/{id}")
    public Technician updateTechnician(@PathVariable int id, @RequestBody Technician updatedTechnician) {
        return technicianRepository.findById(id).map(technician -> {
            technician.setTechnicianName(updatedTechnician.getTechnicianName());
            technician.setTechnicianAddress(updatedTechnician.getTechnicianAddress());
            technician.setTechnicianEmail(updatedTechnician.getTechnicianEmail());
            technician.setTechnicianPhone(updatedTechnician.getTechnicianPhone());
            technician.setYearsOfExperience(updatedTechnician.getYearsOfExperience());
            technician.setTechnicianType(updatedTechnician.getTechnicianType());
            technician.setTechnicianStatus(updatedTechnician.getTechnicianStatus());

            return technicianRepository.save(technician);
        }).orElseThrow(() -> new RuntimeException("Technician not found with id " + id));
    }

    // Delete a technician
    @DeleteMapping("/{id}")
    public void deleteTechnician(@PathVariable int id) {
        technicianRepository.deleteById(id);
    }
}
