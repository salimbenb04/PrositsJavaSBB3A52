import java.util.Comparator;

public class NbEmpComparator implements Comparator<Departement> {
    @Override
    public int compare(Departement o1, Departement o2) {
        return o1.getNbEmployees()-o2.getNbEmployees() ;
    }
}
