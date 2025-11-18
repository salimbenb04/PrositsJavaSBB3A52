import java.util.Comparator;

public class NomComparator implements Comparator<Departement> {
    @Override
    public int compare(Departement o1, Departement o2) {
        return o1.getNomDep().compareTo(o2.getNomDep());
    }
}
