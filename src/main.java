import java.util.*;
class Main {
    public static void main(String[] args) {
        AffectationHashMap affectations = new AffectationHashMap();

        // Create employees
        Employe e1 = new Employe(1, "Alice", 3000);
        Employe e2 = new Employe(2, "Bob", 2800);
        Employe e3 = new Employe(3, "Charlie", 3500);

        // Create departments
        Departement d1 = new Departement(101, "IT");
        Departement d2 = new Departement(102, "RH");
        Departement d3 = new Departement(103, "Finance");

        // Test 1: Add employees to departments
        System.out.println("--- Test 1: Ajout d'affectations ---");
        affectations.ajouterEmployeDepartement(e1, d1);
        affectations.ajouterEmployeDepartement(e2, d2);
        affectations.ajouterEmployeDepartement(e3, d3);

        affectations.afficherEmployesEtDepartements();

        // Test 2: Try to add the same employee to a different department
        System.out.println("\n--- Test 2: Tentative d'ajout du même employé à deux départements ---");
        affectations.ajouterEmployeDepartement(e1, d2);
        System.out.println("Observation: Un employé ne peut être affecté qu'à un seul département.");

        // Test 3: Display employees
        affectations.afficherEmployes();

        // Test 4: Display departments
        affectations.afficherDepartements();

        // Test 5: Search for an employee
        System.out.println("\n--- Test 3: Recherche d'employé ---");
        System.out.println("Recherche Alice: " + affectations.rechercherEmploye(e1));
        System.out.println("Recherche nouvel employé: " + affectations.rechercherEmploye(new Employe(4, "David", 2500)));

        // Test 6: Search for a department
        System.out.println("\n--- Test 4: Recherche de département ---");
        System.out.println("Recherche IT: " + affectations.rechercherDepartement(d1));
        System.out.println("Recherche Marketing: " + affectations.rechercherDepartement(new Departement(104, "Marketing")));

        // Test 7: Remove specific assignment
        System.out.println("\n--- Test 5: Suppression d'affectation ---");
        affectations.supprimerEmployeEtDepartement(e2, d2);
        affectations.afficherEmployesEtDepartements();

        // Test 8: Sort by employee ID
        System.out.println("\n--- Test 6: Tri par ID employé ---");
        TreeMap<Employe, Departement> triee = affectations.trierMap();
        System.out.println("Affectations triées par ID:");
        for (Map.Entry<Employe, Departement> entry : triee.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Test 9: Remove an employee
        System.out.println("\n--- Test 7: Suppression d'employé ---");
        affectations.supprimerEmploye(e3);
        affectations.afficherEmployesEtDepartements();
    }
}