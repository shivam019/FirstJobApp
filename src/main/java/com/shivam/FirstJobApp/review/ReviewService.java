package com.shivam.FirstJobApp.review;

import java.util.List;

public interface ReviewService {

    List<Review> getAllReviews(Long CompanyId);

    Boolean addReview(Long companyId, Review review);
}
