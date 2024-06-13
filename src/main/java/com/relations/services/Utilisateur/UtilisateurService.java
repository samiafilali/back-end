package com.relations.services.Utilisateur;
import java.util.List;
import com.relations.model.Utilisateur;
import com.relations.model.dto.UtilisateurDTO;
public interface UtilisateurService {
	public UtilisateurDTO getOneUtilisateur (String email);
	public UtilisateurDTO addUtilisateur (Utilisateur utilisateur);
	public List<UtilisateurDTO> getAllUsers();
	public UtilisateurDTO getUtilisateur (int id);
	public void deleteOne(int id);
}
