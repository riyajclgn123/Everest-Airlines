package GroupProject.Everest_Airlines.controller;

import GroupProject.Everest_Airlines.model.Payment;
import GroupProject.Everest_Airlines.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/payments")
@CrossOrigin(origins = "http://localhost:4200") // Allow Angular frontend
public class PaymentController {

    @Autowired
    private PaymentRepository paymentRepository;

    // Get all payments
    @GetMapping
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    // Get payment by id
    @GetMapping("/{id}")
    public Optional<Payment> getPaymentById(@PathVariable int id) {
        return paymentRepository.findById(id);
    }

    // Create a new payment
    @PostMapping
    public Payment createPayment(@RequestBody Payment payment) {
        payment.setPaymentDate(LocalDateTime.now());
        return paymentRepository.save(payment);
    }

    // Update a payment
    @PutMapping("/{id}")
    public Payment updatePayment(@PathVariable int id, @RequestBody Payment updatedPayment) {
        return paymentRepository.findById(id).map(payment -> {
            payment.setBookingId(updatedPayment.getBookingId());
            payment.setAmount(updatedPayment.getAmount());
            payment.setBookingDate(updatedPayment.getBookingDate());
            payment.setCardNumber(updatedPayment.getCardNumber());
            payment.setUserId(updatedPayment.getUserId());
            payment.setCvvCode(updatedPayment.getCvvCode());
            payment.setExpiryDate(updatedPayment.getExpiryDate());
            payment.setStatus(updatedPayment.getStatus());
            payment.setFlightId(updatedPayment.getFlightId());
            payment.setSeatId(updatedPayment.getSeatId());
            payment.setMethod(updatedPayment.getMethod());

            return paymentRepository.save(payment);
        }).orElseThrow(() -> new RuntimeException("Payment not found with id " + id));
    }

    // Delete a payment
    @DeleteMapping("/{id}")
    public void deletePayment(@PathVariable int id) {
        paymentRepository.deleteById(id);
    }
}
