package com.relations.model.dto;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class AlerteDTO {
  private Long id;
  private String refrigerateurLabel; 
  private Date timestamp;
  private String value;

  @Pattern(regexp = "^(TEMPERATURE|HUMIDITE)$", message = "Le type d'alerte doit être l'un des suivants : TEMPERATURE, HUMIDITE")
  private String type;

  @Pattern(regexp = "^(TEMPERATURE_HAUTE|TEMPERATURE_BASSE|HUMIDITE_HAUTE|HUMIDITE_BASSE)$", message = "Le type d'alerte doit être l'un des suivants : TEMPERATURE_HAUTE, TEMPERATURE_BASSE, HUMIDITE_HAUTE,HUMIDITE_BASSE")
  private String status;

  @NotNull(message = "La liste de réfrigérateurs ne doit pas être nulle")
  @Size(min = 1, message = "La liste de réfrigérateurs doit contenir au moins un élément")
  @Valid
  private List<Long> refrigerateurIds;
}
