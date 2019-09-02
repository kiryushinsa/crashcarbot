package org.crashcar.pojo;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "accident")
public class Accident implements java.io.Serializable
{

    private Long id;
    private Car car;
    private String before_user;
    private String image_path;
    @Basic
    private LocalTime time;
    @Basic
    private LocalDate date;


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "car",nullable = false)
    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
    }

    @Column(name="before_user",nullable = false)
    public String getBefore_user() {
        return before_user;
    }
    public void setBefore_user(String before_user) {
        this.before_user = before_user;
    }


    @Column(name="image_path",nullable = false)
    public String getImage_path() {
        return image_path;
    }
    public void setImage_path(String image_path) {
        this.image_path = image_path;
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

}
