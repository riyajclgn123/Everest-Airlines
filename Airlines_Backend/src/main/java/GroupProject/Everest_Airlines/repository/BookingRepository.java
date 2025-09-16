package GroupProject.Everest_Airlines.repository;

import GroupProject.Everest_Airlines.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    // You can add custom queries here if needed
}
