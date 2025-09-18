package GroupProject.Everest_Airlines.repository;

import GroupProject.Everest_Airlines.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Integer> {
    // You can add custom queries here if needed
}