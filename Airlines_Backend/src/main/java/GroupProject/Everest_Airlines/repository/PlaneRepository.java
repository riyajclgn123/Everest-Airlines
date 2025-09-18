package GroupProject.Everest_Airlines.repository;

import GroupProject.Everest_Airlines.model.Plane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaneRepository extends JpaRepository<Plane, Integer> {
    // You can add custom queries here if needed
}