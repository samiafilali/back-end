package com.relations.mappers;

import org.modelmapper.ModelMapper;

import com.relations.model.Capteur;
import com.relations.model.dto.CapteurDTO;

public class CapteurMapper {
	private static final ModelMapper modelMapper= new ModelMapper();
	public static CapteurDTO convertToDTO(Capteur utilisateur)
	{
	return modelMapper.map(utilisateur, CapteurDTO.class);
	}

	public static Capteur convertToEntity(CapteurDTO utilisateurDTO)
	{
	return modelMapper.map(utilisateurDTO, Capteur.class);	
	}

}
