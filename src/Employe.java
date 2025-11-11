import java.util.*;

public class Employe implements Comparable<Employe>, Comparator<Employe> {
    int id;
    String nom;
    String prenom;
    String nomDepart;
    int grade;

    public Employe(){}

    public Employe(int id, String nom, String prenom, String nomDepart, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDepart = nomDepart;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomDepart() {
        return nomDepart;
    }

    public void setNomDepart(String nomDepart) {
        this.nomDepart = nomDepart;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomDepart='" + nomDepart + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compare(Employe o1, Employe o2) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return getId() == employe.getId() && getGrade() == employe.getGrade() && Objects.equals(getNom(), employe.getNom()) && Objects.equals(getPrenom(), employe.getPrenom()) && Objects.equals(getNomDepart(), employe.getNomDepart());
    }

    @Override
    public int compareTo(Employe e){
        return this.getId() - e.getId();
    }

}
