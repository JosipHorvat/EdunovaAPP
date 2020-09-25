/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.edunova.start;

/**
 *
 * @author Josip
 */
public class BrisanjeGdjePostojiStraniKljuc {
    /*
    U grupi imamo kljuc od smjera i stoga se nista od smjerova ne moze obrisati dok je 
    taj smjer u nekoj grupi. 
    Stoga cinimo sljedece: 
    
    U Smjer dodajemo 
    
    @OneToMany(mappedBy = "smjer")
    private List<Grupa> grupe = new ArrayList<>();
    
    Kazemo da je grupa mapirana od smjera jer to doista i je 
    ako pogledas u grupu naci ces 
    @ManyToOne
    private Smjer smjer;
    
    Nakon svega idemo u obradaSmjer te kazemo u delete:
    
     @Override
    protected void kontrolaDelete() throws EdunovaException {
        if(entitet.getGrupe().size()>0){
            throw new EdunovaException("Smjer se ne može obrisati jer ima jednu ili više grupa");
    */
}
