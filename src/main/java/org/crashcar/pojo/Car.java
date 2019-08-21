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


    //Realization one to many
    private Set<Car> car = new HashSet <Car> ();

    @OneToMany(mappedBy = "car",cascade = CascadeType.ALL,orphanRemoval = true)

    public Set<Car> getCar(){ return this.car; }
    public void setCar(Set<Car> car) {}
    public void removeCar(Car car) { getCar().remove(car); }


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
