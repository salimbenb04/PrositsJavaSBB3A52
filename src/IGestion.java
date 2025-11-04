public interface IGestion<T> {
    void ajouterEmploye(T t);
    boolean rechercherEmploye(String nom);
    boolean rechercherEmploye(T t);
    void supprimerEmploye(T t);
    void dsiplayEmploye();
    void trierEmployeParId();
    void trierEmployeParNomDepartementEtGrade();
}
