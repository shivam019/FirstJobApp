package com.shivam.FirstJobApp.company;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.shivam.FirstJobApp.job.Job;
import jakarta.persistence.*;

import java.util.List;
@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String name;

    private String description;

    //Every Company has a List of Job
    //CREATE NEW TABLE, RELATIONSHIP WILL BE MANAGE IN NEW TABLE
    @OneToMany(mappedBy = "company")
    @JsonIgnore
    private List<Job> jobs;


    //private List<Reviews> reviews;

    public Company() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}
