package GroupProject.Everest_Airlines.repository;

import GroupProject.Everest_Airlines.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {
    // You can add custom queries here if needed
}