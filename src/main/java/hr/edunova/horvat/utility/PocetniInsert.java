
package hr.edunova.horvat.utility;

import hr.edunova.horvat.model.Smjer;
import java.math.BigDecimal;
import org.hibernate.Session;

/**
 *
 * @author Josip
 */
public class PocetniInsert {
    
    public static void izvedi(){
        Session session = HibernateUtil.getSessionFactory().openSession();
   Smjer java = kreirajSmjer("Java programiranje", "Uce se java, sql itd...", new BigDecimal(4999.99), true);
   Smjer php = kreirajSmjer("PHP programiranje", "Loren ipsium", new BigDecimal(4000), false);
   
   session.beginTransaction();
   session.save(java);
   session.save(php);
   session.getTransaction().commit();
   
   
    }
    
    private static Smjer kreirajSmjer(String naziv, String opis, BigDecimal cijena, Boolean verificiran){
      
        Smjer smjer = new Smjer();
    smjer.setNaziv(naziv);
    smjer.setOpis(opis);
    smjer.setCijena(cijena);
    smjer.setVerificiran(verificiran);
    
    return smjer;
    }
}
