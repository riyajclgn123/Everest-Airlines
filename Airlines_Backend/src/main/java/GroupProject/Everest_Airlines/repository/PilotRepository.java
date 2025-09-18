package GroupProject.Everest_Airlines.repository;

import GroupProject.Everest_Airlines.model.Pilot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PilotRepository extends JpaRepository<Pilot, Integer> {
    // You can add custom queries here if needed
}