public interface IDepartement<T> {
    void ajouterDepartement(T t);
    boolean rechercherDepartement(String nomDep);
    boolean rechercherDepartement(T t);
    void supprimerDepartement(T t);
    void afficherDepartement();
    void trierDepartement();
    void trierDepartementParNomEtNbEmpl();

}
