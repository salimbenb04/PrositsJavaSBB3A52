import java.util.*;
class AffectationHashMap {
    private HashMap<Employe, Departement> affectations;

    public AffectationHashMap() {
        this.affectations = new HashMap<>();
    }

    // 2. Assign an employee to a department
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        if (affectations.containsKey(e)) {
            System.out.println("Attention: L'employé " + e.getNom() +
                    " est déjà affecté au département " +
                    affectations.get(e).getNom());
            return;
        }
        affectations.put(e, d);
        System.out.println("Employé " + e.getNom() + " affecté au département " + d.getNom());
    }

    // 3. Display all employees and their departments
    public void afficherEmployesEtDepartements() {
        System.out.println("\n=== Affectations Employés-Départements ===");
        if (affectations.isEmpty()) {
            System.out.println("Aucune affectation.");
            return;
        }
        for (Map.Entry<Employe, Departement> entry : affectations.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // 4. Remove an employee
    public void supprimerEmploye(Employe e) {
        if (affectations.remove(e) != null) {
            System.out.println("Employé " + e.getNom() + " supprimé.");
        } else {
            System.out.println("Employé " + e.getNom() + " non trouvé.");
        }
    }

    // 5. Remove a specific employee-department assignment
    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (affectations.containsKey(e)) {
            if (affectations.get(e).equals(d)) {
                affectations.remove(e);
                System.out.println("Affectation supprimée: " + e.getNom() +
                        " n'est plus affecté à " + d.getNom());
            } else {
                System.out.println("L'employé " + e.getNom() +
                        " n'est pas affecté au département " + d.getNom());
            }
        } else {
            System.out.println("Employé " + e.getNom() + " non trouvé.");
        }
    }

    // 6. Display all employees
    public void afficherEmployes() {
        System.out.println("\n=== Liste des Employés ===");
        if (affectations.isEmpty()) {
            System.out.println("Aucun employé.");
            return;
        }
        for (Employe e : affectations.keySet()) {
            System.out.println(e);
        }
    }

    // 7. Display all departments
    public void afficherDepartements() {
        System.out.println("\n=== Liste des Départements ===");
        if (affectations.isEmpty()) {
            System.out.println("Aucun département.");
            return;
        }
        Set<Departement> departements = new HashSet<>(affectations.values());
        for (Departement d : departements) {
            System.out.println(d);
        }
    }

    // 8. Search for an employee
    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }

    // 9. Search for a department
    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);
    }

    // 10. Sort employees by their ID
    public TreeMap<Employe, Departement> trierMap() {
        TreeMap<Employe, Departement> triee = new TreeMap<>((e1, e2) ->
                Integer.compare(e1.getId(), e2.getId()));
        triee.putAll(affectations);
        return triee;
    }
}
