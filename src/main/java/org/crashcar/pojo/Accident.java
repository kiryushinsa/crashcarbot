package org.crashcar.pojo;

import javax.persistence.*;

@Entity
@Table(name = "accident")
public class Accident
{
    private Long id;
    private Car car;
    private String before_user;
    private String image_path;


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "car")
    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getBefore_user() {
        return before_user;
    }

    public void setBefore_user(String before_user) {
        this.before_user = before_user;
    }

    public String getImage_path() {
        return image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }



}
