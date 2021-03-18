package Entities;
import javax.persistence.*;

@Entity
@Table(name = "Booking")
public class Booking {
    //data members
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bookingID;

    @Column(name = "date")
    private String date;

    @Column(name = "time")
    private int time;

    @Column(name = "customer_name")
    private String customer_name;

    @Column(name = "table_ID")
    private int table_ID;


    //foreign key bit goes here


    //no argument
    public Booking(){

    }

    //overloaded
    public Booking(long bookingID, String date, int time, String customer_name, int table_ID) {
        this.bookingID = bookingID;
        this.date = date;
        this.time = time;
        this.customer_name = customer_name;
        this.table_ID = table_ID;
    }

    //getters and setters
    public long getBookingID() {
        return bookingID;
    }

    public void setBookingID(long bookingID) {
        this.bookingID = bookingID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public int getTable_ID() {
        return table_ID;
    }

    public void setTable_ID(int table_ID) {
        this.table_ID = table_ID;
    }
}
