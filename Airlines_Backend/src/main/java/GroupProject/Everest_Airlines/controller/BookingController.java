package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    private List<String> bookings = new ArrayList<>();

    @GetMapping
    public List<String> getBookings() {
        return bookings;
    }

    @PostMapping
    public String createBooking(@RequestBody String booking) {
        bookings.add(booking);
        return "Booking created successfully";
    }
}
