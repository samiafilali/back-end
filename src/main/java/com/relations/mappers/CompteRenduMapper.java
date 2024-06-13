package com.relations.mappers;

import org.modelmapper.ModelMapper;

import com.relations.model.CompteRendu;
import com.relations.model.dto.CompteRenduDTO;

public class CompteRenduMapper {
	private static final ModelMapper modelMapper= new ModelMapper();
	public static CompteRenduDTO convertToDTO(CompteRendu compteRendu)
	{
	return modelMapper.map(compteRendu, CompteRenduDTO.class);
	}

	public static CompteRendu convertToEntity(CompteRenduDTO compteRenduDTO)
	{
	return modelMapper.map(compteRenduDTO, CompteRendu.class);	
	}

}
