package com.shivam.FirstJobApp.review.impl;

import com.shivam.FirstJobApp.company.Company;
import com.shivam.FirstJobApp.company.CompanyService;
import com.shivam.FirstJobApp.review.Review;
import com.shivam.FirstJobApp.review.ReviewRepository;
import com.shivam.FirstJobApp.review.ReviewService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ReviewServiceImpl implements ReviewService {

    private ReviewRepository reviewRepository;
    private CompanyService companyService;

    public ReviewServiceImpl(ReviewRepository reviewRepository, CompanyService companyService) {
        this.reviewRepository = reviewRepository;
         this.companyService = companyService;
    }




    @Override
    public List<Review> getAllReviews(Long CompanyId) {
        List<Review> reviews = reviewRepository.findByCompany_Id(CompanyId);
        return reviews;
    }

    @Override
    public Boolean addReview(Long companyId, Review review) {
        Company company = companyService.getCompanyById(companyId);

        if(companyId != null){
            review.setCompany(company);
            reviewRepository.save(review);
            return true;
        } else {
            return false;
        }
    }
}
