package com.hcl.feedback.repository;

import com.hcl.feedback.model.Feedback;
import org.springframework.data.repository.CrudRepository;

public interface FeedbackRepository extends CrudRepository<Feedback, Integer> {

}
