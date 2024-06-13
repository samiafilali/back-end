package com.relations.services.CompteRendu;

import com.relations.model.CompteRendu;
import java.util.List;
import java.util.Optional;

public interface CompteRenduService {
    List<CompteRendu> getAllCompteRendus();
    Optional<CompteRendu> getCompteRenduById(int id);
    CompteRendu saveCompteRendu(CompteRendu compteRendu);
    void deleteCompteRendu(int id);
}