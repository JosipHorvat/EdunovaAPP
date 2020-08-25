
package hr.edunova.horvatzavrsnirad;


public class Upute {
    /*
    1. Novi projekt java with maven
    2. Versioning -> Initialize git repository 
    3. Git repozitorij na netu (Niti ignore niti read me), sve mora biti prazno
    4. Git commit prvo
    5. Git -> remote -> push
    
    Svaki iduci put: git commit, git push to upstream.
    
   
   ################ 1: Project files pom.xml  ################
    
    <!-- Obavezno jedan element dependencies  -->
    <dependencies>
        <!--OVDJE SE DODAJU ZAVISNOSTI -->
        <!-- https://mvnrepository.com/artifact/org.mariadb.jdbc/mariadb-java-client -->
    link gdje se pronadje maria db driver
<dependency>
    <groupId>org.mariadb.jdbc</groupId>
    <artifactId>mariadb-java-client</artifactId>
    <version>2.6.2</version>
</dependency>

   NAKON STO DODAM OVO POJAVIT CE MII SE U FILES TARGET KOJI NE POSTAVLJA NA GIT ODREDJENE FILEOVE
    
    
    
    U SLUCAJU GRESKE u vezi github: team ->  rever modidfication ->  revert
    
    ##################2.  ORM java hibernate ##################
   
    mapiranje java klase na tablice baze podataka. 
    Alat hibernate se koristi da to uradi. 
    Googlaj Hibernate maven
    
    dependency>
    <groupId>org.hibernate</groupId>
    <artifactId>hibernate-core</artifactId>
    <version>5.4.20.Final</version>
</dependency>
    
    ##########3. dodati u files -> src main gdje je java novi folder resources ###########
    tu ide konfiguracija za hibernate 
    omogocuje da se zna fdje je baza, kako se radi sa bazom.
    file se zove hibernate.cfg
    
    Otvoriti file, napraviti novu bazu i pratiti upute i izmjeniti sto je potrebno
    Nakon toga u paketu utility napraviti novu klasu hibernateUtil
    kod sam kopirao i nalazi se tamo.
    
    ######### 4. U klasu Osoba  ##########
    import javax.persistence.Entity
    
    @Entity
    @Table(name="osoba")
    
    *******5 ***********
    tools options misc janitor run janitor now
    
    
    VAZNO 
    U ovom slucaju idem na D apacheNetbeansWorkspace te ulazim u projekt, 
    TARGET
    unutra ce se nekad podatci poremetiti 
    Tad mogu sve da obrisem 
    Nakon toga clean and build pa ce se sve ponovno kreirati i vratit u normalu.
    */




}
