package GroupProject.Everest_Airlines.controller;

import GroupProject.Everest_Airlines.model.FlightCrew;
import GroupProject.Everest_Airlines.repository.FlightCrewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/flightcrews")
@CrossOrigin(origins = "http://localhost:4200") // Allow Angular frontend
public class FlightCrewController {

    @Autowired
    private FlightCrewRepository flightcrewRepository;

    // Get all flight crews
    @GetMapping
    public List<FlightCrew> getAllFlightCrews() {
        return flightcrewRepository.findAll();
    }

    // Get flight crew by id
    @GetMapping("/{id}")
    public Optional<FlightCrew> getFlightCrewById(@PathVariable int id) {
        return flightcrewRepository.findById(id);
    }

    // Create a new flight crew
    @PostMapping
    public FlightCrew createFlightCrew(@RequestBody FlightCrew flightcrew) {
        return flightcrewRepository.save(flightcrew);
    }

    // Update a flight crew
    @PutMapping("/{id}")
    public FlightCrew updateFlightCrew(@PathVariable int id, @RequestBody FlightCrew updatedFLightCrew) {
        return flightcrewRepository.findById(id).map(flightcrew -> {
            flightcrew.setFlightId(updatedFLightCrew.getFlightId());
            flightcrew.setRole(updatedFLightCrew.getRole());
            flightcrew.setUserId(updatedFLightCrew.getUserId());

            return flightcrewRepository.save(flightcrew);
        }).orElseThrow(() -> new RuntimeException("Flightcrew not found with id " + id));
    }

    // Delete a flight crew
    @DeleteMapping("/{id}")
    public void deleteFlightCrew(@PathVariable int id) {
        flightcrewRepository.deleteById(id);
    }
}
