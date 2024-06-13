package com.relations.model.dto;

import jakarta.validation.constraints.Negative;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class RefrigerateurDTO {
    private Long id;

    @NotBlank(message = "Le label ne doit pas être vide")
    private String label;

    private String emplacement;

    @Positive(message = "La température maximale doit être un nombre positif")
    private int temperatureMax;

    @Negative(message = "La température minimale doit être un nombre négatif")
    private int temperatureMin;
}