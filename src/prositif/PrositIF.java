/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prositif;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Majd Tabessi
 */
public class PrositIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        List<Etudiant> etudiants = new ArrayList<>();
        etudiants.add(new Etudiant(1, "souayeh", 15));
        etudiants.add(new Etudiant(2, "majd", 22));
        etudiants.add(new Etudiant(55, "yacine", 112));
        etudiants.add(new Etudiant(569, "fahd", 150));
        ListeEtudiant listeEtudiant = new ListeEtudiant();

        listeEtudiant.afficherEtudiants(etudiants, t -> System.out.println(t));
        listeEtudiant.afficherEtudiantsSelonFiltre(etudiants, x -> x.getAge() >= 20 && x.getAge() <= 40, t -> System.out.println(t));

        System.out.println(listeEtudiant.afficherNomEtudiant(etudiants, (t) -> t.getNom()));

        Etudiant createdEtudiant = listeEtudiant.creeEtudiant(() -> new Etudiant());

    }

}
