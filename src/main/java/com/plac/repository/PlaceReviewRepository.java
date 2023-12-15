package com.plac.repository;

import com.plac.domain.place_review.PlaceReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PlaceReviewRepository extends JpaRepository<PlaceReview, Long> {
    @Query("SELECT ROUND(AVG(pr.totalRating), 0) FROM PlaceReview pr WHERE pr.placeId = :placeId")
    Float findAverageTotalRatingByPlaceId(@Param("placeId") Long placeId);

    @Query("SELECT COALESCE(ROUND(AVG(pr.totalRating), 0), 0) FROM PlaceReview pr WHERE pr.placeId = :placeId")
    int countByPlaceId(@Param("placeId") Long placeId);
}
