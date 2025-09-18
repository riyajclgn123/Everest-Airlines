package GroupProject.Everest_Airlines.controller;

import GroupProject.Everest_Airlines.model.Pilot;
import GroupProject.Everest_Airlines.repository.PilotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pilots")
@CrossOrigin(origins = "http://localhost:4200") // Allow Angular frontend
public class PilotController {

    @Autowired
    private PilotRepository pilotRepository;

    // Get all pilots
    @GetMapping
    public List<Pilot> getAllPilots() {
        return pilotRepository.findAll();
    }

    // Get pilot by id
    @GetMapping("/{id}")
    public Optional<Pilot> getPilotById(@PathVariable int id) {
        return pilotRepository.findById(id);
    }

    // Create a new pilot
    @PostMapping
    public Pilot createPilot(@RequestBody Pilot pilot) {
        return pilotRepository.save(pilot);
    }

    // Update a pilot
    @PutMapping("/{id}")
    public Pilot updatePilot(@PathVariable int id, @RequestBody Pilot updatedPilot) {
        return pilotRepository.findById(id).map(pilot -> {
            pilot.setUserId(updatedPilot.getUserId());
            pilot.setLicenseNumber(updatedPilot.getLicenseNumber());
            pilot.setYearOfExperience(updatedPilot.getYearOfExperience());
            pilot.setSpecialization(updatedPilot.getSpecialization());

            return pilotRepository.save(pilot);
        }).orElseThrow(() -> new RuntimeException("Pilot not found with id " + id));
    }

    // Delete a pilot
    @DeleteMapping("/{id}")
    public void deletePilot(@PathVariable int id) {
        pilotRepository.deleteById(id);
    }
}
