package com.lcwd.rating.rating.service;

import com.lcwd.rating.rating.entities.Rating;

import java.util.List;

public interface RatingService {

    // create
    Rating create (Rating rating);


    // getAll Rating
    List<Rating>getAllRating();


    // get rating  by userId
    List<Rating>getRatingByUserId(String userId);

    // get all rating by hotelId
    List<Rating>getAllRatingByHotelId(String hotelId);
}
