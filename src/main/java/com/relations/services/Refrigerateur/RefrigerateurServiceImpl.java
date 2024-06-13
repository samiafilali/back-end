package com.relations.services.Refrigerateur;

import com.relations.model.Refrigerateur;
import com.relations.repo.RefrigerateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class RefrigerateurServiceImpl implements RefrigerateurService {

    private final RefrigerateurRepository refrigerateurRepository;

    @Autowired
    public RefrigerateurServiceImpl(RefrigerateurRepository refrigerateurRepository) {
        this.refrigerateurRepository = refrigerateurRepository;
    }

    public List<Refrigerateur> getAllRefrigerateurs() {
        return refrigerateurRepository.findAll();
    }

    @Override
    public Optional<Refrigerateur> getRefrigerateurById(int id) {
        return refrigerateurRepository.findById(id);
    }

    @Override
    public Refrigerateur saveRefrigerateur(Refrigerateur refrigerateur) {
        return refrigerateurRepository.save(refrigerateur);
    }

    @Override
    public void deleteRefrigerateur(int id) {
        refrigerateurRepository.deleteById(id);
    }

   
}