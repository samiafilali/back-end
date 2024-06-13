package com.relations.model.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.relations.model.Grades;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UtilisateurDTO {
	private int id;
@Size (min=3,max=30,message="ne doit pas avoir moins 3 carractéres et max=30")
@NotBlank
	private String nom;
@Email(message="l'email doit être valide")
private String email;
@Size (min=6,message="ne doit pas avoir moins 6 carractéres")
private String  motDePasse;
@Pattern(regexp = "^\\d+$", message = "Le numéro de téléphone doit être composé uniquement de chiffres.")
@Size(min = 8, max = 15, message = "Le numéro de téléphone doit avoir entre 8 et 11 chiffres.")
private String numTelephone;
@NotNull(message = "Le grade ne doit pas être null.")
private Grades grades;
@JsonIgnoreProperties("technicien")
private List<CompteRenduDTO> compteRendus;
}
