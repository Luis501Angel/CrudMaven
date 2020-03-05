package org.uv.mavencrud;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Luis Angel
 */
public class DAOPersona implements interfaceDAO<Persona, Integer> {
    private final SessionFactory factory;
    private Session session;

    public DAOPersona() {
        factory = HibernateUtil.getSessionFactory();
    }

    @Override
    public boolean insert(Persona entity) {
        try {
            session = factory.openSession();
            session.beginTransaction();
            session.save(entity);
            session.getTransaction().commit();

            return true;
        }
        catch (HibernateException e) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, e);

            return false;
        }
        finally {
            session.close();
        }
    }

    @Override
    public boolean update(Persona entity) {
        try {
            session = factory.openSession();
            session.beginTransaction();
            session.update(entity);
            session.getTransaction().commit();

            return true;
        }
        catch (HibernateException e) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, e);

            return false;
        }
        finally {
            session.close();
        }
    }

    @Override
    public boolean delete(Integer id) {
        try {
            session = factory.openSession();

            session.beginTransaction();
            session.delete(new Persona(id));
            session.getTransaction().commit();

            return true;
        }
        catch (HibernateException e) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, e);

            return false;
        }
        finally {
            session.close();
        }
    }

    @Override
    public Persona find(Integer id) {
        /*try {
            session = factory.openSession();
           
            return session.find(Persona.class, id);
            
        }
        catch (HibernateException e) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, e);

            return null;
        }
        finally {
            session.close();
        }*/
        return null;
    }

    @Override
    public List<Persona> findAll() {
        try {
            session = factory.openSession();

            return session.createQuery("SELECT s FROM Personas s").list();
        }
        catch (HibernateException e) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, e);

            return new ArrayList<>();
        }
        finally {
            session.close();
        }
    }
}
