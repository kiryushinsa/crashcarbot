package org.crashcar.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class SessionUtil {

    private static final SessionFactory session;

    static {
        try {
            /*  Find hibernate config
                */
            Configuration configuration = new Configuration();
            configuration.configure();
            session = configuration.buildSessionFactory();
        }
        catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException{
        return session.openSession();
    }

    }


