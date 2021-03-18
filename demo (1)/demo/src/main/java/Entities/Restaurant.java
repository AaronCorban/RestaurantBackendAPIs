package Entities;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "Restaurant")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int rest_ID; //this will be primary key

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "type")
    private String type;

    @Column(name = "menu")
    private String menu;

    @Column(name = "rating")
    private int rating;

    @Column(name = "max_capacity")
    private int max_capacity;


    //foreign key bit goes here



    //no argument
    public Restaurant(){

    }

    //overloaded
    public Restaurant(int rest_ID, String name, String description, String type, String menu, int rating, int max_capacity) {
        this.rest_ID = rest_ID;
        this.name = name;
        this.description = description;
        this.type = type;
        this.menu = menu;
        this.rating = rating;
        this.max_capacity = max_capacity;
    }

    //getters and setters
    public int getRest_ID() {
        return rest_ID;
    }

    public void setRest_ID(int rest_ID) {
        this.rest_ID = rest_ID;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getMax_capacity() {
        return max_capacity;
    }

    public void setMax_capacity(int max_capacity) {
        this.max_capacity = max_capacity;
    }
}
