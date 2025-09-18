package GroupProject.Everest_Airlines.repository;

import GroupProject.Everest_Airlines.model.Maintenance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaintenanceRepository extends JpaRepository<Maintenance, Integer> {
    // You can add custom queries here if needed
}