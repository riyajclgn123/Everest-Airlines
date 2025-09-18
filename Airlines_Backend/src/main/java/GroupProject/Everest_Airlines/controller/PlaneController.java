package GroupProject.Everest_Airlines.controller;

import GroupProject.Everest_Airlines.model.Plane;
import GroupProject.Everest_Airlines.repository.PlaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/planes")
@CrossOrigin(origins = "http://localhost:4200") // Allow Angular frontend
public class PlaneController {

    @Autowired
    private PlaneRepository planeRepository;

    // Get all planes
    @GetMapping
    public List<Plane> getAllPlanes() {
        return planeRepository.findAll();
    }

    // Get plane by id
    @GetMapping("/{id}")
    public Optional<Plane> getPlaneById(@PathVariable int id) {
        return planeRepository.findById(id);
    }

    // Create a new plane
    @PostMapping
    public Plane createPlane(@RequestBody Plane plane) {
        return planeRepository.save(plane);
    }

    // Update a plane
    @PutMapping("/{id}")
    public Plane updatePlane(@PathVariable int id, @RequestBody Plane updatedPlane) {
        return planeRepository.findById(id).map(plane -> {
            plane.setPlaneName(updatedPlane.getPlaneName());
            plane.setPlaneModel(updatedPlane.getPlaneModel());
            plane.setPlaneType(updatedPlane.getPlaneType());
            plane.setPlaneColor(updatedPlane.getPlaneColor());
            plane.setPlaneCapacity(updatedPlane.getPlaneCapacity());
            plane.setPlaneRegistrationNumber(updatedPlane.getPlaneRegistrationNumber());
            plane.setPlaneDescription(updatedPlane.getPlaneDescription());
            plane.setPlaneSeatCapacity(updatedPlane.getPlaneSeatCapacity());
            plane.setFuelCapacity(updatedPlane.getFuelCapacity());
            plane.setPlaneManufactureDate(updatedPlane.getPlaneManufactureDate());
            plane.setPlaneMaintenanceDate(updatedPlane.getPlaneMaintenanceDate());
            plane.setNumberOfFlights(updatedPlane.getNumberOfFlights());
            plane.setMinimumWeight(updatedPlane.getMinimumWeight());
            plane.setMaximumWeight(updatedPlane.getMaximumWeight());
            plane.setStatus(updatedPlane.getStatus());

            return planeRepository.save(plane);
        }).orElseThrow(() -> new RuntimeException("Plane not found with id " + id));
    }

    // Delete a plane
    @DeleteMapping("/{id}")
    public void deletePlane(@PathVariable int id) {
        planeRepository.deleteById(id);
    }
}
