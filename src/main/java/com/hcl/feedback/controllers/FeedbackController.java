package com.hcl.feedback.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hcl.feedback.model.Feedback;
import com.hcl.feedback.repository.FeedbackRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class FeedbackController {

    Logger logger = LoggerFactory.getLogger(FeedbackController.class);

    @Autowired
    private FeedbackRepository repo;

    // The default page of the application where the comment can be made
    @GetMapping("/")
    public ModelAndView index(){
        return new ModelAndView("index.html");
    }

    // This page displays the table content from the database so that it can be verified that the
    // comment was made.
    @GetMapping("/feedback")
    public Iterable<Feedback> getAllFeedback(){

        return repo.findAll();

    }

    // Saves the comment and rating into the database
    @PostMapping("/submit")
    public Feedback addFeedback(@RequestBody Feedback newFeedback){

        logger.info(newFeedback.toString());

        return repo.save(newFeedback);
    }
}
