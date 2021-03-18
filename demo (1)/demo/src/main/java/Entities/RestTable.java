package Entities;

import javax.persistence.*;

@Entity
@Table(name = "RestTable")
public class RestTable {

    //data members
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int table_ID;

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "rest_ID")
    private int rest_ID;

    //foreign key bit goes here


    //no argument
    public RestTable(){

    }

    //overloaded
    public RestTable(int table_ID, int capacity, int rest_ID) {
        this.table_ID = table_ID;
        this.capacity = capacity;
        this.rest_ID = rest_ID;
    }

    //getters and setters
    public int getTable_ID() {
        return table_ID;
    }

    public void setTable_ID(int table_ID) {
        this.table_ID = table_ID;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getRest_ID() {
        return rest_ID;
    }

    public void setRest_ID(int rest_ID) {
        this.rest_ID = rest_ID;
    }
}
