
package GroupProject.Everest_Airlines.repository;

import GroupProject.Everest_Airlines.model.AdminLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminLogRepository extends JpaRepository<AdminLog, Integer> {
    // You can add custom queries here if needed
}