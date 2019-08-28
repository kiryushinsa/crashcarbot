package org.crashcar.pojo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="id",updatable = false,nullable = false)
    private Integer id;

    @Column(name="model",nullable = false)
    private String model;

    @Column(name="number",nullable = false,unique = true)
    private String number;


    //Realization one to many sub table Event


    @OneToMany(mappedBy = "car",cascade = CascadeType.ALL,
            orphanRemoval = true,fetch = FetchType.LAZY,targetEntity = Event.class)

    private Set <Event> event = new HashSet <Event> ();
    public Set <Event> getEvent() {
        return this.event;
    }

    public void setEvent(Set<Event> event) {
        this.event = event;
    }
    //end of realization


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


}
