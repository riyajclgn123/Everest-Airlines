package GroupProject.Everest_Airlines.repository;

import GroupProject.Everest_Airlines.model.Technician;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnicianRepository extends JpaRepository<Technician, Integer> {
    // You can add custom queries here if needed
}