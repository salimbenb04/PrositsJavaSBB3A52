import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe>,IRechercheAvancee<Employe>{

    ArrayList<Employe> employees =new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe emp) {
        employees.add(emp);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe emp : employees) {
            if (emp.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return rechercherEmploye(employe.getNom());
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        employees.remove(employe);
    }

    @Override
    public void dsiplayEmploye() {
        for (Employe emp : employees) {
            System.out.println(emp.toString());
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employees);
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        //on n'a pas etudier cela
    }

    @Override
    public List<Employe> rechercheDepartement(String nomDepartement) {
        return List.of();
    }
}
