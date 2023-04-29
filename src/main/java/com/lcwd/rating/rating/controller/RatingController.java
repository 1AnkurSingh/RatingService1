package com.lcwd.rating.rating.controller;

import com.lcwd.rating.rating.entities.Rating;
import com.lcwd.rating.rating.impl.RatingServiceImpl;
import com.lcwd.rating.rating.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {
    @Autowired
    private RatingService ratingService;
    // crate rating
    @PostMapping
    public ResponseEntity<Rating>createRating(@RequestBody Rating rating){
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(rating));
    }

    // getAll ratting
    @GetMapping
    public ResponseEntity<List<Rating>>getAllRating(){
        return ResponseEntity.ok(ratingService.getAllRating());
    }

    // getAll rating by user id
    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>>getAllRatingByUserId(@PathVariable String userId){
        return ResponseEntity.ok(ratingService.getRatingByUserId(userId));
    }

    // getAll rating by hotel id
    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>>getAllRatingByHotelId(@PathVariable String hotelId){
        return ResponseEntity.ok(ratingService.getAllRatingByHotelId(hotelId));
    }


}
