
package hr.edunova.horvat.controller;

import hr.edunova.horvat.utility.EdunovaException;
import hr.edunova.horvat.utility.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Josip
 */
//vlastita genericka klasa 
// Zelim gledat obradu kao generalni pojam i ako ti kazem da te parameteiziram sa smjerom, tada ces
//ti biti obrada smjera, a ako te parametiziram sa grupom tada ces biti obrada grupe. 
// Veliki T je taj parametar.
// 
public abstract class Obrada<T>  {
    // hocu da mi podklase koje ce biti dio te obrade mogu pristupiti tom mom entitetu
   protected T entitet;
   //taj T moze biti bilo koja klasa. tj taj parametar etintet
   protected Session session;
   
   public abstract List<T> getPodaci();
   protected abstract void kontrolaCreate() throws EdunovaException;
   protected abstract void kontrolaUpdate() throws EdunovaException;
   protected abstract void kontrolaDelete() throws EdunovaException;

    public Obrada(T entitet) {
        this();
        this.entitet = entitet;
        // zadatak ovog konstruktora je da pozove konstruktor ispod da dobije session
        // da dodijeli primljeni entitet ovom entitetu i onda ce Smjer u obrada smjer biti ok jer entitet prima sve objekte
        // ukljucujuci i smjer
    }
   
   

   // Cim se bude konstruirala obrada ja cu dobiti session za rad sa hibernate
    public Obrada() {
        this.session=HibernateUtil.getSessionFactory().openSession();
    }
      
   
    public T create()throws EdunovaException{
        kontrolaCreate();
        save();
        return entitet;
    }
    public T createAll(List<T> lista) throws EdunovaException {
        session.beginTransaction();
        for (T t : lista) {
            setEntitet(t);
            kontrolaCreate();
            session.save(t);
        }
        session.getTransaction().commit();
       
      
        return entitet;
    }

   
    
    public T update()throws EdunovaException{
        kontrolaUpdate();
        save();
        return entitet;
    }
    
    public boolean delete() throws EdunovaException{
        kontrolaDelete();
        session.beginTransaction();
        session.delete(entitet);
        session.getTransaction().commit();
        return true;
    }
    
    // metoda za save
    public void save(){
        session.beginTransaction();
        session.save(entitet);
        session.getTransaction().commit();
    }
     public T getEntitet() {
        return entitet;
    }

    public void setEntitet(T entitet) {
        this.entitet = entitet;
    }
   
}
