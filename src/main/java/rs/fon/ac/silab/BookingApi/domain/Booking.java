/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.fon.ac.silab.BookingApi.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import rs.fon.ac.silab.BookingApi.domain.id.BookingID;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

/**
 *
 * @author Vladimir
 */
@Entity
@Table

public class Booking implements rs.fon.ac.silab.BookingApi.domain.Entity{
    
    @JsonIgnore
    @EmbeddedId
    private BookingID id = new BookingID();
    
    
    @MapsId("idUser")
    @JoinColumn(name = "idUser")
    @ManyToOne
    @LazyCollection(LazyCollectionOption.FALSE)
    private User user;

    @MapsId("idEvent")
    @JoinColumn(name = "idEvent")
    @ManyToOne
    private Event event;

   @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumns( {
     @JoinColumn(name="idTicketsCategory_event", referencedColumnName="idEvent"),
     @JoinColumn(name="idTicketsCategory", referencedColumnName="idTicketsCategory")
    } )
    
    private TicketsCategory ticketsCategory;

    private double price;
    private int amount;

    public Booking() {
    }

    public Booking(User user, Event event, TicketsCategory ticketsCategory, double price, int amount) {
        this.user = user;
        this.event = event;
        this.ticketsCategory = ticketsCategory;
        this.price = price;
        this.amount = amount;
    }

    /**
     * @return the id
     */
    public BookingID getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(BookingID id) {
        this.id = id;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the event
     */
    public Event getEvent() {
        return event;
    }

    /**
     * @param event the event to set
     */
    public void setEvent(Event event) {
        this.event = event;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * @return the ticketCategory
     */
    public TicketsCategory getTicketsCategory() {
        return ticketsCategory;
    }

    /**
     * @param ticketCategory the ticketCategory to set
     */
    public void setTicketsCategory(TicketsCategory ticketsCategory) {
        this.ticketsCategory = ticketsCategory;
    }

}
