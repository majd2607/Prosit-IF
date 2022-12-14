/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prositif;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
import static jdk.nashorn.internal.objects.NativeFunction.function;

/**
 *
 * @author Majd Tabessi
 */
public class ListeEtudiant implements GestionEtudiant{

    @Override
    public void afficherEtudiants(List<Etudiant> etudiants, Consumer<Etudiant> consumer) {
    for (Etudiant e : etudiants) {
            consumer.accept(e);
        }
    }

    @Override
    public void afficherEtudiantSelonFiltre(List<Etudiant> etudiants, Predicate<Etudiant> predicate, Consumer<Etudiant> cons) {
     for (Etudiant e : etudiants) {
            if(predicate.test(e)){
                consumer.accept(e);
            }            
        }
    }

    @Override
    public String afficherNomEtudiant(List<Etudiant> etudiants, Function<Etudiant, String> f) {
    String nomsEtudiant = "";  
        for (Etudiant e : etudiants) {
            nomsEtudiant+= "\n"+function.apply(e);
        }
        return nomsEtudiant;
    
    }

    @Override
    public Etudiant creeEtudiant(Supplier<Etudiant> supp) {
    return  supplier.get();
    
    }

    @Override
    public Stream convertListStream(List<Etudiant> l) {
     return etudiants.stream();
    }
    
}
