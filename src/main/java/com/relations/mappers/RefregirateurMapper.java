package com.relations.mappers;

import org.modelmapper.ModelMapper;

import com.relations.model.Refrigerateur;
import com.relations.model.dto.RefrigerateurDTO;


public class RefregirateurMapper {
	private static final ModelMapper modelMapper= new ModelMapper();
	public static RefrigerateurDTO convertToDTO(Refrigerateur refregirateur)
	{
	return modelMapper.map(refregirateur, RefrigerateurDTO.class);
	}

	public static Refrigerateur convertToEntity(RefrigerateurDTO refregirateurDTO)
	{
	return modelMapper.map(refregirateurDTO, Refrigerateur.class);	
	}

}
