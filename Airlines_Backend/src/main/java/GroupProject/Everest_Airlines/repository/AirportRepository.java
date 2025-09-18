package GroupProject.Everest_Airlines.repository;

import GroupProject.Everest_Airlines.model.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Integer> {
    // You can add custom queries here if needed
}