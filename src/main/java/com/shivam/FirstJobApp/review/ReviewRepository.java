package com.shivam.FirstJobApp.review;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {


    List<Review> findByCompany_Id(Long companyId);

}
