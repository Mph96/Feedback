package com.hcl.feedback.model;

import javax.persistence.*;

@Entity
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "feedback")
    private String comments;

    @Column(name = "rating")
    private int rating;

    public Long getId(){
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }



    @Override
    public String toString(){
        return "Feedback [id=" + id + ", feedback=" + comments + ", rating=" + rating + "]";
    }
}
