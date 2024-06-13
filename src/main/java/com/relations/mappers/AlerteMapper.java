package com.relations.mappers;

import org.modelmapper.ModelMapper;

import com.relations.model.Alerte;
import com.relations.model.dto.AlerteDTO;

public class AlerteMapper {
	private static final ModelMapper modelMapper= new ModelMapper();
	public static AlerteDTO convertToDTO(Alerte alerte)
	{
	return modelMapper.map(alerte, AlerteDTO.class);
	}

	public static Alerte convertToEntity(AlerteDTO alerteDTO)
	{
	return modelMapper.map(alerteDTO, Alerte.class);	
	}

}
