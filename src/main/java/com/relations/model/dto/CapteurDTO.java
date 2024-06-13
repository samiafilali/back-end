package com.relations.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CapteurDTO {
    private int id;

    @NotNull(message = "La valeur ne doit pas être nulle")
    private float valeur;

    @NotBlank(message = "Le type ne doit pas être vide")
    private String type;
}