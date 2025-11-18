import java.util.Objects;

public class Departement implements Comparable<Departement>{
    int id;
    String nomDep;
    int nbEmployees;

    public Departement(){}

    public Departement(int id, String nomDep, int nbEmployees) {
        this.id = id;
        this.nomDep = nomDep;
        this.nbEmployees = nbEmployees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDep() {
        return nomDep;
    }

    public void setNomDep(String nomDep) {
        this.nomDep = nomDep;
    }

    public int getNbEmployees() {
        return nbEmployees;
    }

    public void setNbEmployees(int nbEmployees) {
        this.nbEmployees = nbEmployees;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDep='" + nomDep + '\'' +
                ", nbEmployees=" + nbEmployees +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Departement that = (Departement) o;
        return getId() == that.getId() && getNbEmployees() == that.getNbEmployees() && Objects.equals(getNomDep(), that.getNomDep());
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + id;
        hash = 31 * hash + nomDep.hashCode();
        return hash;
    }

    @Override
    public int compareTo(Departement o) {

        return this.id-o.id;
    }
}
