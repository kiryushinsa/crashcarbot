package org.crashcar.main;


import org.crashcar.pojo.Car;
import org.crashcar.pojo.Event;


import org.hibernate.Session;

//import javax.management.remote.rmi._RMIConnection_Stub;
import java.time.LocalDate;
import java.time.LocalTime;


public class Main {
    public static void main(String[] args) {


            try (Session session = SessionUtil.getSession()) {

                session.beginTransaction();

                Car car = new Car();
                car.setNumber("x4939но111");
                car.setModel("Mazda Bongo");
                session.save(car);

                car.getClass();
                String s="ldasda";
                Event event= new Event();
                event.setUser(s);
                event.setCar(car);
                event.setDate(LocalDate.parse("2019-05-05"));
                event.setTime(LocalTime.parse("12:55:00"));
                car.getEvent().add(event);//callback empty event from main table car
                // end set new dependency from object event

                session.save(event);

                session.getTransaction().commit();}

            catch (Throwable cause) { cause.printStackTrace(); }






    }
}
