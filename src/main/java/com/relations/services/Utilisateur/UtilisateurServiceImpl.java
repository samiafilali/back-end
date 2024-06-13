package com.relations.services.Utilisateur;
import com.relations.mappers.UtilisateurMapper;
import com.relations.model.Utilisateur;
import com.relations.model.dto.UtilisateurDTO;
import com.relations.repo.UtilisateurRepository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {
 
	@Autowired
	private UtilisateurRepository utilisateurRepository;
	
    @Override
	public UtilisateurDTO getOneUtilisateur(String email) {
		return UtilisateurMapper.convertToDTO(utilisateurRepository.findByEmail(email).orElse(null));
	
	}
	
    @Override
	public UtilisateurDTO addUtilisateur(Utilisateur utilisateur) {
		return UtilisateurMapper.convertToDTO(utilisateurRepository.save(utilisateur));
	}
    
    @Override
    public List<UtilisateurDTO> getAllUsers() {
    	 List<Utilisateur> users=utilisateurRepository.findAll();
    	 List<UtilisateurDTO> utilisateurs=new ArrayList<UtilisateurDTO>();
    	 users.forEach(us->{
    		 utilisateurs.add(UtilisateurMapper.convertToDTO(us));
    	 });
    	 return utilisateurs;
    }
	
    @Override
    public UtilisateurDTO getUtilisateur(int id) {
    	return UtilisateurMapper.convertToDTO(utilisateurRepository.findById(id).orElse(null));
    	
    }
    @Override
    public void deleteOne(int id)
    {
    	 utilisateurRepository.deleteById(id);
    }

	
}
