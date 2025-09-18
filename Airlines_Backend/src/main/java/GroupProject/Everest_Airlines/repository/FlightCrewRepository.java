package GroupProject.Everest_Airlines.repository;

import GroupProject.Everest_Airlines.model.FlightCrew;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightCrewRepository extends JpaRepository<FlightCrew, Integer> {
    // You can add custom queries here if needed
}