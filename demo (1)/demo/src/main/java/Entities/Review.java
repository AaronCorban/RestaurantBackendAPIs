package Entities;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "review")
public class Review {

    @NotNull
    private long id;
    private String name;
    private int rating;
    private String comment;

    public Review(){

    }

    public Review(String name, int rating, String comment) {
        this.name = name;
        this.rating = rating;
        this.comment = comment;
    }

    //getters and setters
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "rating", nullable = false)
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    @Column(name = "comment", nullable = false)
    public void setComment(String comment) {
        this.comment = comment;
    }

    //toString
    @Override
    public String toString() {
        return "Review{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", comment='" + comment + '\'' +
                '}';
    }

}//end class
