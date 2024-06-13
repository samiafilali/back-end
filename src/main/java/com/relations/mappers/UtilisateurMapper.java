package com.relations.mappers;

import org.modelmapper.ModelMapper;

import com.relations.model.Utilisateur;
import com.relations.model.dto.UtilisateurDTO;



public class UtilisateurMapper {
	private static final ModelMapper modelMapper= new ModelMapper();
	public static UtilisateurDTO convertToDTO(Utilisateur utilisateur)
	{
	return modelMapper.map(utilisateur, UtilisateurDTO.class);
	}

	public static Utilisateur convertToEntity(UtilisateurDTO utilisateurDTO)
	{
	return modelMapper.map(utilisateurDTO, Utilisateur.class);	
	}

}