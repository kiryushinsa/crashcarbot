package org.crashcar.pojo;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "events")
public class Events
{
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    @Column(name="id",updatable = false,nullable = false)
    private Long id;

    @Column(name="time ",nullable = false)
    private Time time;

    @Column(name="date",nullable = false)
    private Date date;

    @Column(name="user",nullable = false)
    private Date user;

    private Car car_id;

    @ManyToOne
    @JoinColumn(name = "car_id")
    public Car getContact() {
        return this.car_id;
    }

    public void setContact(Car car_id) {
        this.car_id = car_id;
    }




}
