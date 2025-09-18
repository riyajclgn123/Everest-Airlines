package GroupProject.Everest_Airlines.controller;

import GroupProject.Everest_Airlines.model.Airport;
import GroupProject.Everest_Airlines.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/airports")
@CrossOrigin(origins = "http://localhost:4200") // Allow Angular frontend
public class AirportController {

    @Autowired
    private AirportRepository airportRepository;

    // Get all airports
    @GetMapping
    public List<Airport> getAllAirports() {
        return airportRepository.findAll();
    }

    // Get airport by id
    @GetMapping("/{id}")
    public Optional<Airport> getAirportById(@PathVariable int id) {
        return airportRepository.findById(id);
    }

    // Create a new airport
    @PostMapping
    public Airport createFlight(@RequestBody Airport airport) {
        return airportRepository.save(airport);
    }

    // Update a flight
    @PutMapping("/{id}")
    public Airport updateAirport(@PathVariable int id, @RequestBody Airport updatedAirport) {
        return airportRepository.findById(id).map(airport -> {
            airport.setAirportName(updatedAirport.getAirportName());
            airport.setAirportCode(updatedAirport.getAirportCode());
            airport.setCity(updatedAirport.getCity());
            airport.setCountry(updatedAirport.getCountry());
            airport.setState(updatedAirport.getState());
            airport.setZip(updatedAirport.getZip());
            airport.setIATA(updatedAirport.getIATA());

            return airportRepository.save(airport);
        }).orElseThrow(() -> new RuntimeException("Airport not found with id " + id));
    }

    // Delete an airport
    @DeleteMapping("/{id}")
    public void deleteAirport(@PathVariable int id) {
        airportRepository.deleteById(id);
    }
}
