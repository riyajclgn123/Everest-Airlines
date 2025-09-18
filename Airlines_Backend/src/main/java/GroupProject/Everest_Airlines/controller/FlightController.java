package GroupProject.Everest_Airlines.controller;

import GroupProject.Everest_Airlines.model.Flight;
import GroupProject.Everest_Airlines.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/flights")
@CrossOrigin(origins = "http://localhost:4200") // Allow Angular frontend
public class FlightController {

    @Autowired
    private FlightRepository flightRepository;

    // Get all flights
    @GetMapping
    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    // Get flight by id
    @GetMapping("/{id}")
    public Optional<Flight> getFlightById(@PathVariable int id) {
        return flightRepository.findById(id);
    }

    // Create a new flight
    @PostMapping
    public Flight createFlight(@RequestBody Flight flight) {
        return flightRepository.save(flight);
    }

    // Update a flight
    @PutMapping("/{id}")
    public Flight updateFlight(@PathVariable int id, @RequestBody Flight updatedFlight) {
        return flightRepository.findById(id).map(flight -> {
            flight.setFlightNumber(updatedFlight.getFlightNumber());
            flight.setPlaneNumber(updatedFlight.getPlaneNumber());
            flight.setDepartureLocation(updatedFlight.getDepartureLocation());
            flight.setArrivalLocation(updatedFlight.getArrivalLocation());
            flight.setDepartureDateTime(updatedFlight.getDepartureDateTime());
            flight.setArrivalDateTime(updatedFlight.getArrivalDateTime());
            flight.setLayoverDateTime(updatedFlight.getLayoverDateTime());
            flight.setPilotNumber(updatedFlight.getPilotNumber());
            flight.setPilotName(updatedFlight.getPilotName());
            flight.setFlightType(updatedFlight.getFlightType());
            flight.setFlightClass(updatedFlight.getFlightClass());
            flight.setFlightPrice(updatedFlight.getFlightPrice());
            flight.setSeatNumber(updatedFlight.getSeatNumber());
            flight.setDuration(updatedFlight.getDuration());
            flight.setStatus(updatedFlight.getStatus());
            flight.setAvailable(updatedFlight.getAvailable());
            flight.setRequiredFuelConsumption(updatedFlight.getRequiredFuelConsumption());
            flight.setDistance(updatedFlight.getDistance());

            return flightRepository.save(flight);
        }).orElseThrow(() -> new RuntimeException("Flight not found with id " + id));
    }

    // Delete a flight
    @DeleteMapping("/{id}")
    public void deleteFlight(@PathVariable int id) {
        flightRepository.deleteById(id);
    }
}
