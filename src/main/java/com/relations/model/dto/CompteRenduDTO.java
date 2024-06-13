
package com.relations.model.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CompteRenduDTO {
  private int id;

  @NotBlank(message = "Le compte rendu est obligatoire")
  private String texte;
  
  
  @JsonIgnoreProperties("compteRendus")
  private UtilisateurDTO technicien;

  

}
