package org.crashcar.pojo;

import com.google.inject.internal.cglib.reflect.$FastClass;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "event")
public class Event implements java.io.Serializable
{
    private Long id;
    @Basic
    private LocalTime time;
    @Basic
    private LocalDate date;
    private String user;
    private Car car;

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    @Column(name="id",updatable = false,nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @Column(name="time",nullable = false,length = 10)
    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }


    @Column(name = "date", nullable = false, length = 10)
    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Column(name="user_id",nullable = false)
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "car",nullable = false)
    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
