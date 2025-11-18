import java.util.*;

public class DepartementHashSet implements IDepartement<Departement> {

    Set<Departement> dep=new HashSet<>();
    Iterator<Departement> it=dep.iterator();

    @Override
    public void ajouterDepartement(Departement departement) {
        dep.add(departement);

    }

    @Override
    public boolean rechercherDepartement(String nomDep) {
        while(it.hasNext()){
            if(it.next().getNomDep().equals(nomDep)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        while(it.hasNext()){
            if(it.next().equals(departement)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        dep.remove(departement);

    }

    @Override
    public void afficherDepartement() {
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

    @Override
    public void trierDepartement() {
        TreeSet<Departement> t=new TreeSet<>(dep);
        t.addAll(dep);
        System.out.println(t);

    }

    @Override
    public void trierDepartementParNomEtNbEmpl() {
        TreeSet<Departement> t=new TreeSet<>(new NomComparator().thenComparing(new NbEmpComparator()));
        t.addAll(dep);
        System.out.println(t);

    }
}
