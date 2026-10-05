package tn.esprit.autoloc.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.autoloc.entities.enumerations.RoleEmploye;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmploye;
    private String nomEmploye;
    private String prenomEmploye;
    private RoleEmploye roleEmploye;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employe")
    private Set<Agence> Agences;
}
