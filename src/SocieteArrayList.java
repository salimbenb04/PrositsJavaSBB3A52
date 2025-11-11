import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe> {

    List<Employe> emp=new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe employe) {
        emp.add(employe);

    }

    @Override
    public boolean rechercherEmploye(String n) {
        for  (Employe e : emp) {
            if(e.getNom().equals(n)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return emp.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        emp.remove(employe);
    }

    @Override
    public void displayEmploye() {
        for   (Employe e : emp) {
            System.out.println(e.toString());
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(emp);
    }

    @Override
    public void trierEmployeParNomDepartEtGrade() {
        Collections.sort(emp, new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                int result = e1.getNom().compareToIgnoreCase(e2.getNom());
                if (result != 0) return result;

                result = e1.getNomDepart().compareToIgnoreCase(e2.getNomDepart());
                if (result != 0) return result;
                
                return Integer.compare(e1.getGrade(), e2.getGrade());
            }
        });
    }

}
