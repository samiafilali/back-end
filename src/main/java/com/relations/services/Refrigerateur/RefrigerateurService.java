package com.relations.services.Refrigerateur;

import com.relations.model.Refrigerateur;
import java.util.List;
import java.util.Optional;

public interface RefrigerateurService {
    List<Refrigerateur> getAllRefrigerateurs();
    Optional<Refrigerateur> getRefrigerateurById(int id);
    Refrigerateur saveRefrigerateur(Refrigerateur refrigerateur);
    void deleteRefrigerateur(int id);
}