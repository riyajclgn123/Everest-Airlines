package GroupProject.Everest_Airlines.repository;

import GroupProject.Everest_Airlines.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer> {
    // You can add custom queries here if needed
}