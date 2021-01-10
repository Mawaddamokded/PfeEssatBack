package com.mini.projet.essat.gestionpfe.repository;

import com.mini.projet.essat.gestionpfe.domaine.Categorie;
import com.mini.projet.essat.gestionpfe.domaine.Pfe;

import java.util.List;

public interface PfeRepository {

    public void addPFE(Pfe pfe);
    public void deletePFE(Pfe pfe);
    public List<Pfe> listPfes();
    public List<Categorie> categorie();

}
