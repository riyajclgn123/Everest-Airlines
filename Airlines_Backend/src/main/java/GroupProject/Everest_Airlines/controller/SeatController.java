package GroupProject.Everest_Airlines.controller;

import GroupProject.Everest_Airlines.model.Seat;
import GroupProject.Everest_Airlines.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/seats")
@CrossOrigin(origins = "http://localhost:4200") // Allow Angular frontend
public class SeatController {

    @Autowired
    private SeatRepository seatRepository;

    // Get all seats
    @GetMapping
    public List<Seat> getAllSeats() {
        return seatRepository.findAll();
    }

    // Get seat by id
    @GetMapping("/{id}")
    public Optional<Seat> getSeatById(@PathVariable int id) {
        return seatRepository.findById(id);
    }

    // Create a new seat
    @PostMapping
    public Seat createSeat(@RequestBody Seat seat) {
        return seatRepository.save(seat);
    }

    // Update a seat
    @PutMapping("/{id}")
    public Seat updateSeat(@PathVariable int id, @RequestBody Seat updatedSeat) {
        return seatRepository.findById(id).map(seat -> {
            seat.setFlightId(updatedSeat.getFlightId());
            seat.setSeatNumber(updatedSeat.getSeatNumber());
            seat.setSeatClass(updatedSeat.getSeatClass());
            seat.setIsBooked(updatedSeat.getIsBooked());

            return seatRepository.save(seat);
        }).orElseThrow(() -> new RuntimeException("Seat not found with id " + id));
    }

    // Delete a seat
    @DeleteMapping("/{id}")
    public void deleteSeat(@PathVariable int id) {
        seatRepository.deleteById(id);
    }
}
