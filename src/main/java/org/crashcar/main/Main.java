package org.crashcar.main;


import org.crashcar.pojo.Car;
import org.crashcar.pojo.Events;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import javax.management.remote.rmi._RMIConnection_Stub;
import java.util.List;


public class Main {
    public static void main(String[] args) {
            try (Session session = TestUtil.getSession()) {

                session.beginTransaction();

                Car car = new Car();
                car.setNumber("123123");
                car.setModel("x422xd");

                session.save(car);



                session.getTransaction().commit();}

            catch (Throwable cause){cause.printStackTrace();
            }

        List <Events> list = null;
        try(Session session= TestUtil.getSession())
        {
            session.beginTransaction();
            Query query = session.createQuery("FROM Car");
            list = (List<Events>) query.list();
            session.getTransaction().commit();
        }
        catch (Throwable cause){    cause.printStackTrace();    }



    }
}
