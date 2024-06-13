package com.relations.services.CompteRendu;

import com.relations.model.CompteRendu;
import com.relations.repo.CompteRenduRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CompteRenduServiceImpl implements CompteRenduService {

    private final CompteRenduRepository compteRenduRepository;

    @Autowired
    public CompteRenduServiceImpl(CompteRenduRepository compteRenduRepository) {
        this.compteRenduRepository = compteRenduRepository;
    }

    @Override
    public List<CompteRendu> getAllCompteRendus() {
        return compteRenduRepository.findAll();
    }

    @Override
    public Optional<CompteRendu> getCompteRenduById(int id) {
        return compteRenduRepository.findById(id);
    }

    @Override
    public CompteRendu saveCompteRendu(CompteRendu compteRendu) {
        return compteRenduRepository.save(compteRendu);
    }

    @Override
    public void deleteCompteRendu(int id) {
        compteRenduRepository.deleteById(id);
    }


}